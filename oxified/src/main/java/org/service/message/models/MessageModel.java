package main.java.org.service.message.models;

import main.java.org.service.message.models.results.CreateMessageResult;

import java.util.Arrays;

public class MessageModel {

    private String messageId;
    private String inboxId;
    private String messageBody;
    private String dateTime;
    private String senderUaid;
    private String receiverUaid;

    public MessageModel() {
    }

    public MessageModel(MessageModelBuilder builder) {
        this.messageId = builder.messageId;
        this.inboxId = builder.inboxId;
        this.messageBody = builder.messageBody;
        this.dateTime = builder.dateTime;
        this.senderUaid = builder.senderUaid;
        this.receiverUaid = builder.receiverUaid;
    }

    public static final MessageModelBuilder builder() {
        return new MessageModelBuilder();
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getInboxId() {
        return inboxId;
    }

    public void setInboxId(String inboxId) {
        this.inboxId = inboxId;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getSenderUaid() {
        return senderUaid;
    }

    public void setSenderUaid(String senderUaid) {
        this.senderUaid = senderUaid;
    }

    public String getReceiverUaid() {
        return receiverUaid;
    }

    public void setReceiverUaid(String receiverUaid) {
        this.receiverUaid = receiverUaid;
    }

    public static final class MessageModelBuilder {
        private String messageId;
        private String inboxId;
        private String messageBody;
        private String dateTime;
        private String senderUaid;
        private String receiverUaid = "fdsa";


        public MessageModelBuilder() {


        }

        public MessageModelBuilder withMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        public MessageModelBuilder withInboxId(String inboxId) {
            this.inboxId = inboxId;
            return this;
        }

        public MessageModelBuilder withMessageBody(String messageBody) {
            this.messageBody = messageBody;
            return this;
        }

        public MessageModelBuilder withDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }

        public MessageModelBuilder withSenderUaid(String senderUaid) {
            this.senderUaid = senderUaid;
            return this;
        }

        public MessageModelBuilder withReceiverUaid(String receiverUaid) {
            this.receiverUaid = receiverUaid;
            return this;
        }

        public MessageModel build() {
            return new MessageModel(this);
        }
    }
}

