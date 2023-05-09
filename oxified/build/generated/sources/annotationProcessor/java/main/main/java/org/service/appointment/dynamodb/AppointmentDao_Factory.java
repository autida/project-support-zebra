package main.java.org.service.appointment.dynamodb;

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
public final class AppointmentDao_Factory implements Factory<AppointmentDao> {
  private final Provider<DynamoDBMapper> dynamoDBMapperProvider;

  public AppointmentDao_Factory(Provider<DynamoDBMapper> dynamoDBMapperProvider) {
    this.dynamoDBMapperProvider = dynamoDBMapperProvider;
  }

  @Override
  public AppointmentDao get() {
    return newInstance(dynamoDBMapperProvider.get());
  }

  public static AppointmentDao_Factory create(Provider<DynamoDBMapper> dynamoDBMapperProvider) {
    return new AppointmentDao_Factory(dynamoDBMapperProvider);
  }

  public static AppointmentDao newInstance(DynamoDBMapper dynamoDBMapper) {
    return new AppointmentDao(dynamoDBMapper);
  }
}
