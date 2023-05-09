package main.java.org.service.appointment.activity;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.org.exceptions.InvalidAttributeValueException;
import main.java.org.service.appointment.converters.ModelConverter;
import main.java.org.service.appointment.dynamodb.AppointmentDao;
import main.java.org.service.appointment.dynamodb.models.Appointment;
import main.java.org.service.appointment.models.requests.GetAppointmentFromBookingRequest;
import main.java.org.service.appointment.models.results.GetAppointmentFromBookingResult;
import main.java.org.service.appointment.util.ServiceUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;

public class GetAppointmentFromBookingActivity
        implements RequestHandler<GetAppointmentFromBookingRequest, GetAppointmentFromBookingResult> {
    private final Logger log = LogManager.getLogger();
    private final AppointmentDao appointmentDao;

    @Inject
    public GetAppointmentFromBookingActivity(AppointmentDao appointmentDao) {
        this.appointmentDao = appointmentDao;
    }

    @Override
    public GetAppointmentFromBookingResult handleRequest(GetAppointmentFromBookingRequest request, Context context) {
        log.info("Received GetAppointmentFromBookingRequest {}", request);
        if (ServiceUtils.isValidString(request.getAppointmentId())) {
            throw new InvalidAttributeValueException("Appointment ID contains invalid characters.");
        }

        Appointment appointment = appointmentDao.getAppointment(request.getAppointmentId(), request.getBookingId());

        return GetAppointmentFromBookingResult.builder()
                .withAppointmentModel(new ModelConverter().toAppointmentModel(appointment))
                .build();
    }
}
