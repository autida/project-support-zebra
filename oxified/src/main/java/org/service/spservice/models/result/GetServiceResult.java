package main.java.org.service.spservice.models.result;

import main.java.org.service.spservice.models.ServiceModel;

import java.util.Objects;

public class GetServiceResult {
    private ServiceModel service;

    public GetServiceResult(Builder builder) {
        this.service = builder.service;
    }
    public static Builder builder() {
        return new Builder();
    }

    public ServiceModel getService() {
        return service;
    }

    public GetServiceResult setService(ServiceModel service) {
        this.service = service;
        return this;
    }

    public final static class Builder {
        private ServiceModel service;

        public Builder setService(ServiceModel service) {
            this.service = service;
            return this;
        }

        public GetServiceResult build() {
            return new GetServiceResult(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GetServiceResult)) return false;
        GetServiceResult that = (GetServiceResult) o;
        return getService().equals(that.getService());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getService());
    }

    @Override
    public String toString() {
        return "GetServiceResult{" +
                "service=" + service +
                '}';
    }
}
