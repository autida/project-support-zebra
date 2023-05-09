package main.java.org.service.spservice.models.request;

import java.util.Objects;

public class GetServiceRequest {
    private String serviceId;
    private String uaId;

    public GetServiceRequest() {
    }

    public GetServiceRequest(Builder builder) {
        this.serviceId = builder.serviceId;
        this.uaId = builder.uaId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getUaId() {
        return uaId;
    }

    public void setUaId(String uaId) {
        this.uaId = uaId;
    }

    public final static class Builder{
        private String serviceId;
        private String uaId;

        public Builder setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public Builder setUaId(String uaId) {
            this.uaId = uaId;
            return this;
        }
        public GetServiceRequest build() {return new GetServiceRequest(this);}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GetServiceRequest)) return false;
        GetServiceRequest that = (GetServiceRequest) o;
        return getServiceId().equals(that.getServiceId()) && getUaId().equals(that.getUaId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getServiceId(), getUaId());
    }

    @Override
    public String toString() {
        return "GetServiceRequest{" +
                "serviceId='" + serviceId + '\'' +
                ", uaId='" + uaId + '\'' +
                '}';
    }
}
