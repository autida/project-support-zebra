package main.java.org.service.spservice.models;

import java.math.BigDecimal;
import java.util.Objects;

public class ServiceModel {
    String serviceId;
    String uaId;
    String description;
    BigDecimal serviceTypeCost;
    String category;
    String serviceType;
    String status;


    public ServiceModel(Builder builder) {
        this.serviceId = builder.serviceId;
        this.uaId = builder.uaId;
        this.description = builder.description;
        this.serviceTypeCost = builder.serviceTypeCost;
        this.category = builder.category;
        this.serviceType = builder.serviceType;
        this.status = builder.status;
    }
    public String getServiceId() {
        return serviceId;
    }

    public ServiceModel setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    public String getUaId() {
        return uaId;
    }

    public ServiceModel setUaId(String uaId) {
        this.uaId = uaId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ServiceModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public BigDecimal getServiceTypeCost() {
        return serviceTypeCost;
    }

    public ServiceModel setServiceTypeCost(BigDecimal serviceTypeCost) {
        this.serviceTypeCost = serviceTypeCost;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public ServiceModel setCategory(String category) {
        this.category = category;
        return this;
    }

    public String getServiceType() {
        return serviceType;
    }

    public ServiceModel setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ServiceModel setStatus(String status) {
        this.status = status;
        return this;
    }
    public static Builder builder() {
        return new Builder();
    }
    public final static class Builder {
        String serviceId;
        String uaId;
        String description;
        BigDecimal serviceTypeCost;
        String category;
        String serviceType;
        String status;

        public Builder setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public Builder setUaId(String uaId) {
            this.uaId = uaId;
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

        public ServiceModel build() {
            return new ServiceModel(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ServiceModel)) return false;
        ServiceModel that = (ServiceModel) o;
        return getServiceId().equals(that.getServiceId()) && getUaId().equals(that.getUaId()) && Objects.equals(getDescription(), that.getDescription()) && Objects.equals(getServiceTypeCost(), that.getServiceTypeCost()) && Objects.equals(getCategory(), that.getCategory()) && Objects.equals(getServiceType(), that.getServiceType()) && Objects.equals(getStatus(), that.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getServiceId(), getUaId(), getDescription(), getServiceTypeCost(), getCategory(), getServiceType(), getStatus());
    }

    @Override
    public String toString() {
        return "ServiceModel{" +
                "serviceId='" + serviceId + '\'' +
                ", uaId='" + uaId + '\'' +
                ", description='" + description + '\'' +
                ", serviceTypeCost=" + serviceTypeCost +
                ", category='" + category + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
