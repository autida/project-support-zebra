package main.java.org.service.useraccount.model.result;

import main.java.org.service.useraccount.model.UserAccountModel;

import java.util.Objects;


public class GetUserAccountResult{
    private UserAccountModel userAccountModel;

    private GetUserAccountResult(Builder builder) {
        this.userAccountModel = builder.userAccount;
    }

    public UserAccountModel getUserAccountModel() {
        return userAccountModel;
    }

    public void setUserAccountModel(UserAccountModel userAccountModel) {
        this.userAccountModel = userAccountModel;
    }

    public static final Builder builder() {
        return new Builder();
    }
    public static final class Builder {
        private UserAccountModel userAccount;

        public Builder withUserAccount(UserAccountModel userAccount) {
            this.userAccount = userAccount;
            return this;
        }

        public GetUserAccountResult build() {return new GetUserAccountResult(this);}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GetUserAccountResult)) return false;
        GetUserAccountResult that = (GetUserAccountResult) o;
        return getUserAccountModel().equals(that.getUserAccountModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserAccountModel());
    }

    @Override
    public String toString() {
        return "GetUserAccountResult{" +
                "userAccountModel=" + userAccountModel +
                '}';
    }
}
