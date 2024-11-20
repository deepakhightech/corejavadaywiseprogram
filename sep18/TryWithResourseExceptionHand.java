package com.destination.sepbatchprogramming.sep18;

import java.util.Scanner;

class operationnn{
	void function() {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("arithmetic started ....");
			System.out.println("enter numerator-:");
			int num=sc.nextInt();
			System.out.println("enter numerator-:");
			int den=sc.nextInt();
			int res=num/den;
			System.out.println(res);
		}
		catch(Exception e) {
			e.printStackTrace(); // display the exception flow like a den
		}
	}
}
public class TryWithResourseExceptionHand {
	public static void main(String[] args) {
		operationnn obj=new operationnn();
		obj.function();
	}
}
