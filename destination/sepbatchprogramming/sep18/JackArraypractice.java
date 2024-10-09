

package com.destination.sepbatchprogramming.sep18;

import java.util.Scanner;

class abcdef{
	int arr[][];
	int cls;
	Scanner sc =new Scanner(System.in);
	
	void creatarray(int n) {
		cls=n;
		arr=new int[n][];
		System.out.println("enter student of each class...\n\n");
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter student of number inside the class...\n\n"+(i+1));
			int stu=sc.nextInt();
			arr[i]=new int[stu];
		}
		System.out.println("array is created successfully \n\n");
		
		
	}
	
	void adddata() {
		System.out.println("collecting data ..........");
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside class -:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
			System.out.println("enter the marks of student "+(j+1));
			arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("marks collecting successfully");
	}
	void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside class -:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
			System.out.println("marks of student no "+(j+1)+" is"+arr[i][j]);
			}
		}
	
}
}
	

public class JackArraypractice {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enetr no of class---");
			int cls=sc.nextInt();
			abcdef obj=new abcdef();
			obj.creatarray(cls);
			obj.adddata();
			obj.display();
		}
	}

}
