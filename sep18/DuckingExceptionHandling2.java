package com.destination.sepbatchprogramming.sep18;

import java.util.Scanner;

class operationnn1{
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
class operationnn2{
	void function2() {
		System.out.println("entered function-2");
		operationnn1 op1=new operationnn1();
		op1.function1();
		System.out.println("left function -2");
		
	}
}
class operationnn3{
	void function3() {
		try {
		System.out.println("entered function-3");
		operationnn2 op2=new operationnn2();
		op2.function2();
		//System.out.println("left function -3");
		}
		catch(Exception e) {
			System.out.println("excepton handled by fn -3");
			System.out.println("left function -3");
			throw e;
		}
		
	}
}

public class DuckingExceptionHandling2 {
	public static void main(String[] args) {
		operationnn3 op3=new operationnn3();
		op3.function3();
	}
}
