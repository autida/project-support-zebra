package main.java.org.service.appointment.dynamodb;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import main.java.org.exceptions.InvalidAttributeValueException;
import main.java.org.service.appointment.dynamodb.models.Booking;

import javax.inject.Inject;

public class BookingDao {
    private final DynamoDBMapper dynamoDBMapper;

    @Inject
    public BookingDao(DynamoDBMapper dynamoDBMapper) {
        this.dynamoDBMapper = dynamoDBMapper;
    }

    public Booking getBooking(String bookingId){
        if (bookingId.equals("")) {
            throw new InvalidAttributeValueException("Booking cannot be empty.");
        }
        return dynamoDBMapper.load(Booking.class, bookingId);
    }

    public void saveBooking(Booking booking) throws InvalidAttributeValueException {
        if (booking == null) {
            throw new InvalidAttributeValueException();
        }
        this.dynamoDBMapper.save(booking);
    }
}
