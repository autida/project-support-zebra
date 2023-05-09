package main.java.org.service.message.dynamodb;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import main.java.org.service.message.dynamodb.models.UserMessage;

import javax.inject.Inject;
import java.util.Collections;
import java.util.List;

public class UserMessageDao {
    private DynamoDBMapper dynamoDBMapper;
    @Inject
    public UserMessageDao(DynamoDBMapper dynamoDBMapper) {
        this.dynamoDBMapper = dynamoDBMapper;
    }
    public List<UserMessage> getUserMessages(String inboxId) {
        return Collections.singletonList(dynamoDBMapper.load(UserMessage.class, inboxId));
    }

    public UserMessage saveMessage(UserMessage userMessage) {
        dynamoDBMapper.save(userMessage);
        return userMessage;
    }
}
