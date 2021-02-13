package com.example.atmsystem.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Bank {
    @Id
    private String name;

    @OneToMany
    private List<Account> accounts;
}
