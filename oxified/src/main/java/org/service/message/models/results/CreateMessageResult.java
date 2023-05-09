package main.java.org.service.message.models.results;


import main.java.org.service.message.models.MessageModel;

import java.util.Objects;

public class CreateMessageResult {

MessageModel messageModel;

    public CreateMessageResult() {
    }

    public CreateMessageResult(CreateMessageResultBuilder builder) {
        this.messageModel = builder.messageModel;
    }

    public MessageModel getMessageModel() {
        return messageModel;
    }

    public void setMessageModel(MessageModel messageModel) {
        this.messageModel = messageModel;
    }

    public static CreateMessageResultBuilder builder() {
        return new CreateMessageResultBuilder();
    }
    public final static class CreateMessageResultBuilder {
        MessageModel messageModel;
        public CreateMessageResultBuilder() {
        }

        public CreateMessageResultBuilder withMessageModel(MessageModel messageModel) {
            this.messageModel = messageModel;
            return this;
        }
        public CreateMessageResult build() {
            return new CreateMessageResult(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (! ( o instanceof CreateMessageResultBuilder )) return false;
            CreateMessageResultBuilder that = (CreateMessageResultBuilder) o;
            return messageModel.equals(that.messageModel);
        }

        @Override
        public int hashCode() {
            return Objects.hash(messageModel);
        }
    }
}
