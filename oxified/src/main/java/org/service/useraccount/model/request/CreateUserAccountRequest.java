package main.java.org.service.useraccount.model.request;

import java.util.List;
import java.util.Objects;

public class CreateUserAccountRequest {

    private String email;
    private String password;
    private String userType;
    private String status;
    private List<String> inboxes; //list of inbox ids
    private String bookingId;


    public CreateUserAccountRequest() {
    }
    public CreateUserAccountRequest(Builder builder) {
        this.email = builder.email;
        this.password = builder.password;
        this.userType = builder.userType;
        this.status = builder.status;
        this.inboxes = builder.inboxes;
        this.bookingId = builder.bookingId;
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

    public List<String> getInboxes() {
        return inboxes;
    }

    public void setInboxes(List<String> inboxes) {
        this.inboxes = inboxes;
    }

    public String getBookingId() {
        return bookingId;
    }

    public CreateUserAccountRequest setBookingId(String bookingId) {
        this.bookingId = bookingId;
        return this;
    }

    public static final Builder builder() {return new Builder();}
    public static final class Builder {
        private String email;
        private String password;
        private String userType;
        private String status;
        private List<String> inboxes;
        private String bookingId;

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
        public Builder withInboxes(List<String> inboxes) {
            this.inboxes = inboxes;
            return this;
        }

        public Builder setBookingId(String bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public CreateUserAccountRequest build(){ return new CreateUserAccountRequest(this);}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreateUserAccountRequest)) return false;
        CreateUserAccountRequest that = (CreateUserAccountRequest) o;
        return Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getPassword(), that.getPassword()) && getUserType().equals(that.getUserType()) && Objects.equals(getStatus(), that.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmail(), getPassword(), getUserType(), getStatus());
    }

    @Override
    public String toString() {
        return "CreateUserAccountRequest{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", userType='" + userType + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
