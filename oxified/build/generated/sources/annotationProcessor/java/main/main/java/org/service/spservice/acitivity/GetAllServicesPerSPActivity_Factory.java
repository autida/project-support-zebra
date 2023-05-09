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
public final class GetAllServicesPerSPActivity_Factory implements Factory<GetAllServicesPerSPActivity> {
  private final Provider<ServiceDao> serviceDaoProvider;

  public GetAllServicesPerSPActivity_Factory(Provider<ServiceDao> serviceDaoProvider) {
    this.serviceDaoProvider = serviceDaoProvider;
  }

  @Override
  public GetAllServicesPerSPActivity get() {
    return newInstance(serviceDaoProvider.get());
  }

  public static GetAllServicesPerSPActivity_Factory create(
      Provider<ServiceDao> serviceDaoProvider) {
    return new GetAllServicesPerSPActivity_Factory(serviceDaoProvider);
  }

  public static GetAllServicesPerSPActivity newInstance(ServiceDao serviceDao) {
    return new GetAllServicesPerSPActivity(serviceDao);
  }
}
