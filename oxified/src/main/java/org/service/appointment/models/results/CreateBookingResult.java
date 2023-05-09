package main.java.org.service.appointment.models.results;

import main.java.org.service.appointment.models.BookingModel;

public class CreateBookingResult {
    private BookingModel booking;

    public CreateBookingResult() {
    }

    public CreateBookingResult(Builder builder) {
        this.booking = builder.booking;
    }

    public BookingModel getBooking() {
        return booking;
    }

    public void setBooking(BookingModel booking) {
        this.booking = booking;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private BookingModel booking;

        public Builder withBooking(BookingModel booking) {
            this.booking = booking;
            return this;
        }

        public CreateBookingResult build() {
            return new CreateBookingResult(this);
        }
    }
}
