package main.java.org.dependency;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import main.java.org.service.appointment.activity.AddAppointmentToBookingActivity;
import main.java.org.service.appointment.activity.CreateBookingActivity;
import main.java.org.service.appointment.activity.GetAppointmentFromBookingActivity;
import main.java.org.service.appointment.activity.GetBookingActivity;
import main.java.org.service.appointment.activity.UpdateAppointmentActivity;
import main.java.org.service.appointment.dynamodb.AppointmentDao;
import main.java.org.service.appointment.dynamodb.BookingDao;
import main.java.org.service.message.activity.CreateMessageActivity;
import main.java.org.service.message.activity.CreateMessageInboxIdActivity;
import main.java.org.service.message.activity.GetInboxPerLoggedInUserActivity;
import main.java.org.service.message.activity.GetMessagesPerInboxIdActivity;
import main.java.org.service.message.dynamodb.UserMessageDao;
import main.java.org.service.message.dynamodb.UserMessageInboxDao;
import main.java.org.service.spservice.acitivity.CreateServiceActivity;
import main.java.org.service.spservice.acitivity.GetAllServicesPerSPActivity;
import main.java.org.service.spservice.acitivity.GetServiceActivity;
import main.java.org.service.spservice.acitivity.UpdateServiceActivity;
import main.java.org.service.spservice.dynamodb.ServiceDao;
import main.java.org.service.useraccount.activity.CreateUserAccountActivity;
import main.java.org.service.useraccount.activity.GetUserAccountActivity;
import main.java.org.service.useraccount.activity.UpdateUserAccountActivity;
import main.java.org.service.useraccount.activity.UserAuthenticationActivity;
import main.java.org.service.useraccount.dynamodb.UserAccountDao;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerServiceComponent {
  private DaggerServiceComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static ServiceComponent create() {
    return new Builder().build();
  }

  public static final class Builder {
    private DaoModule daoModule;

    private Builder() {
    }

    public Builder daoModule(DaoModule daoModule) {
      this.daoModule = Preconditions.checkNotNull(daoModule);
      return this;
    }

    public ServiceComponent build() {
      if (daoModule == null) {
        this.daoModule = new DaoModule();
      }
      return new ServiceComponentImpl(daoModule);
    }
  }

  private static final class ServiceComponentImpl implements ServiceComponent {
    private final ServiceComponentImpl serviceComponentImpl = this;

    private Provider<DynamoDBMapper> provideDBMapperProvider;

    private ServiceComponentImpl(DaoModule daoModuleParam) {

      initialize(daoModuleParam);

    }

    private UserAccountDao userAccountDao() {
      return new UserAccountDao(provideDBMapperProvider.get());
    }

    private ServiceDao serviceDao() {
      return new ServiceDao(provideDBMapperProvider.get());
    }

    private BookingDao bookingDao() {
      return new BookingDao(provideDBMapperProvider.get());
    }

    private AppointmentDao appointmentDao() {
      return new AppointmentDao(provideDBMapperProvider.get());
    }

    private UserMessageInboxDao userMessageInboxDao() {
      return new UserMessageInboxDao(provideDBMapperProvider.get());
    }

    private UserMessageDao userMessageDao() {
      return new UserMessageDao(provideDBMapperProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final DaoModule daoModuleParam) {
      this.provideDBMapperProvider = DoubleCheck.provider(DaoModule_ProvideDBMapperFactory.create(daoModuleParam));
    }

    @Override
    public CreateUserAccountActivity provideCreateUserAccountActivity() {
      return new CreateUserAccountActivity(userAccountDao());
    }

    @Override
    public GetUserAccountActivity provideGetUserAccountActivity() {
      return new GetUserAccountActivity(userAccountDao());
    }

    @Override
    public UpdateUserAccountActivity provideUpdateUserAccountActivity() {
      return new UpdateUserAccountActivity(userAccountDao());
    }

    @Override
    public GetServiceActivity provideGetServiceActivity() {
      return new GetServiceActivity(serviceDao());
    }

    @Override
    public CreateServiceActivity provideCreateService() {
      return new CreateServiceActivity(serviceDao());
    }

    @Override
    public UpdateServiceActivity provideUpdateServiceActivity() {
      return new UpdateServiceActivity(serviceDao());
    }

    @Override
    public GetAllServicesPerSPActivity provideGetAllServicesPerSPActivity() {
      return new GetAllServicesPerSPActivity(serviceDao());
    }

    @Override
    public CreateBookingActivity provideCreateBookingActivity() {
      return new CreateBookingActivity(bookingDao());
    }

    @Override
    public GetBookingActivity provideGetBookingActivity() {
      return new GetBookingActivity(bookingDao());
    }

    @Override
    public GetAppointmentFromBookingActivity provideGetAppointmentFromBookingActivity() {
      return new GetAppointmentFromBookingActivity(appointmentDao());
    }

    @Override
    public AddAppointmentToBookingActivity provideAddAppointmentToBookingActivity() {
      return new AddAppointmentToBookingActivity(appointmentDao(), bookingDao());
    }

    @Override
    public UpdateAppointmentActivity provideUpdateAppointmentActivity() {
      return new UpdateAppointmentActivity(appointmentDao());
    }

    @Override
    public CreateMessageInboxIdActivity provideCreateMessageInboxActivity() {
      return new CreateMessageInboxIdActivity(userMessageInboxDao());
    }

    @Override
    public CreateMessageActivity provideCreateMessageActivity() {
      return new CreateMessageActivity(userMessageDao());
    }

    @Override
    public GetInboxPerLoggedInUserActivity provideGetInboxPerLoggedInUserActivity() {
      return new GetInboxPerLoggedInUserActivity(userMessageInboxDao());
    }

    @Override
    public GetMessagesPerInboxIdActivity provideGetMessagesPerInboxIdActivity() {
      return new GetMessagesPerInboxIdActivity(userMessageDao());
    }

    @Override
    public UserAuthenticationActivity provideUserAuthenticationActivity() {
      return new UserAuthenticationActivity(userAccountDao());
    }
  }
}
