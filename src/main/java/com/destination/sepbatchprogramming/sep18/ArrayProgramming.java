package com.destination.sepbatchprogramming.sep18;

import java.util.*;

class Arrayoperation{
	int arr[];
	int size;
	void creatarray(int n) {
		size=n;
		arr=new int[size];
		System.out.println("array created successfully........\n\n");
	}
	
	void adddata() {
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<size;i++) {
			System.out.println("enter the marks of student "+(i+1));
			arr[i]=sc.nextInt();
		}
		
	}
	void display() {
		for(int i=0;i<size;i++) {
			System.out.println(" marks of student "+(i+1)+" is = "+arr[i]);
	}
	
}
}
public class ArrayProgramming {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of std--:");
		
		int n=sc.nextInt();
		
		Arrayoperation obj=new Arrayoperation();
		
		obj.creatarray(n);
		obj.adddata();
		obj.display();
	}

}
