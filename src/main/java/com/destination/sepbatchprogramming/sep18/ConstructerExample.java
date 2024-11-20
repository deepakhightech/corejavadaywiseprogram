package com.destination.sepbatchprogramming.sep18;
class dog5{
	String name;
	String color;
	String breed;
	int cost;
	int age;
	
	public dog5() {
		super();
		System.out.println("default constructer");
	}
	public dog5(String name) {
		this("Aman","red");
		System.out.println("inside single paramaiterised constructor");
		this.name=name;
	}
	public dog5(String name,String color) {
		this("Aman","red","gr");
		System.out.println("inside double paramaiterised constructor");
		this.name=name;
		this.color=color;
	}
	public dog5(String name,String color,String breed) {
		this("Aman","red","gr",5000);
		System.out.println("inside double paramaiterised constructor");
		this.name=name;
		this.color=color;
		this.breed=breed;
	}
	public dog5(String name,String color,String breed,int cost) {
		this("Aman","red","gr",3000,5);
		System.out.println("inside 4 paramaiterised constructor");
		this.name=name;
		this.color=color;
		this.breed=breed;
		this.cost=cost;
	}
	public dog5(String name,String color,String breed,int cost,int age) {
		super();
		System.out.println("inside 4 paramaiterised constructor");
		this.name=name;
		this.color=color;
		this.breed=breed;
		this.cost=cost;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public String getBreed() {
		return breed;
	}
	public int getCost() {
		return cost;
	}
	public int getAge() {
		return age;
	}
	
}
public class ConstructerExample {
	public static void main(String[] args) {
		dog5 obj=new dog5("deepak");
		System.out.println(obj.getName());
		System.out.println(obj.getColor());
		System.out.println(obj.breed);
		System.out.println(obj.cost);
		System.out.println(obj.age);
	}
}
