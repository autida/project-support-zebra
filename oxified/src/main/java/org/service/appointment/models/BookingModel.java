package main.java.org.service.appointment.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookingModel {
    private String bookingId;
    private List<String> appointmentList = new ArrayList<>();
    private Integer appointmentCount;

    public BookingModel() {

    }

    public BookingModel(Builder builder) {
        this.bookingId = builder.bookingId;
        this.appointmentList = builder.appointmentList;
        this.appointmentCount = builder.appointmentCount;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public List<String> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(List<String> appointmentList) {
        this.appointmentList = appointmentList;
    }

    public Integer getAppointmentCount() {
        return appointmentCount;
    }

    public void setAppointmentCount(Integer appointmentCount) {
        this.appointmentCount = appointmentCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookingModel)) return false;
        BookingModel that = (BookingModel) o;
        return bookingId.equals(that.bookingId) && Objects.equals(appointmentList, that.appointmentList) && Objects.equals(appointmentCount, that.appointmentCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, appointmentList, appointmentCount);
    }

    @Override
    public String toString() {
        return "BookingModel{" +
                "bookingId='" + bookingId + '\'' +
                ", appointmentList=" + appointmentList +
                ", appointmentCount=" + appointmentCount +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String bookingId;
        private List<String> appointmentList = new ArrayList<>();
        private Integer appointmentCount;

        public Builder withBookingId(String bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public Builder withAppointmentList(List<String> appointmentList) {
            this.appointmentList = appointmentList;
            return this;
        }

        public Builder withAppointmentCount(Integer appointmentCount) {
            this.appointmentCount = appointmentCount;
            return this;
        }

        public BookingModel build() {
            return new BookingModel(this);
        }
    }
}
