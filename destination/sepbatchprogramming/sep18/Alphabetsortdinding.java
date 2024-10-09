package com.destination.sepbatchprogramming.sep18;

public class Alphabetsortdinding {
	static void deepak(String b[],int n) {
		System.out.println(b[0]);
		for(int i=0;i<n;i++) { 
			for(int j=0;j<n;j++) {
				if(b[0])
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
		
		
			
	}

	public static void main(String[] args) {
		String a[]=new String[100];
		int n=11;
		a[0]="(i==0)";
		deepak(a,n);
	}
}
// (i==0 && j!=0 && j!=n-1)