package main.java.org.service.appointment.dynamodb.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverted;
import main.java.org.service.appointment.converters.AppointmentLinkedListConverter;

import java.util.ArrayList;
import java.util.List;

@DynamoDBTable(tableName = "bookings")
public class Booking {
    private String bookingId;
    private List<String> appointmentList = new ArrayList<>();
    private Integer appointmentCount;

    public Booking() {
    }

    @DynamoDBHashKey(attributeName = "booking_id")
    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    @DynamoDBTypeConverted(converter = AppointmentLinkedListConverter.class)
    @DynamoDBAttribute(attributeName = "appointment_list")
    public List<String> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(List<String> appointmentList) {
        this.appointmentList = appointmentList;
    }

    @DynamoDBAttribute(attributeName = "appointment_count")
    public Integer getAppointmentCount() {
        return appointmentCount;
    }

    public void setAppointmentCount(Integer appointmentCount) {
        this.appointmentCount = appointmentCount;
    }
}
