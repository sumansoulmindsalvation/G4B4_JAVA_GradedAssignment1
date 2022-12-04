package com.gl.emailapp.service;

import java.util.Random;

import com.gl.emailapp.model.Employee;

public class CredentialServiceImpl implements CredentialService {

	public CredentialServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String passwordGenerator() {
		  String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!#$%&*()_+<>";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[6];
	      
	      for(int i = 0; i< 6 ; i++) {
	    	  int randomNumber = random.nextInt(combinedChars.length());
	          password[i] = combinedChars.charAt(randomNumber);
	       }
	      
		return new String(password);
	}

	@Override
	public String generateEmailAddress(Employee emp, String department) {
			
		String email = emp.getFirstName().toLowerCase()+emp.getLastName().toLowerCase()+"@"+department+".abc.com";

		return email;
	}

	@Override
	public void displayCredentials(Employee emp , String dept) {
		// TODO Auto-generated method stub
		System.out.println("Email --->" + generateEmailAddress(emp , dept));
		System.out.println("Password --->" + passwordGenerator());
		
	}

}
