package com.example.atmsystem.controller;

import com.example.atmsystem.model.Account;
import com.example.atmsystem.service.impl.ATMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AtmController {

    @Autowired
    ATMService service;
//    ATMService service;

    @GetMapping("/account/all")
    public List<Account> accountList(){
        return service.getAll();
    }
}
