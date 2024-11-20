package com.destination.sepbatchprogramming.sep18;
class animal{
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
class lion extends animal{
	public void eat() {
		System.out.println("lion eating chickens.....");
	}
	public void sound() {
		System.out.println("lion roaring.....");
	}
	
}
class elephant extends animal{
	public void eat() {
		System.out.println("elephant sugarcane....");
	}
	public void sound() {
		System.out.println("elephant uuuuuuuuuuuuuuuuuuuuu....");
	}
}
class dear extends animal{
	public void eat() {
		System.out.println("dear eating grass.....");
	}
	public void sound() {
		System.out.println("dear crying grdgurgyury.....");
	}
}
class forest{
	void collect(animal ref) {
		ref.eat();
		ref.breath();
		ref.sleep();
	}
}
public class Inheritance1 {
	public static void main(String[] args) {
		elephant cp=new elephant();
		lion fp=new lion();
		dear pp=new dear();
	//	animal ref=new animal();
		
		forest frst=new forest();
		
		System.out.println("for elephant...............");
		frst.collect(cp);
		cp.sound();
		
		System.out.println("======================");
		System.out.println("for lion...............");
		frst.collect(fp);
		fp.sound();
		
		System.out.println("======================");
		System.out.println("for dear...............");
		frst.collect(pp);
		pp.sound();
		System.out.println("=========================");
	}
}
