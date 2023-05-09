package main.java.org.service.appointment.activity;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
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
public final class CreateBookingActivity_Factory implements Factory<CreateBookingActivity> {
  private final Provider<BookingDao> bookingDaoProvider;

  public CreateBookingActivity_Factory(Provider<BookingDao> bookingDaoProvider) {
    this.bookingDaoProvider = bookingDaoProvider;
  }

  @Override
  public CreateBookingActivity get() {
    return newInstance(bookingDaoProvider.get());
  }

  public static CreateBookingActivity_Factory create(Provider<BookingDao> bookingDaoProvider) {
    return new CreateBookingActivity_Factory(bookingDaoProvider);
  }

  public static CreateBookingActivity newInstance(BookingDao bookingDao) {
    return new CreateBookingActivity(bookingDao);
  }
}
