package main.java.org.service.useraccount.converter;


import main.java.org.service.useraccount.dynamodb.model.UserAccount;
import main.java.org.service.useraccount.model.UserAccountModel;

public class ModelConverter {

    public UserAccountModel toUserAccountModel(UserAccount userAccount) {

        return UserAccountModel.builder()
                .withUaId(userAccount.getUaId())
                .withUserType(userAccount.getUserType())
                .withAccountStatus(userAccount.getAccountStatus())
                .withAddressId(userAccount.getAddress())
                .withBirthDate(userAccount.getBirthdate())
                .withEmail(userAccount.getEmail())
                .withPassword(userAccount.getPassword())
                .withStatus(userAccount.getStatus())
                .withLastName(userAccount.getLastName())
                .withFirstName(userAccount.getFirstName())
                .withContactNumber(userAccount.getContactNumber())
                .withAvailability(userAccount.getAvailability())
                .withBackgroundChecked(userAccount.getBackgroundChecked())
                .withExperience(userAccount.getExperience())
                .withBookingId(userAccount.getBookingId())
                .withGender(userAccount.getGender())
                .withInbox(userAccount.getInbox())
                .withBusinessHours(userAccount.getBusinessHours())
                .build();
    }
}
