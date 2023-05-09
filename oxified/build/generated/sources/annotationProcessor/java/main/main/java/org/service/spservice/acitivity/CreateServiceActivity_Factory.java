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
public final class CreateServiceActivity_Factory implements Factory<CreateServiceActivity> {
  private final Provider<ServiceDao> serviceDaoProvider;

  public CreateServiceActivity_Factory(Provider<ServiceDao> serviceDaoProvider) {
    this.serviceDaoProvider = serviceDaoProvider;
  }

  @Override
  public CreateServiceActivity get() {
    return newInstance(serviceDaoProvider.get());
  }

  public static CreateServiceActivity_Factory create(Provider<ServiceDao> serviceDaoProvider) {
    return new CreateServiceActivity_Factory(serviceDaoProvider);
  }

  public static CreateServiceActivity newInstance(ServiceDao serviceDao) {
    return new CreateServiceActivity(serviceDao);
  }
}
