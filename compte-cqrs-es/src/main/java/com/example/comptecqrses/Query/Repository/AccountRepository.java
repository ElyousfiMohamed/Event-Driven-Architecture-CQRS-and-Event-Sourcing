package com.example.comptecqrses.Query.Repository;

import com.example.comptecqrses.Query.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {

}

