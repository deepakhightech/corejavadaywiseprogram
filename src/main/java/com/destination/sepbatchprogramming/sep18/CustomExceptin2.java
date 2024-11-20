package com.destination.sepbatchprogramming.sep18;

import java.util.Scanner;

class UnderageException extends Exception{
	public String getmsg() {
		return "your age is less than 18";
	}
}
class OverageException extends Exception{
	public String getmsg() {
		return "your age is less greater than 60";
	}
}

class Userdriver{
	int age;
	void collectdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter he age -:");
		age=sc.nextInt();
		
	}
	void valid_data() throws UnderageException,OverageException{
		if(age<18) {
			UnderageException uag=new UnderageException();
			System.out.println(uag.getmsg());
			throw uag;
		}
		else if(age>=60) {
			OverageException oag=new OverageException();
			System.out.println(oag.getmsg());
			throw oag;
		}
		else {
			System.out.println("you are  eligible for licence");
		}
	}
}
class Rto{
	void licence(Userdriver c) {
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
						System.exit(0);
					}
			}
		}
	}
}
public class CustomExceptin2 {
	public static void main(String[] args) {
		Userdriver user=new Userdriver();
		Rto rto=new Rto();
		rto.licence(user);
	}

}
