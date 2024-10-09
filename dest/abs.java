package com.dest;

import java.util.Scanner;

class Jackarray{
	String arr[][][];
	int clg;
	int cls;
	int stu;
	Scanner sc =new Scanner(System.in);
	
	void creatarray(int m,int n,int o) {
		clg=n; 
		cls=n;
		stu=o;
		arr=new String[m][n][o];
		
		System.out.println("array is created successfully \n\n");
	}
	void adddata() {
		System.out.println("collecting data ..........");
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside college no -:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
			System.out.println("inside class no-: "+(j+1));
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("enter the name of the student-: "+(k+1));
				arr[i][j][k]=sc.next();
			}
			
			}
		}
		System.out.println("marks collecting successfully");
	}
	void display() {
		System.out.println("displaying data ..........");
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside college no -:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
			System.out.println("inside class no-: "+(j+1));
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("the name of the student-: "+(k+1)+"is-: "+arr[i][j][k]);

			}
			
			}
		}
	
}
}
	

public class abs {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enetr no of clg---");
			int clg=sc.nextInt();
			System.out.println("enetr no of cls---");
			int cls=sc.nextInt();
			System.out.println("enetr no of student---");
			int stu=sc.nextInt();
			Jackarray obj=new Jackarray();
			obj.creatarray(clg,cls,stu);
			obj.adddata();
			obj.display();
		}
	}

}
