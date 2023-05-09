package main.java.org.service.spservice.models.result;

import main.java.org.service.spservice.models.ServiceModel;

import java.util.Objects;

public class CreateServiceResult {
    private ServiceModel serviceModel;

    public CreateServiceResult() {
    }
    private CreateServiceResult(Builder builder) {
        this.serviceModel = builder.serviceModel;
    }

    public ServiceModel getServiceModel() {
        return serviceModel;
    }

    public void setServiceModel(ServiceModel serviceModel) {
        this.serviceModel = serviceModel;
    }

    public static Builder builder(){
        return new Builder();
    }

    public final static class Builder{
        private ServiceModel serviceModel;

        public Builder setServiceModel(ServiceModel serviceModel) {
            this.serviceModel = serviceModel;
            return this;
        }

        public CreateServiceResult build() {
            return new CreateServiceResult(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreateServiceResult)) return false;
        CreateServiceResult that = (CreateServiceResult) o;
        return serviceModel.equals(that.serviceModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceModel);
    }

    @Override
    public String toString() {
        return "CreateServiceResult{" +
                "serviceModel=" + serviceModel +
                '}';
    }
}
