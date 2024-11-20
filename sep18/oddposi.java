package com.destination.sepbatchprogramming.sep18;

public class oddposi {
	public static void main(String[] args) {
		String str="dd";
		int sum=0;
		int product=1;
		for(int i=0;i<str.length();i++) {
			sum=sum+(int)str.charAt(i);
			product*=(int)str.charAt(i);
		}
		System.out.println("sum-: "+sum+" procuct-:"+product);
	}
}
