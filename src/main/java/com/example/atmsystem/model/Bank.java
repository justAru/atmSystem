package com.example.atmsystem.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;


@Data
//@Entity
@Component
public class Bank {
//    @Id
    private String name;

//    @OneToMany
    private List<Account> accounts;

    @Autowired
    public Bank(@Value("${bank.name}") String name) {
        this.name = name;
        this.accounts = accounts;
    }

    public Bank() {
    }
}
