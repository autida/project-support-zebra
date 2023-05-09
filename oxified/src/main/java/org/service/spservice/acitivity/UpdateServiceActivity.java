package main.java.org.service.spservice.acitivity;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.org.exceptions.InvalidAttributeChangeException;
import main.java.org.exceptions.ServiceNotFoundException;
import main.java.org.service.spservice.converter.ServiceConverter;
import main.java.org.service.spservice.dynamodb.ServiceDao;
import main.java.org.service.spservice.dynamodb.models.Service;
import main.java.org.service.spservice.models.request.UpdateServiceRequest;
import main.java.org.service.spservice.models.result.UpdateServiceResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;

public class UpdateServiceActivity implements RequestHandler<UpdateServiceRequest, UpdateServiceResult> {
    private Logger log = LogManager.getLogger();
    private ServiceDao serviceDao;
    @Inject
    public UpdateServiceActivity(ServiceDao serviceDao) {
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
    public UpdateServiceResult handleRequest(UpdateServiceRequest input, Context context) {
        log.info("Received UpdateServiceRequest {}", input);
        Service service = serviceDao.getService(input.getServiceId(), input.getUaId());
        if(service == null) {
            throw new ServiceNotFoundException("Service not Found!");
        }
        if(!service.getServiceId().equals(input.getServiceId()) || !service.getUaId().equals(input.getUaId())) {
            throw new InvalidAttributeChangeException("Hash or Range key did not match.");
        }
        service.setDescription(input.getDescription());
        service.setServiceTypeCost(input.getServiceTypeCost());
        service.setCategory(input.getCategory());
        service.setStatus(input.getStatus());
        service.setServiceType(input.getServiceType());
        return UpdateServiceResult.builder()
                .setServiceModel(ServiceConverter.toServiceModel(serviceDao.saveService(service)))
                .build();
    }
}
