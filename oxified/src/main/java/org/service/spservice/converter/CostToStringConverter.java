package main.java.org.service.spservice.converter;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter;

import java.math.BigDecimal;

public class CostToStringConverter implements DynamoDBTypeConverter<BigDecimal, String> {
    @Override
    public BigDecimal convert(String s) {
        return new BigDecimal(s);
    }

    @Override
    public String unconvert(BigDecimal bigDecimal) {
        return String.valueOf(bigDecimal.doubleValue());
    }
}
