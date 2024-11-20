package com.destination.sepbatchprogramming.sep18;

public class task12 {
	public static void main(String[] args) {
		String str="hiI i am jarvis".toLowerCase();
		String str1="";
		for(int i=0;i<str.length();i++) {
			 if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				 str1+=(char)(i+230);
			 }
			 else
				 str1+=str.charAt(i); 
		}
		System.out.println(str1);
	}
}
