package com.destination.sepbatchprogramming.sep18;

import java.util.Scanner;

class Sorting{
	int arr[];
	int size;
	
	
	
	Scanner sc =new Scanner(System.in);
	
	void creatarray(int s) {
	arr=new int[s];	
	System.out.println("array is created successfully \n\n");
	}
	void takedata() {
		for(int i=0;i<arr.length;i++) {
				System.out.println("enter data into the array -:");
				arr[i]=sc.nextInt();
			}
	}
	void accendingsort() {
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.print("accending element of the array is-:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}
	void decendingsort() {
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.print("\n decending element of the array is-:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}
}
public class SortingArray {
	public static void main(String[] args) {
		System.out.println("enter the size of array------:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		Sorting obj=new Sorting();
		obj.creatarray(size);
		obj.takedata();
		obj.accendingsort();
		obj.decendingsort();
	}
}
