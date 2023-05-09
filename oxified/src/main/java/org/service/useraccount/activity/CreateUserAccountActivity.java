package main.java.org.service.useraccount.activity;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.org.enumeratedtype.Status;
import main.java.org.exceptions.InvalidAttributeValueException;
import main.java.org.service.useraccount.converter.ModelConverter;
import main.java.org.service.useraccount.dynamodb.UserAccountDao;
import main.java.org.service.useraccount.dynamodb.model.UserAccount;
import main.java.org.service.useraccount.model.request.CreateUserAccountRequest;
import main.java.org.service.useraccount.model.result.CreateUserAccountResult;
import main.java.org.service.useraccount.util.UserAccountServiceUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mindrot.jbcrypt.BCrypt;
import org.testng.collections.Sets;

import javax.inject.Inject;
import java.util.Set;

public class CreateUserAccountActivity implements RequestHandler<CreateUserAccountRequest, CreateUserAccountResult> {

    private final UserAccountDao userAccountDao;
    private final Logger log = LogManager.getLogger();
    @Inject
    public CreateUserAccountActivity(UserAccountDao userAccountDao) {
        this.userAccountDao = userAccountDao;
    }


    @Override
    public CreateUserAccountResult handleRequest(CreateUserAccountRequest createUserAccountRequest, Context context) {
        log.info("Received CreateUserAccountRequest {}", createUserAccountRequest);
        if(!UserAccountServiceUtils.isValidString(createUserAccountRequest.getEmail())){
            throw new InvalidAttributeValueException("Invalid Email.");
        }
        //user email should not be repeated
        Set<String> inboxes = null;
        if(createUserAccountRequest.getInboxes() != null) {
            inboxes = Sets.newHashSet(createUserAccountRequest.getInboxes());
        }
        UserAccount userAccount = new UserAccount();
        userAccount.setUaId(UserAccountServiceUtils.generateUaId());
        userAccount.setEmail(createUserAccountRequest.getEmail());
        userAccount.setPassword(BCrypt.hashpw(createUserAccountRequest.getPassword(), BCrypt.gensalt(12)));
        userAccount.setUserType(createUserAccountRequest.getUserType());
        userAccount.setStatus(String.valueOf(Status.INACTIVE));
        userAccount.setBookingId(UserAccountServiceUtils.generateBookingId());
        userAccount.setInbox(inboxes);

        return CreateUserAccountResult.builder()
                .withUserAccount(new ModelConverter().toUserAccountModel(userAccountDao.saveUserAccount(userAccount)))
                .build();
    }
}
