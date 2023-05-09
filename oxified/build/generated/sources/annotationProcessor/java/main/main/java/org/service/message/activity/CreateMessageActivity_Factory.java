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
public final class CreateMessageActivity_Factory implements Factory<CreateMessageActivity> {
  private final Provider<UserMessageDao> messageDaoProvider;

  public CreateMessageActivity_Factory(Provider<UserMessageDao> messageDaoProvider) {
    this.messageDaoProvider = messageDaoProvider;
  }

  @Override
  public CreateMessageActivity get() {
    return newInstance(messageDaoProvider.get());
  }

  public static CreateMessageActivity_Factory create(Provider<UserMessageDao> messageDaoProvider) {
    return new CreateMessageActivity_Factory(messageDaoProvider);
  }

  public static CreateMessageActivity newInstance(UserMessageDao messageDao) {
    return new CreateMessageActivity(messageDao);
  }
}
