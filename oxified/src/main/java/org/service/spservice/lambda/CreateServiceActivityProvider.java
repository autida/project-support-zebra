package main.java.org.service.spservice.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.org.dependency.DaggerServiceComponent;
import main.java.org.dependency.ServiceComponent;
import main.java.org.service.spservice.models.request.CreateServiceRequest;
import main.java.org.service.spservice.models.result.CreateServiceResult;

public class CreateServiceActivityProvider implements RequestHandler<CreateServiceRequest, CreateServiceResult> {
    /**
     * Handles a Lambda Function request
     *
     * @param input   The Lambda Function input
     * @param context The Lambda execution environment context object.
     * @return The Lambda Function output
     */
    @Override
    public CreateServiceResult handleRequest(CreateServiceRequest input, Context context) {
        return getService().provideCreateService().handleRequest(input, context);
    }
    private ServiceComponent getService() {
        ServiceComponent component = DaggerServiceComponent.create();
        return component;
    }
}
