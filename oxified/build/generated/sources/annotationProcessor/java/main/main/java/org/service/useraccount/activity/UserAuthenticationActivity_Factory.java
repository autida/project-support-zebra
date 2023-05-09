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
public final class UserAuthenticationActivity_Factory implements Factory<UserAuthenticationActivity> {
  private final Provider<UserAccountDao> userAccountDaoProvider;

  public UserAuthenticationActivity_Factory(Provider<UserAccountDao> userAccountDaoProvider) {
    this.userAccountDaoProvider = userAccountDaoProvider;
  }

  @Override
  public UserAuthenticationActivity get() {
    return newInstance(userAccountDaoProvider.get());
  }

  public static UserAuthenticationActivity_Factory create(
      Provider<UserAccountDao> userAccountDaoProvider) {
    return new UserAuthenticationActivity_Factory(userAccountDaoProvider);
  }

  public static UserAuthenticationActivity newInstance(UserAccountDao userAccountDao) {
    return new UserAuthenticationActivity(userAccountDao);
  }
}
