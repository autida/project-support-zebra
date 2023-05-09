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
public final class UpdateUserAccountActivity_Factory implements Factory<UpdateUserAccountActivity> {
  private final Provider<UserAccountDao> userAccountDaoProvider;

  public UpdateUserAccountActivity_Factory(Provider<UserAccountDao> userAccountDaoProvider) {
    this.userAccountDaoProvider = userAccountDaoProvider;
  }

  @Override
  public UpdateUserAccountActivity get() {
    return newInstance(userAccountDaoProvider.get());
  }

  public static UpdateUserAccountActivity_Factory create(
      Provider<UserAccountDao> userAccountDaoProvider) {
    return new UpdateUserAccountActivity_Factory(userAccountDaoProvider);
  }

  public static UpdateUserAccountActivity newInstance(UserAccountDao userAccountDao) {
    return new UpdateUserAccountActivity(userAccountDao);
  }
}
