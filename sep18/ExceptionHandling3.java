package com.destination.sepbatchprogramming.sep18;

import java.util.Scanner;

public class ExceptionHandling3 {
	public static void main(String[] args) {
	try {
		System.out.println("division operation started");
		Scanner sc =new Scanner(System.in);
		System.out.println("entr numerator"); 
		int num=sc.nextInt();            //critical statement --------->inputMismatchException
		System.out.println("entr denominator");  
		int den=sc.nextInt();              //critical statement--------->inputMismatchException
		System.out.println("result -;"+num/den);
		
		System.out.println("===========");
		System.out.println("entr the size of array"); 
		int s=sc.nextInt();       //critical statement ---------->inputMismatchException
		int arr[]=new int[s];
		System.out.println("entr the position of array");
		int pos=sc.nextInt();             //critical statement 
		System.out.println("entr the value for added data into array");
		int data=sc.nextInt();         //critical statement 
		arr[pos]=data;    //indexoutofbound
		System.out.println("array data is -:"+arr[pos]);
	}catch(Exception e) {
		System.out.println("exception handle");
	}
	}
}