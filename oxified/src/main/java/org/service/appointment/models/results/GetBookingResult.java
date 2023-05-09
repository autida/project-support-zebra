package main.java.org.service.appointment.models.results;

import main.java.org.service.appointment.models.BookingModel;

public class GetBookingResult {
    private BookingModel booking;

    public GetBookingResult() {
    }

    public GetBookingResult(Builder builder) {
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

        public GetBookingResult build() {
            return new GetBookingResult(this);
        }
    }
}
