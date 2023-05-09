package main.java.org.service.message.models;

public class MessageInboxModel {
    private String inboxId;
    private String messageBody;
    private String dateTime;
    private String senderUaid;
    private String receiverUaid;

    public MessageInboxModel() {
    }

    public MessageInboxModel(MessageInboxModelBuilder builder) {
        inboxId = builder.inboxId;
        messageBody = builder.messageBody;
        dateTime = builder.dateTime;
        senderUaid = builder.senderUaid;
        receiverUaid = builder.receiverUaid;
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
    public static MessageInboxModelBuilder builder() {
        return new MessageInboxModelBuilder();
    }
    public static class MessageInboxModelBuilder {
        private String inboxId;
        private String messageBody;
        private String dateTime;
        private String senderUaid;
        private String receiverUaid;

        public MessageInboxModelBuilder() {

        }


        public MessageInboxModelBuilder withInboxId(String inboxId) {
            this.inboxId = inboxId;
            return this;
        }


        public MessageInboxModelBuilder withMessageBody(String messageBody) {
            this.messageBody = messageBody;
            return this;
        }
        public MessageInboxModelBuilder withDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public MessageInboxModelBuilder withSenderUaid(String senderUaid) {
            this.senderUaid = senderUaid;
            return this;
        }
        public MessageInboxModelBuilder withReceiverUaid(String receiverUaid) {
            this.receiverUaid = receiverUaid;
            return this;
        }

        public MessageInboxModel build() {
            return new MessageInboxModel(this);
        }
    }
}
