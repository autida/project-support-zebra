package main.java.org.service.appointment.models.requests;

import java.util.Objects;

public class GetAppointmentFromBookingRequest {
    private String appointmentId;
    private String bookingId;

    public GetAppointmentFromBookingRequest() {
    }

    public GetAppointmentFromBookingRequest(Builder builder) {
        this.appointmentId = builder.appointmentId;
        this.bookingId = builder.bookingId;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
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
        if (!(o instanceof GetAppointmentFromBookingRequest)) return false;
        GetAppointmentFromBookingRequest that = (GetAppointmentFromBookingRequest) o;
        return appointmentId.equals(that.appointmentId) && bookingId.equals(that.bookingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appointmentId, bookingId);
    }

    @Override
    public String toString() {
        return "GetAppointmentFromBookingRequest{" +
                "appointmentId='" + appointmentId + '\'' +
                ", bookingId='" + bookingId + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String appointmentId;
        private String bookingId;

        public Builder withAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }

        public Builder withBookingId(String bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public GetAppointmentFromBookingRequest build() {
            return new GetAppointmentFromBookingRequest(this);
        }
    }
}
