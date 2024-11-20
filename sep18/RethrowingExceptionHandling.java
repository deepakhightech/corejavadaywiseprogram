package com.destination.sepbatchprogramming.sep18;

import java.util.Scanner;

class operations10{
	void function1() {
		System.out.println("entered function-1");
		Scanner sc=new Scanner(System.in);
		System.out.println("arithmetic started ....");
		System.out.println("enter numerator-:");
		int num=sc.nextInt();
		System.out.println("enter numerator-:");
		int den=sc.nextInt();
		int res=num/den;
		System.out.println(res);
		System.out.println("left function -1");
	}
}
class operations2{
	void function2() {
		try {
		System.out.println("entered function-2");
		operations10 op1=new operations10();
		op1.function1();
		System.out.println("left function -2");
		}
		catch(Exception e) {
			System.out.println("excepton handled by fn -2");
			System.out.println("left function -2");
			throw e;
		}
		
	}
}
class operations3{
	void function3() {
		try {
		System.out.println("entered function-3");
		operations2 op2=new operations2();
		op2.function2();
		System.out.println("left function -3");
		}
		catch(Exception e) {
			System.out.println("excepton handled by fn -3");
			System.out.println("left function -3");
			throw e;
		}
		
	}
}
public class RethrowingExceptionHandling {
	public static void main(String[] args) {
		try {
		System.out.println("entered main class....");
		operations3 op3=new operations3();
		op3.function3();
		}
		catch(Exception e) {
			System.out.println("excepton handled by main");
		}
		System.out.println("left main");
	}
}
