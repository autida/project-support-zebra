package main.java.org.service.spservice.converter;

import main.java.org.service.spservice.dynamodb.models.Service;
import main.java.org.service.spservice.models.ServiceModel;

public class ServiceConverter {

    public static ServiceModel toServiceModel(Service service) {
        return ServiceModel.builder()
                .setServiceId(service.getServiceId())
                .setUaId(service.getUaId())
                .setCategory(service.getCategory())
                .setDescription(service.getDescription())
                .setServiceType(service.getServiceType())
                .setServiceTypeCost(service.getServiceTypeCost())
                .setStatus(service.getStatus())
                .setStatus(service.getStatus())
                .build();
        }
}
