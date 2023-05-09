package main.java.org.service.message.activity;

import main.java.org.service.message.dynamodb.UserMessageInboxDao;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import javax.inject.Inject;

public class GetInboxPerLoggedInUserActivity  {
    private Logger log = LogManager.getLogger();
    private UserMessageInboxDao messageInboxDao;
@Inject
    public GetInboxPerLoggedInUserActivity(UserMessageInboxDao messageInboxDao) {
        this.messageInboxDao = messageInboxDao;
    }
}
