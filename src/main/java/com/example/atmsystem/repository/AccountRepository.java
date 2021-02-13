package com.example.atmsystem.repository;

import com.example.atmsystem.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
    List<Account> getAllByBalance(Long balance);
//    Account getById(Long id);
}
