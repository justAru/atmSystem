package com.example.atmsystem.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
@Component

public class Account {
    @Id
    private String cardNumber;
    private long balance;
    private String pin;

    @ManyToOne
    private Bank bank;

    @Autowired
    public Account(@Value("${account.cardNumber}") String cardNumber, @Value("${account.balance}") long balance, @Value("${account.pin}") String pin) {
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public Account() {
    }
}
