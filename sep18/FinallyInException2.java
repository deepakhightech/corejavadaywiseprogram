package com.destination.sepbatchprogramming.sep18;

import java.util.Scanner;

public class FinallyInException2 {
	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numerator-:");
		int num=sc.nextInt();
		System.out.println("enter denominator-:");
		int den=sc.nextInt();
		int res=num/den;
		System.out.println(res);
	}
	finally {
		System.out.println("hi finally ");
	}
	}
}
