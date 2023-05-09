package main.java.org.service.useraccount.model;

import java.time.LocalDateTime;
import java.util.*;

public class UserAccountModel {
    private String uaId;
    private String email;
    private String password;
    private String userType;
    private String status;
    private String lastName;
    private String firstName;
    private String contactNumber;
    private String addressId;
    private String birthdate;
    private String gender;
    private Set<String> inbox;
    private String accountStatus;
    private Boolean backgroundChecked;
    private String experience;
    private List<String> businessHours;
    private List<LocalDateTime> availability;
    private String bookingId;


    public UserAccountModel(Builder builder) {
        this.uaId = builder.uaId;
        this.email = builder.email;
        this.password = builder.password;
        this.userType = builder.userType;
        this.status = builder.status;
        this.lastName = builder.lastName;
        this.firstName = builder.firstName;
        this.contactNumber = builder.contactNumber;
        this.addressId = builder.addressId;
        this.birthdate = builder.birthdate;
        this.gender = builder.gender;
        this.inbox = builder.inbox;
        this.accountStatus = builder.accountStatus;
        this.backgroundChecked = builder.backgroundChecked;
        this.experience = builder.experience;
        this.businessHours = builder.businessHours;
        this.availability = builder.availability;
        this.bookingId = builder.bookingId;
    }
    public String getUaId() {
        return uaId;
    }

    public void setUaId(String uaId) {
        this.uaId = uaId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Set<String> getInbox() {
        return inbox;
    }

    public void setInbox(Set<String> inbox) {
        this.inbox = inbox;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Boolean getBackgroundChecked() {
        return backgroundChecked;
    }

    public void setBackgroundChecked(Boolean backgroundChecked) {
        this.backgroundChecked = backgroundChecked;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public List<String> getBusinessHours() {
        return businessHours;
    }

    public void setBusinessHours(List<String> businessHours) {
        this.businessHours = businessHours;
    }

    public List<LocalDateTime> getAvailability() {
        return availability;
    }

    public void setAvailability(List<LocalDateTime> availability) {
        this.availability = availability;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserAccountModel)) return false;
        UserAccountModel that = (UserAccountModel) o;
        return getUaId().equals(that.getUaId()) && getEmail().equals(that.getEmail()) && getPassword().equals(that.getPassword()) && Objects.equals(getUserType(), that.getUserType()) && Objects.equals(getStatus(), that.getStatus()) && Objects.equals(getLastName(), that.getLastName()) && Objects.equals(getFirstName(), that.getFirstName()) && Objects.equals(getContactNumber(), that.getContactNumber()) && Objects.equals(getAddressId(), that.getAddressId()) && Objects.equals(getBirthdate(), that.getBirthdate()) && Objects.equals(getGender(), that.getGender()) && Objects.equals(getInbox(), that.getInbox()) && Objects.equals(getAccountStatus(), that.getAccountStatus()) && Objects.equals(getBackgroundChecked(), that.getBackgroundChecked()) && Objects.equals(getExperience(), that.getExperience()) && Objects.equals(getBusinessHours(), that.getBusinessHours()) && Objects.equals(getAvailability(), that.getAvailability()) && Objects.equals(getBookingId(), that.getBookingId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUaId(), getEmail(), getPassword(), getUserType(), getStatus(), getLastName(), getFirstName(), getContactNumber(), getAddressId(), getBirthdate(), getGender(), getInbox(), getAccountStatus(), getBackgroundChecked(), getExperience(), getBusinessHours(), getAvailability(), getBookingId());
    }

    @Override
    public String toString() {
        return "UserAccountModel{" +
                "uaId='" + uaId + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", userType='" + userType + '\'' +
                ", status='" + status + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", addressId='" + addressId + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", gender='" + gender + '\'' +
                ", inbox=" + inbox +
                ", accountStatus='" + accountStatus + '\'' +
                ", backgroundChecked=" + backgroundChecked +
                ", experience='" + experience + '\'' +
                ", businessHours=" + businessHours +
                ", availability=" + availability +
                ", bookingId='" + bookingId + '\'' +
                '}';
    }

    public static Builder builder() { return new Builder();}
    public static final class Builder {
        private String uaId;
        private String email;
        private String password;
        private String userType;
        private String status;
        private String lastName;
        private String firstName;
        private String contactNumber;
        private String addressId;
        private String birthdate;
        private String gender;
        private Set<String> inbox = new HashSet<>();
        private String accountStatus;
        private Boolean backgroundChecked;
        private String experience;
        private List<String> businessHours;
        private List<LocalDateTime> availability;
        private String bookingId;

        public Builder withUaId(String uaId) {
            this.uaId = uaId;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }
        public Builder withPassword(String password) {
            this.password = password;
            return this;
        }
        public Builder withUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public Builder withStatus(String status) {
            this.status = status;
            return this;
        }
        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder withContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }
        public Builder withAddressId(String addressId) {
            this.addressId = addressId;
            return this;
        }
        public Builder withBirthDate(String birthDate) {
            this.birthdate = birthDate;
            return this;
        }
        public Builder withGender(String gender) {
            this.gender = gender;
            return this;
        }
        public Builder withInbox(Set<String> inbox) {
            this.inbox = inbox;
            return this;
        }
        public Builder withAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public Builder withBackgroundChecked(Boolean backgroundChecked) {
            this.backgroundChecked = backgroundChecked;
            return this;
        }
        public Builder withExperience(String experience) {
            this.experience = experience;
            return this;
        }
        public Builder withBusinessHours(List<String> businessHours) {
            this.businessHours = businessHours;
            return this;
        }
        public Builder withAvailability(List<LocalDateTime> availability) {
            this.availability = availability;
            return this;
        }
        public Builder withBookingId(String bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public UserAccountModel build() {return new UserAccountModel(this);}

    }
}
