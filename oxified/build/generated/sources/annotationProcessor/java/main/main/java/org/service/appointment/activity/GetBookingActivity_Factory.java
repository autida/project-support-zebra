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
public final class GetBookingActivity_Factory implements Factory<GetBookingActivity> {
  private final Provider<BookingDao> bookingDaoProvider;

  public GetBookingActivity_Factory(Provider<BookingDao> bookingDaoProvider) {
    this.bookingDaoProvider = bookingDaoProvider;
  }

  @Override
  public GetBookingActivity get() {
    return newInstance(bookingDaoProvider.get());
  }

  public static GetBookingActivity_Factory create(Provider<BookingDao> bookingDaoProvider) {
    return new GetBookingActivity_Factory(bookingDaoProvider);
  }

  public static GetBookingActivity newInstance(BookingDao bookingDao) {
    return new GetBookingActivity(bookingDao);
  }
}
