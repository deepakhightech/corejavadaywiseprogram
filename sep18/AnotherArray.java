package com.destination.sepbatchprogramming.sep18;

import java.util.Scanner;

class abcd {
	int arr[][];
	int cls;
	int nofs;
	void creatarray(int n,int m) {
		cls=n;
		nofs=m;
		arr=new int[n][m];
		System.out.println("array created successfully........\n\n");
	}
	
	void adddata() {
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<cls;i++) {
			System.out.println("inside class -:"+(i+1));
			for(int j=0;j<nofs;j++) {
			System.out.println("enter the marks of student "+(j+1));
			arr[i][j]=sc.nextInt();
			}
		}
		
	}
	void display() {
		for(int i=0;i<cls;i++) {
			System.out.println("\n inside class -:"+(i+1));
			for(int j=0;j<nofs;j++) {
			System.out.println("marks of student "+(j+1)+" is = "+arr[i][j]);
			}
		}
	
}
}
public class AnotherArray {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enetr no of class---");
			int cls=sc.nextInt();
			System.out.println("enetr no of student---");
			int stu=sc.nextInt();
			
			abcd obj=new abcd();
			obj.creatarray(cls, stu);
			obj.adddata();
			obj.display();
		}
		
	}
}
