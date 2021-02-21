package com.example.atmsystem;

import com.example.atmsystem.model.Account;
import com.example.atmsystem.model.Bank;
import com.example.atmsystem.service.iATMService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class AtmsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtmsystemApplication.class, args);
//
//		while (true) {
//
//			System.out.println("\nWelcome!\n");
//
//			System.out.println("<------------------------------->");
//			System.out.println("<          1.Check Balance      >");
//			System.out.println("<          2.Top up             >");
//			System.out.println("<          3.Withdraw           >");
//			System.out.println("<          0.Exit               >");
//			System.out.println("<------------------------------->");
//
//			int choose = scanner.nextInt();
//			switch(choose){
//				case 1:
//					atm.checkBalance();
//					break;
//				case 2:
//					atm.topUp();
//					break;
//				case 3:
//					atm.withdraw();
//					break;
//				case 0:
//					System.exit(200);
//				default:
//					System.out.println("Try Again!");
//			}
//		}


		}

}
