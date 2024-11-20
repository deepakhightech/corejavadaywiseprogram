package com.destination.sepbatchprogramming.sep18;

import java.util.Scanner;

class duplicatedata{
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
	void findduplicatedata() {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count!=1) {
				System.out.println(arr[i]+" is duplicate value of the position "+(i+1));
				count=0;
			}
			}
	}
}
public class DuplicateElementArray {
	public static void main(String[] args) {
		System.out.println("enter the size of array------:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		duplicatedata obj=new duplicatedata();
		obj.creatarray(size);
		obj.takedata();
		obj.findduplicatedata();
	}
}
