package com.destination.sepbatchprogramming.sep18;

public class mutableStringbuilder2 {
	public static void main(String[] args) {
		long t1=System.currentTimeMillis();	StringBuilder sb1=new StringBuilder("sita");
	
		StringBuilder sb2=new StringBuilder("rama");
		sb1.append(sb2);
		System.out.println(sb1);
		System.out.println(System.currentTimeMillis());
		long t2=System.currentTimeMillis();
	}
}
