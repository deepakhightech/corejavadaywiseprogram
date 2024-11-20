package com.destination.sepbatchprogramming.sep18;

import java.util.Scanner;

public class Panagram2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		str=str.toUpperCase();
		int arr[]=new int [26];
		for(int i=0;i<arr.length;i++) {
			arr[i]=0;
		}
		for(int i=0;i<arr.length;i++) {
			int temp=str.charAt(i)-65;
			arr[temp]=1;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=1) {
				System.out.println(" not panagram");
				
				System.exit(0);
			}
		}
		System.out.println(" pana");
	}
}
