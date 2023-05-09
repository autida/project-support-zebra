package main.java.org.service.appointment.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.org.dependency.DaggerServiceComponent;
import main.java.org.dependency.ServiceComponent;
import main.java.org.service.appointment.models.requests.CreateBookingRequest;
import main.java.org.service.appointment.models.results.CreateBookingResult;

public class CreateBookingActivityProvider implements RequestHandler<CreateBookingRequest, CreateBookingResult> {
    private static ServiceComponent dagger = DaggerServiceComponent.create();

    public CreateBookingActivityProvider() {
    }

    @Override
    public CreateBookingResult handleRequest(CreateBookingRequest request, Context context) {
        return dagger.provideCreateBookingActivity().handleRequest(request, context);
    }
}
