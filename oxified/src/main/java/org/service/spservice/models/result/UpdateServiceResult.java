package main.java.org.service.spservice.models.result;

import main.java.org.service.spservice.models.ServiceModel;

import java.util.Objects;

public class UpdateServiceResult {
    private ServiceModel serviceModel;

    public UpdateServiceResult(){}
    public UpdateServiceResult(Builder builder) {
        this.serviceModel = builder.serviceModel;
    }

    public ServiceModel getServiceModel() {
        return serviceModel;
    }

    public void setServiceModel(ServiceModel serviceModel) {
        this.serviceModel = serviceModel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public final static class Builder {
        private ServiceModel serviceModel;

        public Builder setServiceModel(ServiceModel serviceModel) {
            this.serviceModel = serviceModel;
            return this;
        }

        public UpdateServiceResult build() {
            return new UpdateServiceResult(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UpdateServiceResult)) return false;
        UpdateServiceResult that = (UpdateServiceResult) o;
        return getServiceModel().equals(that.getServiceModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getServiceModel());
    }

    @Override
    public String toString() {
        return "UpdateServiceResult{" +
                "serviceModel=" + serviceModel +
                '}';
    }
}
