package main.java.org.service.appointment.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.org.dependency.DaggerServiceComponent;
import main.java.org.dependency.ServiceComponent;
import main.java.org.service.appointment.models.requests.AddAppointmentToBookingRequest;
import main.java.org.service.appointment.models.results.AddAppointmentToBookingResult;

public class AddAppointmentToBookingActivityProvider
        implements RequestHandler<AddAppointmentToBookingRequest, AddAppointmentToBookingResult> {
    private static ServiceComponent dagger = DaggerServiceComponent.create();

    public AddAppointmentToBookingActivityProvider() {
    }

    @Override
    public AddAppointmentToBookingResult handleRequest(AddAppointmentToBookingRequest request, Context context) {
        return dagger.provideAddAppointmentToBookingActivity().handleRequest(request, context);
    }
}
