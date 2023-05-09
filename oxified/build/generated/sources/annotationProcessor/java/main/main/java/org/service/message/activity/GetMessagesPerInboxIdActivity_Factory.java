package main.java.org.service.message.activity;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import main.java.org.service.message.dynamodb.UserMessageDao;

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
public final class GetMessagesPerInboxIdActivity_Factory implements Factory<GetMessagesPerInboxIdActivity> {
  private final Provider<UserMessageDao> messageDaoProvider;

  public GetMessagesPerInboxIdActivity_Factory(Provider<UserMessageDao> messageDaoProvider) {
    this.messageDaoProvider = messageDaoProvider;
  }

  @Override
  public GetMessagesPerInboxIdActivity get() {
    return newInstance(messageDaoProvider.get());
  }

  public static GetMessagesPerInboxIdActivity_Factory create(
      Provider<UserMessageDao> messageDaoProvider) {
    return new GetMessagesPerInboxIdActivity_Factory(messageDaoProvider);
  }

  public static GetMessagesPerInboxIdActivity newInstance(UserMessageDao messageDao) {
    return new GetMessagesPerInboxIdActivity(messageDao);
  }
}
