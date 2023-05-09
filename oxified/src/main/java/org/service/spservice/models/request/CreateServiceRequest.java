package main.java.org.service.spservice.models.request;

import java.math.BigDecimal;
import java.util.Objects;

public class CreateServiceRequest {
    private String description;
    private String uaId;
    private BigDecimal serviceTypeCost;
    private String category;
    private String serviceType;
    private String status;

    public CreateServiceRequest() {
    }

    public CreateServiceRequest(Builder builder) {
        this.description = builder.description;
        this.serviceTypeCost = builder.serviceTypeCost;
        this.category = builder.category;
        this.serviceType = builder.serviceType;
        this.status = builder.status;
    }
    public static Builder builder() {
        return new Builder();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUaId() {
        return uaId;
    }

    public void setUaId(String uaId) {
        this.uaId = uaId;
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

    public static final class Builder{
        private String description;
        private String uaId;
        private BigDecimal serviceTypeCost;
        private String category;
        private String serviceType;
        private String status;


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

        public CreateServiceRequest build() {
            return new CreateServiceRequest(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreateServiceRequest)) return false;
        CreateServiceRequest that = (CreateServiceRequest) o;
        return Objects.equals(getDescription(), that.getDescription()) && Objects.equals(getServiceTypeCost(), that.getServiceTypeCost()) && Objects.equals(getCategory(), that.getCategory()) && Objects.equals(getServiceType(), that.getServiceType()) && Objects.equals(getStatus(), that.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescription(), getServiceTypeCost(), getCategory(), getServiceType(), getStatus());
    }

    @Override
    public String toString() {
        return "CreateServiceRequest{" +
                "description='" + description + '\'' +
                ", uaId='" + uaId + '\'' +
                ", serviceTypeCost=" + serviceTypeCost +
                ", category='" + category + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
