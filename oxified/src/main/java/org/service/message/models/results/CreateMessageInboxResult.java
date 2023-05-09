package main.java.org.service.message.models.results;

import main.java.org.service.message.models.MessageInboxModel;

public class CreateMessageInboxResult {
  MessageInboxModel messageInboxModel;

    public CreateMessageInboxResult() {

    }

    public CreateMessageInboxResult(CreateMessageInboxResultBuilder builder) {
        this.messageInboxModel = builder.messageInboxModel;
    }

    public MessageInboxModel getCreateMessageInboxModel() {
        return messageInboxModel;
    }

    public void setCreateMessageInboxModel(MessageInboxModel createMessageInboxModel) {
        this.messageInboxModel = createMessageInboxModel;
    }

    public static CreateMessageInboxResultBuilder builder() {
        return new CreateMessageInboxResultBuilder();
    }
    public final static class CreateMessageInboxResultBuilder {
        MessageInboxModel messageInboxModel;

        public CreateMessageInboxResultBuilder() {
        }

        public CreateMessageInboxResultBuilder withMessageInboxModel(MessageInboxModel messageInboxModel) {
            this.messageInboxModel = messageInboxModel;
            return this;
        }
        public CreateMessageInboxResult build() {
            return new CreateMessageInboxResult(this);
        }
    }
}
