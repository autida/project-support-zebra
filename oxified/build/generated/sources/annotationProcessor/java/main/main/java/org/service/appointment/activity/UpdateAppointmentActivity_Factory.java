package main.java.org.service.appointment.activity;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import main.java.org.service.appointment.dynamodb.AppointmentDao;

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
public final class UpdateAppointmentActivity_Factory implements Factory<UpdateAppointmentActivity> {
  private final Provider<AppointmentDao> appointmentDaoProvider;

  public UpdateAppointmentActivity_Factory(Provider<AppointmentDao> appointmentDaoProvider) {
    this.appointmentDaoProvider = appointmentDaoProvider;
  }

  @Override
  public UpdateAppointmentActivity get() {
    return newInstance(appointmentDaoProvider.get());
  }

  public static UpdateAppointmentActivity_Factory create(
      Provider<AppointmentDao> appointmentDaoProvider) {
    return new UpdateAppointmentActivity_Factory(appointmentDaoProvider);
  }

  public static UpdateAppointmentActivity newInstance(AppointmentDao appointmentDao) {
    return new UpdateAppointmentActivity(appointmentDao);
  }
}
