package com.gl.emailapp.main;

import java.util.Scanner;

import com.gl.emailapp.model.Employee;
import com.gl.emailapp.service.CredentialService;
import com.gl.emailapp.service.CredentialServiceImpl;

public class EmailApp {

	public EmailApp() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) 
	{
		CredentialService service = new CredentialServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Name");
		String firstName = sc.next();
		System.out.println("Enter the Last Name");
		String lastName = sc.next();
		
		Employee employee = new Employee(firstName , lastName);
		String department = null;
		
		//service.passwordGenerator();
		
		 System.out.println("Please enter the department from following : ");
		 System.out.println("1. Technical /n 2. Admin /n 3. Human Resource /n 4. Legal");
		 System.out.println("---------------------------------------------------");
		 System.out.println("Enter your choice");
		 
		 int choice = sc.nextInt();
		 if(choice == 1) {
			 department = "technical";
		 }else if(choice == 2) {
			 department = "admin";
		 }else if(choice == 3) {
			 department = "humanresource";
		 }else {
			 department = "legal";
		 }
		
		 //service.generateEmailAddress(employee,department);
		 service.displayCredentials(employee, department);
		
	}

}
