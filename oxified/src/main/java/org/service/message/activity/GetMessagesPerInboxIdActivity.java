package main.java.org.service.message.activity;

import main.java.org.service.message.dynamodb.UserMessageDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;

public class GetMessagesPerInboxIdActivity {
    private Logger log = LogManager.getLogger();
    private UserMessageDao messageDao;
    @Inject
    public GetMessagesPerInboxIdActivity(UserMessageDao messageDao) {
        this.messageDao = messageDao;
    }
}
