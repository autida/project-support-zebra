package main.java.org.service.useraccount.model.request;

import java.util.Objects;

public class GetUserAccountRequest {
    private String uaId;
    private String userType;

    public GetUserAccountRequest() {
    }

    public GetUserAccountRequest(Builder builder) {
        this.uaId = builder.uaId;
        this.userType = builder.userType;
    }

    public String getUaId() {
        return uaId;
    }

    public void setUaId(String uaId) {
        this.uaId = uaId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String uaId;
        private String userType;

        private Builder() {

        }

        public Builder withUaId(String uaIdToUse) {
            this.uaId = uaIdToUse;
            return this;
        }

        public Builder withUserType(String userTypeToUse) {
            this.userType = userTypeToUse;
            return this;
        }

        public GetUserAccountRequest build() {
            return new GetUserAccountRequest(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GetUserAccountRequest)) return false;
        GetUserAccountRequest that = (GetUserAccountRequest) o;
        return getUaId().equals(that.getUaId()) && getUserType().equals(that.getUserType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUaId(), getUserType());
    }

    @Override
    public String toString() {
        return "GetUserAccountRequest{" +
                "uaId='" + uaId + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }


}
