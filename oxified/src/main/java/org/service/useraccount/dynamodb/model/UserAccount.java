package main.java.org.service.useraccount.dynamodb.model;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import main.java.org.service.useraccount.converter.UserAccountLinkedListConverter;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@DynamoDBTable(tableName = "user_accounts")
public class UserAccount {
    public static final String AUTHENTICATION_INDEX = "email-index";
    private String uaId;
    private String Email;
    private String Password;
    private String userType;
    private String status;
    private String lastName;
    private String firstName;
    private String contactNumber;
    private String address;
    private String birthdate;
    private String gender;
    private Set<String> inbox;
    private String accountStatus;
    private Boolean backgroundChecked;
    private String experience;
    private List<String> businessHours;
    private List<LocalDateTime> availability;
    private String bookingId;

    @DynamoDBHashKey(attributeName = "uaId")
    public String getUaId() {
        return uaId;
    }

    public void setUaId(String uaId) {
        this.uaId = uaId;
    }
    @DynamoDBRangeKey(attributeName = "userType")
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    @DynamoDBIndexHashKey(globalSecondaryIndexName = AUTHENTICATION_INDEX,attributeName = "email")
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
    @DynamoDBAttribute(attributeName = "password")
    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
    @DynamoDBAttribute(attributeName = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @DynamoDBAttribute(attributeName = "lastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @DynamoDBAttribute(attributeName = "firstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @DynamoDBAttribute(attributeName = "contactNumber")
    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    @DynamoDBAttribute(attributeName = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @DynamoDBAttribute(attributeName = "birthDate")
    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    @DynamoDBAttribute(attributeName = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    @DynamoDBAttribute(attributeName = "inbox")
    public Set<String> getInbox() {
        return inbox;
    }

    public void setInbox(Set<String> inbox) {
        this.inbox = inbox;
    }
    @DynamoDBAttribute(attributeName = "accountStatus")
    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }
    @DynamoDBAttribute(attributeName = "backgroundChecked")
    public Boolean getBackgroundChecked() {
        return backgroundChecked;
    }

    public void setBackgroundChecked(Boolean backgroundChecked) {
        this.backgroundChecked = backgroundChecked;
    }
    @DynamoDBAttribute(attributeName = "experience")
    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
    @DynamoDBTypeConverted(converter = UserAccountLinkedListConverter.class)
    @DynamoDBAttribute(attributeName = "businessHours")
    public List<String> getBusinessHours() {
        return businessHours;
    }

    public void setBusinessHours(List<String> businessHours) {
        this.businessHours = businessHours;
    }
    @DynamoDBTypeConverted(converter = UserAccountLinkedListConverter.class)
    @DynamoDBAttribute(attributeName = "availability")
    public List<LocalDateTime> getAvailability() {
        return availability;
    }

    public void setAvailability(List<LocalDateTime> availability) {
        this.availability = availability;
    }
    @DynamoDBAttribute(attributeName = "booking")
    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }
}
