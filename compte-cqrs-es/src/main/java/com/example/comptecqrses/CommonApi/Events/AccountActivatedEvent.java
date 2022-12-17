package com.example.comptecqrses.CommonApi.Events;

import com.example.comptecqrses.CommonApi.Enum.AccountStatus;

public class AccountActivatedEvent extends BaseEvent<String> {
    private AccountStatus accountStatus;

    public AccountActivatedEvent(String id, AccountStatus accountStatus) {
        super(id);
        this.accountStatus = accountStatus;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }
}
