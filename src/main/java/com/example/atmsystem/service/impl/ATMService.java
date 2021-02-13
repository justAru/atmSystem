package com.example.atmsystem.service.impl;

import com.example.atmsystem.repository.AccountRepository;
import com.example.atmsystem.service.iATMService;
import com.example.atmsystem.model.Account;
import com.example.atmsystem.model.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class ATMService {
//    Scanner scanner = new Scanner(System.in);
//    Bank bank = new Bank();

    @Autowired
    AccountRepository accountRepository;

    public List<Account> getAllByBalance(Long bal){
        return accountRepository.getAllByBalance(bal);
    }

//    public ATMService(Bank bank) {
//        this.bank = bank;
//    }



//    @Override
//    public void checkBalance() {
//        System.out.println("login: ");
//        String login = scanner.next();
//        System.out.println("pin: ");
//        String pin = scanner.next();
//        for (Account account : bank.getAccounts()) {
//            if (account.getCardNumber().equals(login) && account.getPin().equals(pin)) {
//                System.out.println("balance: " + account.getBalance());
//            }
//        }
//    }
//
//    @Override
//    public void withdraw() {
//        System.out.println("login: ");
//        String login = scanner.next();
//        System.out.println("pin: ");
//        String pin = scanner.next();
//        for (Account account : bank.getAccounts()) {
//            if (account.getCardNumber().equals(login) && account.getPin().equals(pin)) {
//                System.out.println("Input: ");
//                int amount = scanner.nextInt();
//                account.setBalance(account.getBalance() - amount);
//                System.out.println("balance: " + account.getBalance());
//            }
//        }
//    }
//
//    @Override
//    public void topUp() {
//        System.out.println("login: ");
//        String login = scanner.next();
//        System.out.println("pin: ");
//        String pin = scanner.next();
//        for (Account account : bank.getAccounts()) {
//            if (account.getCardNumber().equals(login) && account.getPin().equals(pin)) {
//                System.out.println("Input: ");
//                int amount = scanner.nextInt();
//                account.setBalance(account.getBalance() + amount);
//                System.out.println("balance: " + account.getBalance());
//            }
//        }
//    }

    public List<Account> getAll(){
        return accountRepository.findAll();
    }
}
