package com.bl;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		UserRegistration registration = new UserRegistration();
		System.out.println("Enter First name");
		String fname = scan.next();
		registration.validFirstName(fname);
		System.out.println("Enter last name");
		String lname = scan.next();
		registration.validLastName(lname);
		System.out.println("Enter emailid");
		String email = scan.next();
		registration.validEmailId(email);

	}

	private void validFirstName(String firstName) {
		String regex = "[A-Z][A-Za-z]{2,9}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		if (matcher.matches()) {
			System.out.println("User first name is valid :) ");
		} else {
			System.out.println("User first name is Invalid :( ");
		}
	}

	private void validLastName(String LastName) {
		String regex = "[A-Za-z]{2,15}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(LastName);
		if (matcher.matches()) {
			System.out.println("User Last name is valid");
		} else {
			System.out.println("User Last name is Invalid");
		}
	}
	private void validEmailId (String Email) {
		String regex ="[a-zA-Z0-9_\\-.]+[@][a-z]+[\\.][a-z]{2,3}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(Email);
		if (matcher.matches()) {
			System.out.println("User Email is valid");
		} else {
			System.out.println("User Email is Invalid");
		}
		
	}

}
	
	
	
	

