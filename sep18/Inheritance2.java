package com.destination.sepbatchprogramming.sep18;

class animal2{
	public void eat() {
		System.out.println("eating");
	}
	public void breath() {
		System.out.println("breathing.....");
	}
	public void sleep() {
		System.out.println("sleeping");
	}
}
class lion2 extends animal{
	public void eat() {
		System.out.println("lion eating chickens.....");
	}
	public void sound() {
		System.out.println("lion roaring.....");
	}
	
}
class elephant2 extends animal{
	public void eat() {
		System.out.println("elephant sugarcane....");
	}
	public void sound() {
		System.out.println("elephant uuuuuuuuuuuuuuuuuuuuu....");
	}
}
class dear2 extends animal{
	public void eat() {
		System.out.println("dear eating grass.....");
	}
	public void sound() {
		System.out.println("dear crying grdgurgyury.....");
	}
}

public class Inheritance2 {
	public static void main(String[] args) {
		elephant2 cp=new elephant2();
		lion2 fp=new lion2();
		dear2 pp=new dear2();
		animal ref=new animal();
		
		
		System.out.println("for elephant...............");
		ref=cp;
		ref.eat();
		ref.breath();
		ref.sleep();
		cp.sound();
		
		System.out.println("======================");
		System.out.println("for lion...............");
		ref=fp;
		ref.eat();
		ref.breath();
		ref.sleep();
		fp.sound();
		
		System.out.println("======================");
		System.out.println("for dear...............");
		ref=pp;
		ref.eat();
		ref.breath();
		ref.sleep();
		pp.sound();
		System.out.println("=========================");
	}
}
