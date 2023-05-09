package main.java.org.service.useraccount.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.org.dependency.DaggerServiceComponent;
import main.java.org.dependency.ServiceComponent;
import main.java.org.service.useraccount.model.request.CreateUserAccountRequest;
import main.java.org.service.useraccount.model.result.CreateUserAccountResult;

public class CreateUserAccountProvider implements RequestHandler<CreateUserAccountRequest, CreateUserAccountResult> {
    public CreateUserAccountProvider() {
    }

    /**
     * Handles a Lambda Function request
     *
     * @param createUserAccountRequest   The Lambda Function input
     * @param context The Lambda execution environment context object.
     * @return The Lambda Function output
     */
    @Override
    public CreateUserAccountResult handleRequest(CreateUserAccountRequest createUserAccountRequest, Context context) {
        return getService().provideCreateUserAccountActivity().handleRequest(createUserAccountRequest, context);
    }

    private ServiceComponent getService() {
        ServiceComponent component = DaggerServiceComponent.create();
        return component;
    }
}
