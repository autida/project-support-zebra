package main.java.org.service.useraccount.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.org.dependency.DaggerServiceComponent;
import main.java.org.dependency.ServiceComponent;
import main.java.org.service.useraccount.model.request.UpdateUserAccountRequest;
import main.java.org.service.useraccount.model.result.UpdateUserAccountResult;

public class UpdateUserAccountProvider implements RequestHandler<UpdateUserAccountRequest, UpdateUserAccountResult> {
    public UpdateUserAccountProvider() {
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
        return getService().provideUpdateUserAccountActivity().handleRequest(input, context);
    }

    private ServiceComponent getService() {
        ServiceComponent component = DaggerServiceComponent.create();
        return component;
    }
}
