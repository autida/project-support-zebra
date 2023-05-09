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
public final class BookingDao_Factory implements Factory<BookingDao> {
  private final Provider<DynamoDBMapper> dynamoDBMapperProvider;

  public BookingDao_Factory(Provider<DynamoDBMapper> dynamoDBMapperProvider) {
    this.dynamoDBMapperProvider = dynamoDBMapperProvider;
  }

  @Override
  public BookingDao get() {
    return newInstance(dynamoDBMapperProvider.get());
  }

  public static BookingDao_Factory create(Provider<DynamoDBMapper> dynamoDBMapperProvider) {
    return new BookingDao_Factory(dynamoDBMapperProvider);
  }

  public static BookingDao newInstance(DynamoDBMapper dynamoDBMapper) {
    return new BookingDao(dynamoDBMapper);
  }
}
