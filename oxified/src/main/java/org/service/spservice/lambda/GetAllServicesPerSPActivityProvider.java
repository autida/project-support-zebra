package main.java.org.service.spservice.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.org.dependency.DaggerServiceComponent;
import main.java.org.dependency.ServiceComponent;
import main.java.org.service.spservice.models.request.GetServiceRequest;
import main.java.org.service.spservice.models.result.GetAllServicesPerSPResult;

public class GetAllServicesPerSPActivityProvider implements RequestHandler<GetServiceRequest, GetAllServicesPerSPResult> {
    /**
     * Handles a Lambda Function request
     *
     * @param input   The Lambda Function input
     * @param context The Lambda execution environment context object.
     * @return The Lambda Function output
     */
    @Override
    public GetAllServicesPerSPResult handleRequest(GetServiceRequest input, Context context) {
        return getService().provideGetAllServicesPerSPActivity().handleRequest(input, context);
    }
    private ServiceComponent getService() {
        ServiceComponent component = DaggerServiceComponent.create();
        return component;
    }
}
