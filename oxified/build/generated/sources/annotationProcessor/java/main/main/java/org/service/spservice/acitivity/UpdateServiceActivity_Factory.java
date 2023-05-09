package main.java.org.service.spservice.acitivity;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import main.java.org.service.spservice.dynamodb.ServiceDao;

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
public final class UpdateServiceActivity_Factory implements Factory<UpdateServiceActivity> {
  private final Provider<ServiceDao> serviceDaoProvider;

  public UpdateServiceActivity_Factory(Provider<ServiceDao> serviceDaoProvider) {
    this.serviceDaoProvider = serviceDaoProvider;
  }

  @Override
  public UpdateServiceActivity get() {
    return newInstance(serviceDaoProvider.get());
  }

  public static UpdateServiceActivity_Factory create(Provider<ServiceDao> serviceDaoProvider) {
    return new UpdateServiceActivity_Factory(serviceDaoProvider);
  }

  public static UpdateServiceActivity newInstance(ServiceDao serviceDao) {
    return new UpdateServiceActivity(serviceDao);
  }
}
