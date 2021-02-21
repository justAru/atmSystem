package com.example.atmsystem.service;

import org.springframework.beans.factory.annotation.Autowired;

public interface iATMService {
    void checkBalance();
    void withdraw();
    void topUp();
}
