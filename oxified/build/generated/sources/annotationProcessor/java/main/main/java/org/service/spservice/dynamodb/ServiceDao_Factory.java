package main.java.org.service.spservice.dynamodb;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ServiceDao_Factory implements Factory<ServiceDao> {
  private final Provider<DynamoDBMapper> dynamoDBMapperProvider;

  public ServiceDao_Factory(Provider<DynamoDBMapper> dynamoDBMapperProvider) {
    this.dynamoDBMapperProvider = dynamoDBMapperProvider;
  }

  @Override
  public ServiceDao get() {
    return newInstance(dynamoDBMapperProvider.get());
  }

  public static ServiceDao_Factory create(Provider<DynamoDBMapper> dynamoDBMapperProvider) {
    return new ServiceDao_Factory(dynamoDBMapperProvider);
  }

  public static ServiceDao newInstance(DynamoDBMapper dynamoDBMapper) {
    return new ServiceDao(dynamoDBMapper);
  }
}
