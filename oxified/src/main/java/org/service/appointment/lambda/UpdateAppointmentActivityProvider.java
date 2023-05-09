package main.java.org.service.appointment.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.org.dependency.DaggerServiceComponent;
import main.java.org.dependency.ServiceComponent;
import main.java.org.service.appointment.models.requests.UpdateAppointmentRequest;
import main.java.org.service.appointment.models.results.UpdateAppointmentResult;

public class UpdateAppointmentActivityProvider
        implements RequestHandler<UpdateAppointmentRequest, UpdateAppointmentResult> {
    private static ServiceComponent dagger = DaggerServiceComponent.create();

    public UpdateAppointmentActivityProvider() {
    }

    @Override
    public UpdateAppointmentResult handleRequest(UpdateAppointmentRequest request, Context context) {
        return dagger.provideUpdateAppointmentActivity().handleRequest(request, context);
    }
}
