package com.destination.sepbatchprogramming.sep18;

import java.util.Scanner;

class gretestnum{
	int arr[];
	int size;
	
	Scanner sc =new Scanner(System.in);
	
	void creatarray(int s) {
	arr=new int[s];	
	System.out.println("array is created successfully \n\n");
	}
	void takedata() {
		for(int i=0;i<arr.length;i++) {
				System.out.println("enter data -:");
				arr[i]=sc.nextInt();
			}
	}
	void gratestnum() {
		int gratest = 0;
		for(int i=0;i<arr.length;i++) {
			gratest=arr[i];
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>gratest)
					gratest=arr[j];
				
			}
		}
		System.out.println("gretest number of the array is -:"+gratest);
	}
	
}
public class GreatestNumberArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array-------");
		int size=sc.nextInt();
		gretestnum obj=new gretestnum();
		obj.creatarray(size);
		obj.takedata();
		obj.gratestnum();
	}
}
