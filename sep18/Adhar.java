package com.destination.sepbatchprogramming.sep18;

import java.util.Scanner;

class adhardetails{
	String name;
	static String country;
	long ad_num;
	long phone;
	String email;
	
	static{
		country="indian";
	}
	void takedata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the user name-:");
		name=sc.nextLine();
		System.out.println("enter the user adhar number-:");
		ad_num=sc.nextLong();
		System.out.println("enter the user phone number-:");
		phone=sc.nextLong();
		System.out.println("enter the user email id-:");
		email=sc.nextLine();
	}
	void diplay() {
		System.out.println("name -: "+name);
		System.out.println("Adhar number -: "+ad_num);
		System.out.println("phone number-: "+phone);
		System.out.println("email id -: "+email);
		System.out.println("nationality -: "+country);
	}
}
public class Adhar {
	public static void main(String[] args) {
		adhardetails obj=new adhardetails();
		obj.takedata();
		obj.diplay();
		
	}
}
