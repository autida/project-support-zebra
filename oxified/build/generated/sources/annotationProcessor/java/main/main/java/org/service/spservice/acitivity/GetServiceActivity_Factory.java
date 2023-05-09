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
public final class GetServiceActivity_Factory implements Factory<GetServiceActivity> {
  private final Provider<ServiceDao> serviceDaoProvider;

  public GetServiceActivity_Factory(Provider<ServiceDao> serviceDaoProvider) {
    this.serviceDaoProvider = serviceDaoProvider;
  }

  @Override
  public GetServiceActivity get() {
    return newInstance(serviceDaoProvider.get());
  }

  public static GetServiceActivity_Factory create(Provider<ServiceDao> serviceDaoProvider) {
    return new GetServiceActivity_Factory(serviceDaoProvider);
  }

  public static GetServiceActivity newInstance(ServiceDao serviceDao) {
    return new GetServiceActivity(serviceDao);
  }
}
