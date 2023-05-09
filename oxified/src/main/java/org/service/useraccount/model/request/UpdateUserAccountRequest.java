package main.java.org.service.useraccount.model.request;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class UpdateUserAccountRequest {
    private String uaId;
    private String email;
    private String password;
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

    private UpdateUserAccountRequest(Builder builder) {
        this.uaId = builder.uaId;
        this.email = builder.email;
        this.password = builder.password;
        this.status = builder.status;
        this.lastName = builder.lastName;
        this.firstName = builder.firstName;
        this.contactNumber = builder.contactNumber;
        this.address = builder.address;
        this.birthdate = builder.birthdate;
        this.gender = builder.gender;
        this.inbox = builder.inbox;
        this.accountStatus = builder.accountStatus;
        this.backgroundChecked = builder.backgroundChecked;
        this.experience = builder.experience;
        this.businessHours = builder.businessHours;
        this.availability = builder.availability;
    }

    public UpdateUserAccountRequest() {
    }

    public String getEmail() {
        return email;
    }

    public String getUaId() {
        return uaId;
    }

    public void setUaId(String uaId) {
        this.uaId = uaId;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public static Builder builder() {return new Builder();}
    public static final class Builder {
        private String uaId;
        private String email;
        private String password;
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

        public Builder setUaId(String uaId) {
            this.uaId = uaId;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setUserType(String userType) {
            this.userType = userType;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setBirthdate(String birthdate) {
            this.birthdate = birthdate;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setInbox(Set<String> inbox) {
            this.inbox = inbox;
            return this;
        }

        public Builder setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }

        public Builder setBackgroundChecked(Boolean backgroundChecked) {
            this.backgroundChecked = backgroundChecked;
            return this;
        }

        public Builder setExperience(String experience) {
            this.experience = experience;
            return this;
        }

        public Builder setBusinessHours(List<String> businessHours) {
            this.businessHours = businessHours;
            return this;
        }

        public Builder setAvailability(List<LocalDateTime> availability) {
            this.availability = availability;
            return this;
        }

        public UpdateUserAccountRequest build() {return new UpdateUserAccountRequest(this);}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UpdateUserAccountRequest)) return false;
        UpdateUserAccountRequest that = (UpdateUserAccountRequest) o;
        return Objects.equals(getUaId(), that.getUaId()) && Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getPassword(), that.getPassword()) && Objects.equals(getUserType(), that.getUserType()) && Objects.equals(getStatus(), that.getStatus()) && Objects.equals(getLastName(), that.getLastName()) && Objects.equals(getFirstName(), that.getFirstName()) && Objects.equals(getContactNumber(), that.getContactNumber()) && Objects.equals(getAddress(), that.getAddress()) && Objects.equals(getBirthdate(), that.getBirthdate()) && Objects.equals(getGender(), that.getGender()) && Objects.equals(getInbox(), that.getInbox()) && Objects.equals(getAccountStatus(), that.getAccountStatus()) && Objects.equals(getBackgroundChecked(), that.getBackgroundChecked()) && Objects.equals(getExperience(), that.getExperience()) && Objects.equals(getBusinessHours(), that.getBusinessHours()) && Objects.equals(getAvailability(), that.getAvailability());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUaId(), getEmail(), getPassword(), getUserType(), getStatus(), getLastName(), getFirstName(), getContactNumber(), getAddress(), getBirthdate(), getGender(), getInbox(), getAccountStatus(), getBackgroundChecked(), getExperience(), getBusinessHours(), getAvailability());
    }

    @Override
    public String toString() {
        return "UpdateUserAccountRequest{" +
                "uaId='" + uaId + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", userType='" + userType + '\'' +
                ", status='" + status + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", address='" + address + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", gender='" + gender + '\'' +
                ", inbox=" + inbox +
                ", accountStatus='" + accountStatus + '\'' +
                ", backgroundChecked=" + backgroundChecked +
                ", experience='" + experience + '\'' +
                ", businessHours=" + businessHours +
                ", availability=" + availability +
                '}';
    }
}
