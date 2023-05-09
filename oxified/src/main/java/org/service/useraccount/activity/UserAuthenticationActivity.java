package main.java.org.service.useraccount.activity;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.org.exceptions.UserAccntNotFoundException;
import main.java.org.service.useraccount.converter.ModelConverter;
import main.java.org.service.useraccount.dynamodb.UserAccountDao;
import main.java.org.service.useraccount.dynamodb.model.UserAccount;
import main.java.org.service.useraccount.model.UserAccountModel;
import main.java.org.service.useraccount.model.request.UserAuthenticationRequest;
import main.java.org.service.useraccount.model.result.GetUserAccountResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;

public class UserAuthenticationActivity implements RequestHandler<UserAuthenticationRequest, GetUserAccountResult> {
    private final UserAccountDao userAccountDao;
    private final Logger log = LogManager.getLogger();
    @Inject
    public UserAuthenticationActivity(UserAccountDao userAccountDao) {
        this.userAccountDao = userAccountDao;
    }

    /**
     * Handles a Lambda Function request
     *
     * @param input   The Lambda Function input
     * @param context The Lambda execution environment context object.
     * @return The Lambda Function output
     */
    @Override
    public GetUserAccountResult handleRequest(UserAuthenticationRequest input, Context context) {
        log.info("Received Authentication Request {}", input);
        String email = input.getEmail();
        String password = input.getPassword();
        UserAccount userAccount = userAccountDao.authenticateUser(email, password);
        if(userAccount == null) {
            throw new UserAccntNotFoundException("User Account does not exist.");
        }
        UserAccountModel userAccountModel = new ModelConverter().toUserAccountModel(userAccount);
        return GetUserAccountResult.builder()
                .withUserAccount(userAccountModel)
                .build();
    }
}
