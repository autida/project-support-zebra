package main.java.org.service.spservice.models.result;

import main.java.org.service.spservice.dynamodb.models.Service;

import java.util.List;

public class GetAllServicesPerSPResult {
    private List<Service> serviceList;

    private GetAllServicesPerSPResult(Builder builder) {
        this.serviceList = builder.serviceList;
    }
    public static Builder builder() {
        return new Builder();
    }

    public List<Service> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<Service> serviceList) {
        this.serviceList = serviceList;
    }

    public final static class Builder {
        List<Service> serviceList;

        public Builder setServiceList(List<Service> serviceList) {
            this.serviceList = serviceList;
            return this;
        }

        public GetAllServicesPerSPResult build() {
            return new GetAllServicesPerSPResult(this);
        }
    }
}
