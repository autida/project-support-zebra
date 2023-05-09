package main.java.org.service.message.activity;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.org.exceptions.InvalidAttributeValueException;
import main.java.org.service.message.converter.MessageConverter;
import main.java.org.service.message.dynamodb.UserMessageDao;
import main.java.org.service.message.dynamodb.models.UserMessage;
import main.java.org.service.message.models.MessageModel;
import main.java.org.service.message.models.request.CreateMessageRequest;
import main.java.org.service.message.models.results.CreateMessageResult;
import main.java.org.service.message.util.MessageUtils;
import main.java.org.service.spservice.dynamodb.ServiceDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;

public class CreateMessageActivity implements RequestHandler<CreateMessageRequest, CreateMessageResult> {
    private Logger log = LogManager.getLogger();
    private UserMessageDao messageDao;

    @Inject
    public CreateMessageActivity(UserMessageDao messageDao) {
        this.messageDao = messageDao;
    }
    /**
     * Handles a Lambda Function request
     *
     * @param input   The Lambda Function input
     * @param context The Lambda execution environment context object.
     * @return The Lambda Function output
     */
    @Override
    public CreateMessageResult handleRequest(CreateMessageRequest input, Context context) {
        log.info("Received CreateMessage Request {}", input);
        if(MessageUtils.isValid(input.getMessageId())) {
            throw new InvalidAttributeValueException();
        }
        UserMessage message = new UserMessage();
        message.setMessageBody(input.getMessageBody());
        message.setReceiverUaid(input.getReceiverUaid());
        message.setSenderUaid(input.getSenderUaid());
        MessageModel messageModel = MessageConverter.toMessageModel(messageDao.saveMessage(message));
        return CreateMessageResult.builder()
                .withMessageModel(messageModel)
                .build();
    }
}
