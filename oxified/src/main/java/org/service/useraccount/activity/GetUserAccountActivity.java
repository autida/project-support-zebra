package main.java.org.service.useraccount.activity;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.org.service.useraccount.converter.ModelConverter;
import main.java.org.service.useraccount.dynamodb.UserAccountDao;
import main.java.org.service.useraccount.dynamodb.model.UserAccount;
import main.java.org.service.useraccount.model.UserAccountModel;
import main.java.org.service.useraccount.model.request.GetUserAccountRequest;
import main.java.org.service.useraccount.model.result.GetUserAccountResult;
import main.java.org.service.useraccount.util.UserAccountServiceUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;

public class GetUserAccountActivity implements RequestHandler<GetUserAccountRequest, GetUserAccountResult> {
    private final UserAccountDao userAccountDao;
    private final Logger log = LogManager.getLogger();
    @Inject
    public GetUserAccountActivity(UserAccountDao userAccountDao) {
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
    public GetUserAccountResult handleRequest(GetUserAccountRequest input, Context context) {
        log.info("Received GetUserAccountRequest {}", input);
        String requestId = input.getUaId();
        String userType = input.getUserType();
        UserAccount userAccount = userAccountDao.getUserAccount(requestId, userType);

        UserAccountModel userAccountModel = new ModelConverter().toUserAccountModel(userAccount);
        return GetUserAccountResult.builder()
                .withUserAccount(userAccountModel)
                .build();
    }
}
