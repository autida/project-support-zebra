package main.java.org.service.useraccount.dynamodb;

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
public final class UserAccountDao_Factory implements Factory<UserAccountDao> {
  private final Provider<DynamoDBMapper> dynamoDBMapperProvider;

  public UserAccountDao_Factory(Provider<DynamoDBMapper> dynamoDBMapperProvider) {
    this.dynamoDBMapperProvider = dynamoDBMapperProvider;
  }

  @Override
  public UserAccountDao get() {
    return newInstance(dynamoDBMapperProvider.get());
  }

  public static UserAccountDao_Factory create(Provider<DynamoDBMapper> dynamoDBMapperProvider) {
    return new UserAccountDao_Factory(dynamoDBMapperProvider);
  }

  public static UserAccountDao newInstance(DynamoDBMapper dynamoDBMapper) {
    return new UserAccountDao(dynamoDBMapper);
  }
}
