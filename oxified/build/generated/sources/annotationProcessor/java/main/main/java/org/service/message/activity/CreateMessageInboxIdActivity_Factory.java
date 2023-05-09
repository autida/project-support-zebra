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
public final class CreateMessageInboxIdActivity_Factory implements Factory<CreateMessageInboxIdActivity> {
  private final Provider<UserMessageInboxDao> inboxDaoProvider;

  public CreateMessageInboxIdActivity_Factory(Provider<UserMessageInboxDao> inboxDaoProvider) {
    this.inboxDaoProvider = inboxDaoProvider;
  }

  @Override
  public CreateMessageInboxIdActivity get() {
    return newInstance(inboxDaoProvider.get());
  }

  public static CreateMessageInboxIdActivity_Factory create(
      Provider<UserMessageInboxDao> inboxDaoProvider) {
    return new CreateMessageInboxIdActivity_Factory(inboxDaoProvider);
  }

  public static CreateMessageInboxIdActivity newInstance(UserMessageInboxDao inboxDao) {
    return new CreateMessageInboxIdActivity(inboxDao);
  }
}
