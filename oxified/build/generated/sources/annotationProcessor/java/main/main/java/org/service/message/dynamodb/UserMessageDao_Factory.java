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
public final class UserMessageDao_Factory implements Factory<UserMessageDao> {
  private final Provider<DynamoDBMapper> dynamoDBMapperProvider;

  public UserMessageDao_Factory(Provider<DynamoDBMapper> dynamoDBMapperProvider) {
    this.dynamoDBMapperProvider = dynamoDBMapperProvider;
  }

  @Override
  public UserMessageDao get() {
    return newInstance(dynamoDBMapperProvider.get());
  }

  public static UserMessageDao_Factory create(Provider<DynamoDBMapper> dynamoDBMapperProvider) {
    return new UserMessageDao_Factory(dynamoDBMapperProvider);
  }

  public static UserMessageDao newInstance(DynamoDBMapper dynamoDBMapper) {
    return new UserMessageDao(dynamoDBMapper);
  }
}
