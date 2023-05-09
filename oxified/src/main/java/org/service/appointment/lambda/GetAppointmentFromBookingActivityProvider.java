package main.java.org.service.appointment.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.org.dependency.DaggerServiceComponent;
import main.java.org.dependency.ServiceComponent;
import main.java.org.service.appointment.models.requests.GetAppointmentFromBookingRequest;
import main.java.org.service.appointment.models.results.GetAppointmentFromBookingResult;

public class GetAppointmentFromBookingActivityProvider
        implements RequestHandler<GetAppointmentFromBookingRequest, GetAppointmentFromBookingResult> {
    private static ServiceComponent dagger = DaggerServiceComponent.create();

    public GetAppointmentFromBookingActivityProvider() {
    }

    @Override
    public GetAppointmentFromBookingResult handleRequest(GetAppointmentFromBookingRequest request, Context context) {
        return dagger.provideGetAppointmentFromBookingActivity().handleRequest(request, context);
    }
}
