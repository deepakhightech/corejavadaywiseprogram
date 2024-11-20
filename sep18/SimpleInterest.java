package com.destination.sepbatchprogramming.sep18;

import java.util.Scanner;

class former{
	double p;
	double t;
	static double r;
	double si;
	static int count=1;
	static {
		r=12.24;
	}
	void takedata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter principal amount-:");
		p=sc.nextDouble();
		System.out.println("enter the time duration-:");
		t=sc.nextDouble();
	}
	void cal() {
		si=(p*r*t)/100;
	}
	void result() {
		System.out.println("simple interest of "+(count++)+" former is "+si);
	}
}
public class SimpleInterest {
	public static void main(String[] args) {
		former f1=new former();
		f1.takedata();
		f1.cal();
		f1.result();
		System.out.println("================");
		former f2=new former();
		f2.takedata();
		f2.cal();
		f2.result();
		System.out.println("================");
		former f3=new former();
		f3.takedata();
		f3.cal();
		f3.result();
		System.out.println("================");
	}
}
