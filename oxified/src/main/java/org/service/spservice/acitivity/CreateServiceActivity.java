package main.java.org.service.spservice.acitivity;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.org.enumeratedtype.Status;
import main.java.org.exceptions.InvalidAttributeValueException;
import main.java.org.service.spservice.converter.ServiceConverter;
import main.java.org.service.spservice.dynamodb.ServiceDao;
import main.java.org.service.spservice.dynamodb.models.Service;
import main.java.org.service.spservice.models.ServiceModel;
import main.java.org.service.spservice.models.request.CreateServiceRequest;
import main.java.org.service.spservice.models.result.CreateServiceResult;
import main.java.org.service.spservice.util.ServiceUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;


public class CreateServiceActivity implements RequestHandler<CreateServiceRequest, CreateServiceResult> {
    private Logger log = LogManager.getLogger();
    private ServiceDao serviceDao;
    @Inject
    public CreateServiceActivity(ServiceDao serviceDao) {
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
    public CreateServiceResult handleRequest(CreateServiceRequest input, Context context) {
        log.info("Received CreateServiceRequest {}", input);
        if(!ServiceUtils.isValid(input.getDescription())) {
            throw new InvalidAttributeValueException();
        }
        Service service = new Service();
        service.setServiceId(ServiceUtils.generateServiceId());
        service.setUaId(input.getUaId());
        service.setDescription(input.getDescription());
        service.setServiceTypeCost(input.getServiceTypeCost());
        service.setServiceType(input.getServiceType());
        service.setStatus(String.valueOf(Status.AVAILABLE));
        service.setCategory(input.getCategory());
        ServiceModel serviceModel = ServiceConverter.toServiceModel(serviceDao.saveService(service));
        return CreateServiceResult.builder()
                .setServiceModel(serviceModel)
                .build();
    }
}
