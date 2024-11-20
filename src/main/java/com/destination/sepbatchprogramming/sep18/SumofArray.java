package com.destination.sepbatchprogramming.sep18;

import java.util.Scanner;

class sumarr{
	int arr[];
	int size;
	int sum=0;
	
	Scanner sc =new Scanner(System.in);
	
	void creatarray(int s) {
	arr=new int[s];	
	System.out.println("array is created successfully \n\n");
	}
	void addarray() {
		for(int i=0;i<arr.length;i++) {
				System.out.println("enter data -:");
				arr[i]=sc.nextInt();
				sum+=arr[i];
			}
		System.out.println("sum of array element is -:"+ sum);
	}
}
public class SumofArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array-------");
		int size=sc.nextInt();
		sumarr obj=new sumarr();
		obj.creatarray(size);
		obj.addarray();
	}
}
