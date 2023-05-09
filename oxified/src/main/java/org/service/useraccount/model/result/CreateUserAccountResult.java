package main.java.org.service.useraccount.model.result;


import main.java.org.service.useraccount.model.UserAccountModel;

import java.util.Objects;

public class CreateUserAccountResult {
    private UserAccountModel userAccount;

    public CreateUserAccountResult(Builder builder) {
        this.userAccount = builder.userAccount;
    }
    public UserAccountModel getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccountModel userAccount) {
        this.userAccount = userAccount;
    }

    public static Builder builder() {return new Builder();}

    public final static class Builder {
        private UserAccountModel userAccount;

        public Builder withUserAccount(UserAccountModel userAccount) {
            this.userAccount = userAccount;
            return this;
        }

        public CreateUserAccountResult build() {
            return new CreateUserAccountResult(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreateUserAccountResult)) return false;
        CreateUserAccountResult that = (CreateUserAccountResult) o;
        return getUserAccount().equals(that.getUserAccount());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserAccount());
    }

    @Override
    public String toString() {
        return "CreateUserAccountResult{" +
                "userAccount=" + userAccount +
                '}';
    }
}
