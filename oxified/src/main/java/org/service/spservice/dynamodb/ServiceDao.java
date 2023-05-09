package main.java.org.service.spservice.dynamodb;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBQueryExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.document.utils.ValueMap;
import com.amazonaws.services.dynamodbv2.xspec.S;
import main.java.org.service.spservice.dynamodb.models.Service;
import javax.inject.Inject;
import java.util.*;

public class ServiceDao {
    private DynamoDBMapper dynamoDBMapper;
    @Inject
    public ServiceDao(DynamoDBMapper dynamoDBMapper) {
        this.dynamoDBMapper = dynamoDBMapper;
    }
    public Service getService(String serviceId, String uaId) {
        return dynamoDBMapper.load(Service.class, serviceId, uaId);
    }
    public List<Service> getServiceByUserAccount(Service service) {
//        return Collections.singletonList(dynamoDBMapper.load(Service.class, service.getUaId()));
        DynamoDBQueryExpression<Service> queryExpression =
                new DynamoDBQueryExpression<Service>()
            .withIndexName("uaId")
            .withConsistentRead(false)
            .withExpressionAttributeValues(new HashMap<>());
        return null;
    }


    public Service saveService(Service service) {
        dynamoDBMapper.save(service);
        return service;
    }


}
