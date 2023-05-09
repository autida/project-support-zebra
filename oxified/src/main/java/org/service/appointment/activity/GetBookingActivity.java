package main.java.org.service.appointment.activity;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.org.exceptions.InvalidAttributeValueException;
import main.java.org.service.appointment.converters.ModelConverter;
import main.java.org.service.appointment.dynamodb.BookingDao;
import main.java.org.service.appointment.dynamodb.models.Booking;
import main.java.org.service.appointment.models.BookingModel;
import main.java.org.service.appointment.models.requests.GetBookingRequest;
import main.java.org.service.appointment.models.results.GetBookingResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;

public class GetBookingActivity implements RequestHandler<GetBookingRequest, GetBookingResult> {
    private final Logger log = LogManager.getLogger();
    private final BookingDao bookingDao;

    @Inject
    public GetBookingActivity(BookingDao bookingDao) {
        this.bookingDao = bookingDao;
    }

    @Override
    public GetBookingResult handleRequest(GetBookingRequest request, Context context) {
        log.info("Received GetBookingRequest {}", request);
        if (request.getBookingId().equals("")) {
            throw new InvalidAttributeValueException("Booking id cannot be empty.");
        }
        Booking booking = bookingDao.getBooking(request.getBookingId());
        BookingModel bookingModel = new ModelConverter().toBookingModel(booking);
        return GetBookingResult.builder()
                .withBooking(bookingModel)
                .build();
    }
}
