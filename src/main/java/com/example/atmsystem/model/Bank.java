package com.example.atmsystem.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
@Component
public class Bank {
    @Id
    private String name;

    @OneToMany
    private final List<Account> accounts;

    @Autowired
    public Bank(@Value("${bank.name}") String name, List<Account> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public Bank() {
        this.accounts = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }


}
