package main.java.org.service.message.dynamodb;

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
public final class UserMessageInboxDao_Factory implements Factory<UserMessageInboxDao> {
  private final Provider<DynamoDBMapper> dynamoDBMapperProvider;

  public UserMessageInboxDao_Factory(Provider<DynamoDBMapper> dynamoDBMapperProvider) {
    this.dynamoDBMapperProvider = dynamoDBMapperProvider;
  }

  @Override
  public UserMessageInboxDao get() {
    return newInstance(dynamoDBMapperProvider.get());
  }

  public static UserMessageInboxDao_Factory create(
      Provider<DynamoDBMapper> dynamoDBMapperProvider) {
    return new UserMessageInboxDao_Factory(dynamoDBMapperProvider);
  }

  public static UserMessageInboxDao newInstance(DynamoDBMapper dynamoDBMapper) {
    return new UserMessageInboxDao(dynamoDBMapper);
  }
}
