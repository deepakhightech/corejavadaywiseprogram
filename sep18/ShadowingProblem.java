package com.destination.sepbatchprogramming.sep18;
class dog1{
	String name;
	String color;
	int cost;
	int age;
	void setdatadynamic(String name, String color, int cost, int age) {
		this.name=name;
		this.color=color;
		this.cost=cost;
		this.age=age;
	}
	// if the instance and local variable are same and not using this keyword that time 
	// our compiler return default value of the instance variable
	void setdatadynamic2(String name, String color, int cost, int age) {
		name=name;
		color=color;
		cost=cost;
		age=age;
	}
	void getdata() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
public class ShadowingProblem {
	public static void main(String[] args) {
		dog1 d1=new dog1();
		d1.setdatadynamic("deepak","red",19292, 12);
		d1.getdata();
		System.out.println("if the instance and local variable are same and not using this keyword that time our compiler return default value of the instance variable");
		dog1 d2=new dog1();
		d2.setdatadynamic2("deepak","red",19292, 12);
		d2.getdata();
		System.out.println("------------------------");
		System.out.println("generating getters and setters with the system automatically....");
		dog1 d3=new dog1();
		d3.setName("sdcece");
		d3.setColor("red");
		d3.setCost(6767);
		d3.setAge(5);
		System.out.println(d3.getName());
		System.out.println(d3.getColor());
		System.out.println(d3.getCost());
		System.out.println(d3.getAge());
	}
}
