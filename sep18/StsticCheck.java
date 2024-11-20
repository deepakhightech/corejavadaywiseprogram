package com.destination.sepbatchprogramming.sep18;


class check1{
	static int a,b,c;
	int x,y,z;
	static {
		a=10;
		b=200;
		c=56;
	}
	{
		x=12;
		y=89;
		z=78;
		a=10;
		b=200;
		c=56;
	}
	static void show1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	void show2() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
public class StsticCheck {
	public static void main(String[] args) {
		System.out.println(check1.a);
		System.out.println(check1.b);
		System.out.println(check1.c);
		System.out.println("===================");
		check1.show1();
		System.out.println("================");
		check1 obj=new check1();
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.z);
		
		System.out.println("===========");
		obj.show2();	
	}
}
