package main.java.org.service.useraccount.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.org.dependency.DaggerServiceComponent;
import main.java.org.dependency.ServiceComponent;
import main.java.org.service.useraccount.model.request.GetUserAccountRequest;
import main.java.org.service.useraccount.model.result.GetUserAccountResult;

public class GetUserAccountProvider implements RequestHandler<GetUserAccountRequest, GetUserAccountResult> {

    public GetUserAccountProvider() {
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
        return getService().provideGetUserAccountActivity().handleRequest(input, context);
    }

    private ServiceComponent getService() {
        ServiceComponent component = DaggerServiceComponent.create();
        return component;
    }
}
