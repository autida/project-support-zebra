package main.java.org.service.useraccount.activity;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import main.java.org.service.useraccount.dynamodb.UserAccountDao;

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
public final class CreateUserAccountActivity_Factory implements Factory<CreateUserAccountActivity> {
  private final Provider<UserAccountDao> userAccountDaoProvider;

  public CreateUserAccountActivity_Factory(Provider<UserAccountDao> userAccountDaoProvider) {
    this.userAccountDaoProvider = userAccountDaoProvider;
  }

  @Override
  public CreateUserAccountActivity get() {
    return newInstance(userAccountDaoProvider.get());
  }

  public static CreateUserAccountActivity_Factory create(
      Provider<UserAccountDao> userAccountDaoProvider) {
    return new CreateUserAccountActivity_Factory(userAccountDaoProvider);
  }

  public static CreateUserAccountActivity newInstance(UserAccountDao userAccountDao) {
    return new CreateUserAccountActivity(userAccountDao);
  }
}
