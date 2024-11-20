package com.destination.sepbatchprogramming.sep18;

public class dfdsfd {
	static void delete(int a[],int n) {
		int j=0;
		for(int i=0;i<n-1;i++)
			if(a[i]!=a[i+1])
				a[j++]=a[i];
			a[j++]=a[n-1];
		for(int i=0;i<j;i++) {
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		int a[]= {10,10,10,20,50,60,89};
		int n=a.length;
		delete(a,n);
//		for(int i=0;i<n;i++) {
//			System.out.print(a[i]+" ");
//		}
	}
}
