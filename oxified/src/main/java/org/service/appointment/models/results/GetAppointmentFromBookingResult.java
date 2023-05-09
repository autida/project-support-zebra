package main.java.org.service.appointment.models.results;

import main.java.org.service.appointment.models.AppointmentModel;

public class GetAppointmentFromBookingResult {
    private AppointmentModel appointmentModel;

    public GetAppointmentFromBookingResult() {
    }

    public GetAppointmentFromBookingResult(Builder builder) {
        this.appointmentModel = builder.appointmentModel;
    }

    public AppointmentModel getAppointmentModel() {
        return appointmentModel;
    }

    public void setAppointmentModel(AppointmentModel appointmentModel) {
        this.appointmentModel = appointmentModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private AppointmentModel appointmentModel;

        public Builder withAppointmentModel(AppointmentModel appointmentModel) {
            this.appointmentModel = appointmentModel;
            return this;
        }

        public GetAppointmentFromBookingResult build() {
            return new GetAppointmentFromBookingResult(this);
        }
    }
}
