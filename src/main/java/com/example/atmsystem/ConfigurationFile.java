package com.example.atmsystem;

import com.example.atmsystem.model.Account;
import com.example.atmsystem.model.Bank;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("com.example.atmsystem")
@PropertySource("application.properties")
public class ConfigurationFile {

    @Bean
    public List<Account> accounts() {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("123456789", 3000, "1234"));
        accounts.add(new Account("121212122", 5000, "1234"));
        accounts.add(new Account("131313113", 10000, "1234"));
        return accounts;
    }

//    @Bean
//    public Account account1(){
////        @Value("${account.cardNumber}")
////        String cardNumber;
//        return new Account("1234568", 5000, "1234", new Bank());
//    }

//    @Bean
//    public Bank bank1(){
//        return new Bank("HalyqBank", accounts());
//    }
}
