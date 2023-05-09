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
public final class GetUserAccountActivity_Factory implements Factory<GetUserAccountActivity> {
  private final Provider<UserAccountDao> userAccountDaoProvider;

  public GetUserAccountActivity_Factory(Provider<UserAccountDao> userAccountDaoProvider) {
    this.userAccountDaoProvider = userAccountDaoProvider;
  }

  @Override
  public GetUserAccountActivity get() {
    return newInstance(userAccountDaoProvider.get());
  }

  public static GetUserAccountActivity_Factory create(
      Provider<UserAccountDao> userAccountDaoProvider) {
    return new GetUserAccountActivity_Factory(userAccountDaoProvider);
  }

  public static GetUserAccountActivity newInstance(UserAccountDao userAccountDao) {
    return new GetUserAccountActivity(userAccountDao);
  }
}
