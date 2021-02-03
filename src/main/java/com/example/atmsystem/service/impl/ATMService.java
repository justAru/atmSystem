package com.example.atmsystem.service.impl;

import com.example.atmsystem.service.iATMService;
import com.example.atmsystem.model.Account;
import com.example.atmsystem.model.Bank;

import java.util.Scanner;

public class ATMService implements iATMService {
    Scanner scanner = new Scanner(System.in);
    Bank bank = new Bank();

    public ATMService(Bank bank) {
        this.bank = bank;
    }

//    public void auth(int auth, Account acc) {
//        System.out.println("Input login:");
//        String login = scanner.next();
//        System.out.println("Input pin:");
//        String pin = scanner.next();
//        for (Account account : bank.getAccounts()) {
//            if (account.getCardNumber().equals(login) && account.getPin().equals(pin)) {
//                System.out.println(auth + "in auth method\n");
//                auth = 1;
//                System.out.println(auth + "after true in auth\n");
//                acc = account;
//            }
//        }
//    }

    @Override
    public void checkBalance() {
        System.out.println("login: ");
        String login = scanner.next();
        System.out.println("pin: ");
        String pin = scanner.next();
        for (Account account : bank.getAccounts()) {
            if (account.getCardNumber().equals(login) && account.getPin().equals(pin)) {
                System.out.println("balance: " + account.getBalance());
            }
        }
    }

    @Override
    public void withdraw() {
        System.out.println("login: ");
        String login = scanner.next();
        System.out.println("pin: ");
        String pin = scanner.next();
        for (Account account : bank.getAccounts()) {
            if (account.getCardNumber().equals(login) && account.getPin().equals(pin)) {
                System.out.println("Input: ");
                int amount = scanner.nextInt();
                account.setBalance(account.getBalance() - amount);
                System.out.println("balance: " + account.getBalance());
            }
        }
    }

    @Override
    public void topUp() {
        System.out.println("login: ");
        String login = scanner.next();
        System.out.println("pin: ");
        String pin = scanner.next();
        for (Account account : bank.getAccounts()) {
            if (account.getCardNumber().equals(login) && account.getPin().equals(pin)) {
                System.out.println("Input: ");
                int amount = scanner.nextInt();
                account.setBalance(account.getBalance() + amount);
                System.out.println("balance: " + account.getBalance());
            }
        }
    }
}
