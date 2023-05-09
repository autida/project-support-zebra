package main.java.org.service.appointment.activity;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import main.java.org.service.appointment.dynamodb.AppointmentDao;
import main.java.org.service.appointment.dynamodb.BookingDao;

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
public final class AddAppointmentToBookingActivity_Factory implements Factory<AddAppointmentToBookingActivity> {
  private final Provider<AppointmentDao> appointmentDaoProvider;

  private final Provider<BookingDao> bookingDaoProvider;

  public AddAppointmentToBookingActivity_Factory(Provider<AppointmentDao> appointmentDaoProvider,
      Provider<BookingDao> bookingDaoProvider) {
    this.appointmentDaoProvider = appointmentDaoProvider;
    this.bookingDaoProvider = bookingDaoProvider;
  }

  @Override
  public AddAppointmentToBookingActivity get() {
    return newInstance(appointmentDaoProvider.get(), bookingDaoProvider.get());
  }

  public static AddAppointmentToBookingActivity_Factory create(
      Provider<AppointmentDao> appointmentDaoProvider, Provider<BookingDao> bookingDaoProvider) {
    return new AddAppointmentToBookingActivity_Factory(appointmentDaoProvider, bookingDaoProvider);
  }

  public static AddAppointmentToBookingActivity newInstance(AppointmentDao appointmentDao,
      BookingDao bookingDao) {
    return new AddAppointmentToBookingActivity(appointmentDao, bookingDao);
  }
}
