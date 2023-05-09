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
public final class GetAppointmentFromBookingActivity_Factory implements Factory<GetAppointmentFromBookingActivity> {
  private final Provider<AppointmentDao> appointmentDaoProvider;

  public GetAppointmentFromBookingActivity_Factory(
      Provider<AppointmentDao> appointmentDaoProvider) {
    this.appointmentDaoProvider = appointmentDaoProvider;
  }

  @Override
  public GetAppointmentFromBookingActivity get() {
    return newInstance(appointmentDaoProvider.get());
  }

  public static GetAppointmentFromBookingActivity_Factory create(
      Provider<AppointmentDao> appointmentDaoProvider) {
    return new GetAppointmentFromBookingActivity_Factory(appointmentDaoProvider);
  }

  public static GetAppointmentFromBookingActivity newInstance(AppointmentDao appointmentDao) {
    return new GetAppointmentFromBookingActivity(appointmentDao);
  }
}
