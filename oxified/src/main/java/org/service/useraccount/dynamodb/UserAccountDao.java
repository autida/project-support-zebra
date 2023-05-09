package main.java.org.service.useraccount.dynamodb;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBQueryExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import main.java.org.service.useraccount.dynamodb.model.UserAccount;
import org.mindrot.jbcrypt.BCrypt;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserAccountDao {
    private final DynamoDBMapper dynamoDBMapper;
    @Inject
    public UserAccountDao(DynamoDBMapper dynamoDBMapper) {
        this.dynamoDBMapper = dynamoDBMapper;
    }

    public UserAccount getUserAccount(String uaId, String userType) {
        return dynamoDBMapper.load(UserAccount.class, uaId, userType);
    }

    public UserAccount saveUserAccount(UserAccount userAccount) {
        dynamoDBMapper.save(userAccount);
        return userAccount;
    }

    public UserAccount authenticateUser(String email, String password) {
        UserAccount user = null;
        Map<String, AttributeValue> attributeValues = new HashMap<>();
        attributeValues.put(":email", new AttributeValue().withS(email));
        DynamoDBQueryExpression<UserAccount> queryExpression = new DynamoDBQueryExpression<UserAccount>()
                .withIndexName("email-index")
                .withKeyConditionExpression("email = :email")
                .withExpressionAttributeValues(attributeValues)
                .withConsistentRead(false);
        List<UserAccount> result = dynamoDBMapper.query(UserAccount.class, queryExpression);
//        if (result.size() > 0) {
            UserAccount rawUser = result.get(0);
            String storedHashedPassword = rawUser.getPassword();
            if(BCrypt.checkpw(password, storedHashedPassword)) {
                 user = rawUser;
            }
//        }
        return user;
    }
}
