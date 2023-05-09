package main.java.org.service.appointment.models.requests;

import java.util.Objects;

public class GetBookingRequest {
    private String bookingId;

    public GetBookingRequest() {
    }

    public GetBookingRequest(Builder builder) {
        this.bookingId = builder.bookingId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GetBookingRequest)) return false;
        GetBookingRequest request = (GetBookingRequest) o;
        return bookingId.equals(request.bookingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId);
    }

    @Override
    public String toString() {
        return "GetBookingRequest{" +
                "bookingId='" + bookingId + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }
    public static final class Builder {
        private String bookingId;

        public Builder() {
        }

        public Builder withBookingId(String bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public GetBookingRequest build() {
            return new GetBookingRequest(this);
        }
    }
}
