package main.java.org.service.message.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.org.dependency.DaggerServiceComponent;
import main.java.org.dependency.ServiceComponent;
import main.java.org.service.message.models.request.CreateMessageInboxRequest;
import main.java.org.service.message.models.results.CreateMessageInboxResult;

public class CreateMessageInboxProvider implements RequestHandler<CreateMessageInboxRequest, CreateMessageInboxResult> {
    /**
     * Handles a Lambda Function request
     *
     * @param input   The Lambda Function input
     * @param context The Lambda execution environment context object.
     * @return The Lambda Function output
     */
    @Override

    public CreateMessageInboxResult handleRequest(CreateMessageInboxRequest input, Context context) {
        return null;
    }
    private ServiceComponent getService() {
        ServiceComponent component = DaggerServiceComponent.create();
        return component;
    }
}
