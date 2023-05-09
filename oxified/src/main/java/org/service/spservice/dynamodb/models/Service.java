package main.java.org.service.spservice.dynamodb.models;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import main.java.org.service.spservice.converter.CostToStringConverter;
import main.java.org.service.useraccount.converter.UserAccountLinkedListConverter;

import java.math.BigDecimal;
@DynamoDBTable(tableName = "services")
public class Service {
    String serviceId;
    String uaId;
    String description;
    BigDecimal serviceTypeCost;
    String category;
    String serviceType;
    String status;
    @DynamoDBHashKey(attributeName = "serviceId")
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }
    @DynamoDBRangeKey(attributeName = "uaId")
    public String getUaId() {
        return uaId;
    }

    public void setUaId(String uaId) {
        this.uaId = uaId;
    }
    @DynamoDBAttribute(attributeName = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    @DynamoDBTypeConverted(converter = UserAccountLinkedListConverter.class)
    @DynamoDBAttribute(attributeName = "cost")
    public BigDecimal getServiceTypeCost() {
        return serviceTypeCost;
    }

    public void setServiceTypeCost(BigDecimal serviceTypeCost) {
        this.serviceTypeCost = serviceTypeCost;
    }
    @DynamoDBAttribute(attributeName = "category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    @DynamoDBAttribute(attributeName = "type")
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
    @DynamoDBAttribute(attributeName = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
