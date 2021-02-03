package com.example.atmsystem.model;

import lombok.Data;

@Data
public class Account {
    private String cardNumber;
    private int balance;
    private String pin;

}
