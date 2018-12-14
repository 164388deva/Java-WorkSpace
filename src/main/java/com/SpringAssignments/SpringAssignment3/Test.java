package com.SpringAssignments.SpringAssignment3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringAssignments.SpringAssignment3.controller.BankAccountController;

public class Test {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
BankAccountController controller=(BankAccountController)context.getBean("controller");
System.out.println(controller.getBalance(101));

controller.withdraw(101, 50000);
System.out.println(controller.getBalance(101));
System.out.println(controller.fundTransfer(102, 101, 50000));
System.out.println(controller.getBalance(101));
	}

}
