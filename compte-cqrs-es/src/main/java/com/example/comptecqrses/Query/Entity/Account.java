package com.example.comptecqrses.Query.Entity;

import javax.persistence.*;

import com.example.comptecqrses.CommonApi.Enum.AccountStatus;

import java.util.Collection;
import java.util.List;

@Entity
public class Account {
    @Id
    private String id;
    private double balance;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountStatus status;
    @OneToMany(mappedBy = "account")
    private Collection<OperationAccount> operations;


    public Account() {
    }

    public Account(String id, double balance, String currency, AccountStatus status) {
        this.id = id;
        this.balance = balance;
        this.currency = currency;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public Collection<OperationAccount> getOperations() {
        return operations;
    }

    public void setOperations(Collection<OperationAccount> operations) {
        this.operations = operations;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }
}
