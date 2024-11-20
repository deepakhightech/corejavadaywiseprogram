package com.destination.sepbatchprogramming.sep18;

import java.util.Scanner;

class InvalidUserNameException extends Exception{
	public String getmsg() {
		return "invalid user name. plese try again";
	}
}
class InvalidUserPassException extends Exception {
	public String getmsg() {
		return "invalid password name. plese try again";
	}
}
class Customer{
	String user_name;
	String user_name_original="deepak";
	String user_pass;
	String user_name_pass="deepak@123";
	void collectdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter he user name-:");
		user_name=sc.next();
		System.out.println("enter he user password-:");
		user_pass=sc.next();
	}
	void valid_data() throws InvalidUserNameException,InvalidUserPassException{
		if(user_name.equals(user_name_original)==true) {
			if(user_pass.equals(user_name_pass)==true) {
				System.out.println("hellow user. welcome to your page");
			}
			else {
				InvalidUserPassException ipe=new InvalidUserPassException();
				System.out.println(ipe.getmsg());
				throw ipe;
			}
		}
		else {
			InvalidUserNameException iue=new InvalidUserNameException();
			System.out.println(iue.getmsg());
			throw iue;
		}
	}
}
class ATM{
	void verify(Customer c) {
		try {
			c.collectdata();
			c.valid_data();
		}
		catch(Exception e) {
			try {
				c.collectdata();
				c.valid_data();
			}
			catch(Exception e1) {
				try {
					c.collectdata();
					c.valid_data();
				}
					catch(Exception e3) {
						System.out.println("user blocked");
					}
			}
		}
	}
}

public class CustomExceptin {
	public static void main(String[] args) {
		Customer cus=new Customer();
		ATM atm=new ATM();
		atm.verify(cus);
	}
}
