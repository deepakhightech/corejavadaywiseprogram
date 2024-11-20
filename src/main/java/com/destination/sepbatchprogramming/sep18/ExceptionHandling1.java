package com.destination.sepbatchprogramming.sep18;

import java.util.Scanner;

public class ExceptionHandling1 {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter numerator-:");
			int n=sc.nextInt();
			System.out.println("enter numerator-:");
			int d=sc.nextInt();
			System.out.println(n/d); // critical statement
			
		}
		catch(Exception e) {
			System.out.println("num is not divided by 0");
		}
	}
}
