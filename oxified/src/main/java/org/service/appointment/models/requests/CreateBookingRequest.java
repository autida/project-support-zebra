package main.java.org.service.appointment.models.requests;

import main.java.org.service.appointment.util.ServiceUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CreateBookingRequest {
    private String bookingId = ServiceUtils.generateId();
    private List<String> appointmentIdList = new ArrayList<>();
    private int appointmentCount;

    public CreateBookingRequest() {
    }

    public CreateBookingRequest(List<String> appointmentIdList, int appointmentCount) {
        this.appointmentIdList = appointmentIdList;
        this.appointmentCount = appointmentIdList.size();
    }

    public CreateBookingRequest(Builder builder) {
        this.appointmentIdList = builder.appointmentIdList;
        this.appointmentCount = builder.appointmentIdList.size();
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public List<String> getAppointmentIdList() {
        return appointmentIdList;
    }

    public void setAppointmentIdList(List<String> appointmentIdList) {
        this.appointmentIdList = appointmentIdList;
    }

    public int getAppointmentCount() {
        return appointmentCount;
    }

    public void setAppointmentCount(int appointmentCount) {
        this.appointmentCount = appointmentCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreateBookingRequest)) return false;
        CreateBookingRequest that = (CreateBookingRequest) o;
        return appointmentCount == that.appointmentCount && bookingId.equals(that.bookingId) && appointmentIdList.equals(that.appointmentIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, appointmentIdList, appointmentCount);
    }

    @Override
    public String toString() {
        return "CreateBookingRequest{" +
                "bookingId='" + bookingId + '\'' +
                ", appointmentIdList=" + appointmentIdList +
                ", appointmentCount=" + appointmentCount +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private List<String> appointmentIdList;

        public Builder() {
        }

        public Builder withAppointmentIdList(List<String> appointmentIdList) {
            this.appointmentIdList = appointmentIdList;
            return this;
        }

        public CreateBookingRequest build() {
            return new CreateBookingRequest(this);
        }
    }
}
