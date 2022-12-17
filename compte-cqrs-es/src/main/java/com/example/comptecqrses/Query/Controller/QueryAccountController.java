package com.example.comptecqrses.Query.Controller;

import com.example.comptecqrses.CommonApi.Query.GetAccountQuery;
import com.example.comptecqrses.CommonApi.Query.GetAllAccountsQuery;
import com.example.comptecqrses.Query.Entity.Account;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "/api/v1/accountQueries")
public class QueryAccountController {
    private QueryGateway queryGateway;

    public QueryAccountController(QueryGateway queryGateway) {
        this.queryGateway = queryGateway;
    }

    @GetMapping(path = "/allAccounts")
    public List<Account> getAccounts() {
        return queryGateway.query(new GetAllAccountsQuery(), ResponseTypes.multipleInstancesOf(Account.class)).join();
    }
    
    @GetMapping(path="/getAccount/{id}")
    public Account getAccount(@PathVariable String id) {
        return queryGateway.query(new GetAccountQuery(id), ResponseTypes.instanceOf(Account.class)).join();
    }
}
