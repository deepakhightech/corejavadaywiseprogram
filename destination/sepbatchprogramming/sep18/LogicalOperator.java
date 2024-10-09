package com.destination.sepbatchprogramming.sep18;

public class LogicalOperator {
	public static void main(String[] args) {
		int a=50,b=89,c=90;
		System.out.println("logical and operation -: "+ (a>b&&b>c));
		System.out.println("logical and operation -: "+ (a<b&&c>b));
		System.out.println("logical or operation -: "+ (a>b||b>c));
		System.out.println("logical or operation -: "+ (a>b||b<c));
	}
}
