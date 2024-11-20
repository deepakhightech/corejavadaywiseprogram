package com.destination.sepbatchprogramming.sep18;
class Tiger{
	String name;
	String color;
	String country;
	int age;
	void setstaticname() {
		name="rahul";
	}
	void setstaticcolor() {
		color="red";
	}
	void setstaticcountry() {
		country="india";
	}
	void setstaticage() {
		age=19;
	}
	String getname() {
		return name;
	}
	String getcolor() {
		return color;
	}
	String getcountry() {
		return country;
	}
	int getage() {
		return age;
	}
	void setdynamicname(String name) {
		this.name=name;
	}
	void setdynamiccolor(String c) {
		color=c;
	}
	void setdynamiccountry(String cn) {
		country=cn;
	}
	void setdynamicage(int a) {
		age=a;
	}
}
public class SpecificGetters {
	public static void main(String[] args) {
		Tiger t1=new Tiger();
		System.out.println(t1.getname());
		System.out.println(t1.getcolor());
		System.out.println(t1.getcountry());
		System.out.println(t1.getage());
		t1.setstaticname();
		t1.setstaticcolor();
		t1.setstaticcountry();
		t1.setstaticage();
		System.out.println(t1.getname());
		System.out.println(t1.getcolor());
		System.out.println(t1.getcountry());
		System.out.println(t1.getage());
		
		System.out.println("===========");
		Tiger t2=new Tiger();
		System.out.println(t2.getname());
		System.out.println(t2.getcolor());
		System.out.println(t2.getcountry());
		System.out.println(t2.getage());
		
		t2.setdynamicname("deepak");
		t2.setdynamiccolor("yellow");
		t2.setdynamiccountry("africa");
		t2.setdynamicage(12);
		
		System.out.println("===========");
		
		System.out.println(t2.getname());
		System.out.println(t2.getcolor());
		System.out.println(t2.getcountry());
		System.out.println(t2.getage());
	}
}
