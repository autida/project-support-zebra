package main.java.org.service.message.models.request;

import java.util.Objects;

public class CreateMessageInboxRequest {
    private String inboxId;
    private String messageBody;
    private String dateTime;
    private String senderUaid;
    private String receiverUaid;

    public CreateMessageInboxRequest() {
    }

    public CreateMessageInboxRequest(CreateMessageInboxBuilder builder) {
        this.inboxId = builder.inboxId;
        this.messageBody = builder.messageBody;
        this.dateTime = builder.dateTime;
        this.senderUaid = builder.senderUaid;
        this.receiverUaid = builder.receiverUaid;
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

    public static CreateMessageInboxBuilder builder() {
        return new CreateMessageInboxBuilder();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (! ( o instanceof CreateMessageInboxRequest )) return false;
        CreateMessageInboxRequest that = (CreateMessageInboxRequest) o;
        return Objects.equals(inboxId, that.inboxId) && messageBody.equals(that.messageBody) && Objects.equals(dateTime, that.dateTime) && senderUaid.equals(that.senderUaid) && receiverUaid.equals(that.receiverUaid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inboxId, messageBody, dateTime, senderUaid, receiverUaid);
    }

    public static class CreateMessageInboxBuilder {
        private String inboxId;
        private String messageBody;
        private String dateTime;
        private String senderUaid;
        private String receiverUaid;

        public CreateMessageInboxBuilder() {

        }

        public CreateMessageInboxBuilder withInboxId(String inboxId) {
            this.inboxId = inboxId;
            return this;
        }

        public CreateMessageInboxBuilder withMessageBody(String messageBody) {
            this.messageBody = messageBody;
            return this;
        }

        public CreateMessageInboxBuilder withDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }

        public CreateMessageInboxBuilder withSenderUaid(String senderUaid) {
            this.senderUaid = senderUaid;
            return this;
        }

        public CreateMessageInboxBuilder withReceiverUaid(String receiverUaid) {
            this.receiverUaid = receiverUaid;
            return this;
        }
        public CreateMessageInboxRequest build() {
            return new CreateMessageInboxRequest(this);
        }
    }

}
