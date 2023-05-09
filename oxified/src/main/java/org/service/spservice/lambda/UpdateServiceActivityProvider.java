package main.java.org.service.spservice.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.org.dependency.DaggerServiceComponent;
import main.java.org.dependency.ServiceComponent;
import main.java.org.service.spservice.models.ServiceModel;
import main.java.org.service.spservice.models.request.UpdateServiceRequest;
import main.java.org.service.spservice.models.result.UpdateServiceResult;

public class UpdateServiceActivityProvider implements RequestHandler<UpdateServiceRequest, UpdateServiceResult> {
    /**
     * Handles a Lambda Function request
     *
     * @param input   The Lambda Function input
     * @param context The Lambda execution environment context object.
     * @return The Lambda Function output
     */
   @Override
    public UpdateServiceResult handleRequest(UpdateServiceRequest input, Context context) {
        return getService().provideUpdateServiceActivity().handleRequest(input, context);
    }

    private ServiceComponent getService() {
        ServiceComponent component = DaggerServiceComponent.create();
        return component;
    }
}
