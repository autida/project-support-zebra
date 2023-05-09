package main.java.org.service.appointment.activity;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.org.exceptions.InvalidAttributeChangeException;
import main.java.org.exceptions.InvalidAttributeValueException;
import main.java.org.service.appointment.converters.ModelConverter;
import main.java.org.service.appointment.dynamodb.AppointmentDao;
import main.java.org.service.appointment.dynamodb.models.Appointment;
import main.java.org.service.appointment.models.requests.UpdateAppointmentRequest;
import main.java.org.service.appointment.models.results.UpdateAppointmentResult;
import main.java.org.service.appointment.util.ServiceUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;

public class UpdateAppointmentActivity implements RequestHandler<UpdateAppointmentRequest, UpdateAppointmentResult> {
    private final Logger log = LogManager.getLogger();
    private final AppointmentDao appointmentDao;

    @Inject
    public UpdateAppointmentActivity(AppointmentDao appointmentDao) {
        this.appointmentDao = appointmentDao;
    }

    @Override
    public UpdateAppointmentResult handleRequest(UpdateAppointmentRequest request, Context context) {
        log.info("Received UpdateAppointmentRequest {}", request);
        if (ServiceUtils.isValidString(request.getAppointmentId()) ||
                ServiceUtils.isValidString(request.getBookingId()) ||
                ServiceUtils.isValidString(request.getAddressId())) {
            throw new InvalidAttributeValueException();
        }

        Appointment appointment = appointmentDao.getAppointment(request.getAppointmentId(), request.getBookingId());
        if (!request.getBookingId().equals(appointment.getBookingId())) {
            throw new InvalidAttributeChangeException("Booking does not match.");
        }

        appointment.setDate(request.getDate());
        appointment.setTime(request.getTime());
        appointment.setServiceId(request.getServiceId());
        appointment.setAddressId(request.getAddressId());
        appointment.setStatus(request.getStatus());
        appointmentDao.saveAppointment(appointment);

        return UpdateAppointmentResult.builder()
                .withAppointment(new ModelConverter().toAppointmentModel(appointment))
                .build();
    }
}
