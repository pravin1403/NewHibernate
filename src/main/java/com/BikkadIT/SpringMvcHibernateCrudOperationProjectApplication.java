package com.BikkadIT;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.BikkadIT.Model.User;
import com.BikkadIT.Controller.CrudController;

@SpringBootApplication
public class SpringMvcHibernateCrudOperationProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringMvcHibernateCrudOperationProjectApplication.class, args);
		
		CrudController crudController = context.getBean(CrudController.class);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("----------WELCOME TO BANK---------");
		boolean condition=true;
		
  while (condition) {
		System.out.println("Press 1 for create account");
		System.out.println("Press 2 for view account");
		System.out.println("Press 3 for withdraw Money");
		System.out.println("Press 4 for deposit account");
		System.out.println("Press 5 for update  account");
		System.out.println("Press 6 for EXIT");

	
		int ch = sc.nextInt();

		switch (ch) {

		case 1:
			
			crudController.saveUser();
			
			break;
//		case 2: 
//			bankServiceI.viewAccount();
//			break;
//		case 3: 
//			bankServiceI.withDraw();
//			break;
//		case 4: 
//			bankServiceI.deposite();
//			break;
//		case 5: 
//			bankServiceI.updateAccount();
//			break;
//		case 6: 
//            condition=false;
//            System.out.println("thank you for using bank service");
//			break;
		default:
			System.out.println("INVALID CHOICE");
			break;

		}
	}
		
		
		
	}

}
