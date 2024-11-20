package com.destination.sepbatchprogramming.sep18;

import java.util.Scanner;

class identymat{
	int arr[][];
	int size;
	
	Scanner sc =new Scanner(System.in);
	
	void creatarray(int row,int column) {
	arr=new int[row][column];	
	System.out.println("array is created successfully \n\n");
	if(row!=column) 
		System.out.println("your matrix is not SQUARE MATRIX..");
	else {
		takedata();
		display();
		check();
	}
	}
	void takedata() {
		System.out.println("enter data into matrix");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println("enter array data-: ");
				arr[i][j]=sc.nextInt();
			}
		}
	}
	
	void display() {
		System.out.println("data of is matrix");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+ "  ");
			}
			System.out.println();
		}
	}
	
	void check() {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==j && arr[i][j]==1) {
					count++;
				}
				
			}
		}
		if(count==arr.length)
			System.out.println("given matrix is identity matrix");
		else
			System.out.println("not identity matrix");
	}
	
}
public class IdentyMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of-:");
		int row=sc.nextInt();
		int column=sc.nextInt();
		identymat obj=new identymat();
		obj.creatarray(row, column);
		
	}

}
