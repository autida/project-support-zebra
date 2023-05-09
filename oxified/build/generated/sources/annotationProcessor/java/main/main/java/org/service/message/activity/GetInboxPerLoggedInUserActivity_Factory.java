package main.java.org.service.message.activity;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import main.java.org.service.message.dynamodb.UserMessageInboxDao;

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
public final class GetInboxPerLoggedInUserActivity_Factory implements Factory<GetInboxPerLoggedInUserActivity> {
  private final Provider<UserMessageInboxDao> messageInboxDaoProvider;

  public GetInboxPerLoggedInUserActivity_Factory(
      Provider<UserMessageInboxDao> messageInboxDaoProvider) {
    this.messageInboxDaoProvider = messageInboxDaoProvider;
  }

  @Override
  public GetInboxPerLoggedInUserActivity get() {
    return newInstance(messageInboxDaoProvider.get());
  }

  public static GetInboxPerLoggedInUserActivity_Factory create(
      Provider<UserMessageInboxDao> messageInboxDaoProvider) {
    return new GetInboxPerLoggedInUserActivity_Factory(messageInboxDaoProvider);
  }

  public static GetInboxPerLoggedInUserActivity newInstance(UserMessageInboxDao messageInboxDao) {
    return new GetInboxPerLoggedInUserActivity(messageInboxDao);
  }
}
