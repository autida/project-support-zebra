package main.java.org.service.appointment.models.results;

import main.java.org.service.appointment.models.AppointmentModel;

import java.util.List;

public class AddAppointmentToBookingResult {
    private List<AppointmentModel> appointmentList;

    public AddAppointmentToBookingResult(Builder builder) {
        this.appointmentList = builder.appointmentList;
    }

    public List<AppointmentModel> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(List<AppointmentModel> appointmentList) {
        this.appointmentList = appointmentList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private List<AppointmentModel> appointmentList;

        public Builder withAppointmentList(List<AppointmentModel> appointmentList) {
            this.appointmentList = appointmentList;
            return this;
        }

        public AddAppointmentToBookingResult build() {
            return new AddAppointmentToBookingResult(this);
        }
    }
}
