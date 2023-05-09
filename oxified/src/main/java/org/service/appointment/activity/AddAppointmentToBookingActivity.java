package main.java.org.service.appointment.activity;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.org.exceptions.BookingNotFoundException;
import main.java.org.service.appointment.converters.ModelConverter;
import main.java.org.service.appointment.dynamodb.AppointmentDao;
import main.java.org.service.appointment.dynamodb.BookingDao;
import main.java.org.service.appointment.dynamodb.models.Appointment;
import main.java.org.service.appointment.dynamodb.models.Booking;
import main.java.org.service.appointment.models.AppointmentModel;
import main.java.org.service.appointment.models.requests.AddAppointmentToBookingRequest;
import main.java.org.service.appointment.models.results.AddAppointmentToBookingResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;
import java.util.Collections;
import java.util.List;

public class AddAppointmentToBookingActivity
        implements RequestHandler<AddAppointmentToBookingRequest, AddAppointmentToBookingResult> {
    private final Logger log = LogManager.getLogger();
    private final AppointmentDao appointmentDao;
    private final BookingDao bookingDao;

    @Inject
    public AddAppointmentToBookingActivity(AppointmentDao appointmentDao, BookingDao bookingDao) {
        this.appointmentDao = appointmentDao;
        this.bookingDao = bookingDao;
    }

    @Override
    public AddAppointmentToBookingResult handleRequest(AddAppointmentToBookingRequest request, Context context) {
        log.info("Received AddAppointmentToBookingRequest {}", request);
        Booking booking = bookingDao.getBooking(request.getBookingId());
        if (booking == null) {
            throw new BookingNotFoundException();
        }

        Appointment appointment = new Appointment();
        appointment.setAppointmentId(request.getAppointmentId());
        appointment.setBookingId(request.getBookingId());
        appointment.setDate(request.getDate());
        appointment.setTime(request.getTime());
        appointment.setServiceId(request.getServiceId());
        appointment.setAddressId(request.getAddressId());
        appointment.setStatus(request.getStatus());
        appointmentDao.saveAppointment(appointment);

        List<String> appointmentIdList = booking.getAppointmentList();
        appointmentIdList.add(appointment.getAppointmentId());
        booking.setAppointmentList(appointmentIdList);
        booking.setAppointmentCount(appointmentIdList.size());
        bookingDao.saveBooking(booking);

        AppointmentModel appointmentModel = new ModelConverter().toAppointmentModel(appointment);
        return AddAppointmentToBookingResult.builder()
                .withAppointmentList(Collections.singletonList(appointmentModel))
                .build();
    }
}
