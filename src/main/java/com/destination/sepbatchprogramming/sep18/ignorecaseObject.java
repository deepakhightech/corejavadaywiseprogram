package com.destination.sepbatchprogramming.sep18;

public class ignorecaseObject {
	public static void main(String[] args) {
		java.lang.String s1= new String("deepak");
		java.lang.String s2=new String("Deepak");
		if(s1.length()==s2.length()){
			if(s1.equals(s2)==true) {
				System.out.println("string are equals..");
				System.out.println(s1.equalsIgnoreCase(s2));
			}
			else {
				System.out.println("string are not equals..");
				System.out.println(s1.equalsIgnoreCase(s2));
			}
			if(s1==s2)
				System.out.println("refrence are equals..");
			else
				System.out.println("refrence are not equals..");
		}
	}
}

