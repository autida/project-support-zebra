package main.java.org.service.useraccount.activity;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.org.exceptions.UserAccntNotFoundException;
import main.java.org.service.useraccount.converter.ModelConverter;
import main.java.org.service.useraccount.dynamodb.UserAccountDao;
import main.java.org.service.useraccount.dynamodb.model.UserAccount;
import main.java.org.service.useraccount.model.request.UpdateUserAccountRequest;
import main.java.org.service.useraccount.model.result.UpdateUserAccountResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;


public class UpdateUserAccountActivity  implements RequestHandler<UpdateUserAccountRequest, UpdateUserAccountResult> {
    private final Logger log = LogManager.getLogger();
    private final UserAccountDao userAccountDao;
    @Inject
    public UpdateUserAccountActivity(UserAccountDao userAccountDao) {
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
    public UpdateUserAccountResult handleRequest(UpdateUserAccountRequest input, Context context) {
        log.info("Received UpdateUserAccountRequest {}", input);
        UserAccount userAccount = userAccountDao.getUserAccount(input.getUaId(), input.getUserType());
        if(userAccount == null) {
            throw new UserAccntNotFoundException("User account not found!");
        }
        userAccount.setPassword(input.getPassword());
        userAccount.setStatus(input.getStatus());
        userAccount.setEmail(input.getEmail());
        userAccount.setLastName(input.getLastName());
        userAccount.setFirstName(input.getFirstName());
        userAccount.setContactNumber(input.getContactNumber());
        userAccount.setAddress(input.getAddress());
        userAccount.setBirthdate(input.getBirthdate());
        userAccount.setGender(input.getGender());
        userAccount.setInbox(input.getInbox());
        userAccount.setBackgroundChecked(input.getBackgroundChecked());
        userAccount.setAccountStatus(input.getAccountStatus());
        userAccount.setBusinessHours(input.getBusinessHours());
        userAccount.setAvailability(input.getAvailability());
        return UpdateUserAccountResult.builder()
                .setUserAccount(new ModelConverter().toUserAccountModel(userAccountDao.saveUserAccount(userAccount)))
                .build();
    }
}
