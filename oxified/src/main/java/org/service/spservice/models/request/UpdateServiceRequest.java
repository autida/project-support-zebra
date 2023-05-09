package main.java.org.service.spservice.models.request;

import com.amazonaws.services.dynamodbv2.model.Update;

import java.math.BigDecimal;
import java.util.Objects;

public class UpdateServiceRequest {
    private String uaId;
    private String serviceId;
    private String description;
    private BigDecimal serviceTypeCost;
    private String category;
    private String serviceType;
    private String status;

    public UpdateServiceRequest() {}

    public UpdateServiceRequest(Builder builder) {
        this.uaId = builder.uaId;
        this.serviceId = builder.serviceId;
        this.description = builder.description;
        this.serviceType = builder.serviceType;
        this.serviceTypeCost = builder.serviceTypeCost;
        this.category = builder.category;
        this.status = builder.status;
    }

    public String getUaId() {
        return uaId;
    }

    public UpdateServiceRequest setUaId(String uaId) {
        this.uaId = uaId;
        return this;
    }

    public String getServiceId() {
        return serviceId;
    }

    public UpdateServiceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getServiceTypeCost() {
        return serviceTypeCost;
    }

    public void setServiceTypeCost(BigDecimal serviceTypeCost) {
        this.serviceTypeCost = serviceTypeCost;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public final static class Builder {
        private String uaId;
        private String serviceId;
        private String description;
        private BigDecimal serviceTypeCost;
        private String category;
        private String serviceType;
        private String status;

        public Builder setUaId(String uaId) {
            this.uaId = uaId;
            return this;
        }

        public Builder setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setServiceTypeCost(BigDecimal serviceTypeCost) {
            this.serviceTypeCost = serviceTypeCost;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }
        public UpdateServiceRequest build() {return new UpdateServiceRequest(this);}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UpdateServiceRequest)) return false;
        UpdateServiceRequest that = (UpdateServiceRequest) o;
        return Objects.equals(description, that.description) && Objects.equals(serviceTypeCost, that.serviceTypeCost) && Objects.equals(category, that.category) && Objects.equals(serviceType, that.serviceType) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, serviceTypeCost, category, serviceType, status);
    }

    @Override
    public String toString() {
        return "UpdateServiceRequest{" +
                "description='" + description + '\'' +
                ", serviceTypeCost=" + serviceTypeCost +
                ", category='" + category + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
