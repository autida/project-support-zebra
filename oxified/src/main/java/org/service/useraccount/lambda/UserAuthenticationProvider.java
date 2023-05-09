package main.java.org.service.useraccount.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.org.dependency.DaggerServiceComponent;
import main.java.org.dependency.ServiceComponent;
import main.java.org.service.useraccount.model.request.UserAuthenticationRequest;
import main.java.org.service.useraccount.model.result.GetUserAccountResult;

public class UserAuthenticationProvider implements RequestHandler<UserAuthenticationRequest, GetUserAccountResult> {
    /**
     * Handles a Lambda Function request
     *
     * @param input   The Lambda Function input
     * @param context The Lambda execution environment context object.
     * @return The Lambda Function output
     */
    @Override
    public GetUserAccountResult handleRequest(UserAuthenticationRequest input, Context context) {
        return getService().provideUserAuthenticationActivity().handleRequest(input, context);
    }
    private ServiceComponent getService() {
        ServiceComponent component = DaggerServiceComponent.create();
        return component;
    }
}
