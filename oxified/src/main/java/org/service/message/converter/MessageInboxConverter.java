package main.java.org.service.message.converter;

import main.java.org.service.message.dynamodb.models.UserMessageInbox;
import main.java.org.service.message.models.MessageInboxModel;

public class MessageInboxConverter {
    public static MessageInboxModel toMessageInboxModel(UserMessageInbox messageInbox) {
        return MessageInboxModel.builder()
                .withInboxId(messageInbox.getInboxId())
                .withDateTime(messageInbox.getDateTime())
                .withMessageBody(messageInbox.getMessageBody())
                .withReceiverUaid(messageInbox.getReceiverUaid())
                .withSenderUaid(messageInbox.getSenderUaid())
                .build();
    }
}
