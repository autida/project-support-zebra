package main.java.org.service.spservice.acitivity;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.org.service.spservice.converter.ServiceConverter;
import main.java.org.service.spservice.dynamodb.ServiceDao;
import main.java.org.service.spservice.dynamodb.models.Service;
import main.java.org.service.spservice.models.ServiceModel;
import main.java.org.service.spservice.models.request.GetServiceRequest;
import main.java.org.service.spservice.models.result.GetServiceResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;

public class GetServiceActivity implements RequestHandler<GetServiceRequest, GetServiceResult> {
    private Logger log = LogManager.getLogger();
    private ServiceDao serviceDao;

    @Inject
    public GetServiceActivity(ServiceDao serviceDao) {
        this.serviceDao = serviceDao;
    }
    /**
     * Handles a Lambda Function request
     *
     * @param input   The Lambda Function input
     * @param context The Lambda execution environment context object.
     * @return The Lambda Function output
     */
    @Override
    public GetServiceResult handleRequest(GetServiceRequest input, Context context) {
        log.info("Received GetServiceRequest {}", input);
        Service service = serviceDao.getService(input.getServiceId(), input.getUaId());

        ServiceModel serviceModel = ServiceConverter.toServiceModel(service);
        return GetServiceResult.builder()
                .setService(serviceModel)
                .build();
    }
}
