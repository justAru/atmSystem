package com.example.atmsystem.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Data
//@Entity
@Component
public class Account {
//    @Id
    private String cardNumber;
    private long balance;
    private String pin;

//    @ManyToOne
//    private Bank bank;
    public Account(String cardNumber, long balance, String pin) {
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.pin = pin;
//        this.bank = bank;
    }

    public Account() {
    }

}
