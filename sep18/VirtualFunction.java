package com.destination.sepbatchprogramming.sep18;


// Abstract class object not created 

abstract class deepak{
	public abstract void A();
}

class b extends deepak{
	public void A() {
		System.out.println("hii child class.......");
	}
}
public class VirtualFunction {
	public static void main(String[] args) {
		b obj=new b();
		obj.A();
	}
}


