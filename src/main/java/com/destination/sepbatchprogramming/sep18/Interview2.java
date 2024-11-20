package com.destination.sepbatchprogramming.sep18;

public class Interview2 {
	public static void main(String[] args) {
		String str="a4637";
		System.out.println(str.matches("\\d+"));
		// startin with a to z and after bc must then True
		System.out.println(str.matches("[a-z]bc\\d+"));
		// startin with a to z then True
		System.out.println(str.matches("[a-z]+\\d+"));
		
		System.out.println("gergrh-----------------------------");
		 String str1 = "abc123xyz";
		 System.out.println(str1.matches(".*"));
		 
		 System.out.println("-----------------------------");
		 String str2 = "a2b";
		System.out.println(str2.matches("a.b"));
		
		String str3="sdfu23265vx23";
		System.out.println(str3.matches("[a-zA-Z0-9]*")); //all alphanumeric charcter
	}

}
