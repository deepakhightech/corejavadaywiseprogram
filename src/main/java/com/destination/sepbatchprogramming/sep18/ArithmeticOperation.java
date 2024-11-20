package com.destination.sepbatchprogramming.sep18;

class ArithmeticExample{
	int add(int a,int b) {
		return (a+b);
	}
	int sub(int a,int b) {
		return (a-b);
	}
	int mul(int a,int b) {
		return (a*b);
	}
	double div(double a,double b) {
		return (a/b);
	}
	int mod(int a,int b) {
		return (a%b);
	}
}
public class ArithmeticOperation {
	public static void main(String[] args) {
		int a=100,b=70;
		ArithmeticExample obj = new ArithmeticExample();
		System.out.println("addition of a & b is -: "+obj.add(a, b));
		System.out.println("substraction of a & b is -: "+obj.sub(a, b));
		System.out.println("mutiplication of a & b is -: "+obj.mul(a, b));
		System.out.println("divisin of a & b is -: "+obj.div(a, b));
		System.out.println("modulas of a & b is -: "+obj.mod(a, b));
		
		System.out.println("scsc "+(23/5.0));
	}
}
