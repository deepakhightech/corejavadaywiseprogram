package com.destination.sepbatchprogramming.sep18;
class dog{
	String name;
	String color;
	int cost;
	int age;
	void setdataStatic() {
		name="tommy";
		color="red";
		cost=28383;
		age=12;
	}
	void getdata() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
	}
	void setdatadynamic(String s1, String s2, int i, int j) {
		name=s1;
		color=s2;
		cost=i;
		age=j;
	}

}
public class Gettersabdsetters {
	public static void main(String[] args) {
		dog d1=new dog();
		d1.getdata();
		d1.setdataStatic();
		System.out.println("===============================");
		d1.getdata();
		System.out.println("===============================");
		dog d2=new dog();
		d2.setdatadynamic("wefe","pink",53542,3);
		d2.getdata();
	}
	
}
