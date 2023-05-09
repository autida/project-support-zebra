package main.java.org.service.useraccount.model.result;

import com.amazonaws.services.dynamodbv2.xspec.B;
import main.java.org.service.useraccount.model.UserAccountModel;
import main.java.org.service.useraccount.model.request.UpdateUserAccountRequest;

import java.util.Objects;

public class UpdateUserAccountResult {
    private UserAccountModel userAccount;

    public UpdateUserAccountResult(Builder builder) {
        this.userAccount = builder.userAccount;
    }

    public UserAccountModel getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccountModel userAccount) {
        this.userAccount = userAccount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public final static class Builder {
        private UserAccountModel userAccount;

        public Builder setUserAccount(UserAccountModel userAccount) {
            this.userAccount = userAccount;
            return this;
        }

        public UpdateUserAccountResult build() {
            return new UpdateUserAccountResult(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UpdateUserAccountResult)) return false;
        UpdateUserAccountResult that = (UpdateUserAccountResult) o;
        return getUserAccount().equals(that.getUserAccount());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserAccount());
    }

    @Override
    public String toString() {
        return "UpdateUserAccountResult{" +
                "userAccount=" + userAccount +
                '}';
    }
}
