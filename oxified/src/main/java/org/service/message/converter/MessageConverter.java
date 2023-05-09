package main.java.org.service.message.converter;

import main.java.org.service.message.dynamodb.models.UserMessage;
import main.java.org.service.message.models.MessageModel;

public class MessageConverter {
    public static MessageModel toMessageModel(UserMessage message) {
        return MessageModel.builder()
                .withInboxId(message.getInboxId())
                .withMessageBody(message.getMessageBody())
                .withSenderUaid(message.getSenderUaid())
                .withDateTime(message.getDateTime())
                .withReceiverUaid(message.getReceiverUaid())
                .withMessageId(message.getMessageId())
                .build();
    }
}
