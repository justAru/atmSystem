package com.example.atmsystem.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Account {
    @Id
    private String cardNumber;
    private int balance;
    private String pin;

    @ManyToOne
    private Bank bank;

}
