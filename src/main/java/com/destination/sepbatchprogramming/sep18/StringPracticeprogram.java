package com.destination.sepbatchprogramming.sep18;

import java.util.Scanner;

class test{
	void seperatestring(String str) {
		String alpha="";
		String number="";
		String special="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90 || str.charAt(i)>=97 && str.charAt(i)<=122  )
				alpha=alpha+str.charAt(i);
			else if(str.charAt(i)>=48 && str.charAt(i)<=57)
				 number= number+str.charAt(i);
			else
				special=special+str.charAt(i);	
		}
		System.out.println("alphaet-: "+alpha);
		System.out.println("number-: "+number);
		System.out.println("special-: "+special);
	}
	void task2(String str) {
		int count=0;
		str.trim();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
				count++;
		}
			
		System.out.println("total word-:"+(count+1));
	}
	void validpass(String str) {
		int upperfound=0;
		int lowerfound=0;
		int digitfound=0;
		int specialcharfound=0;
		if(str.length()>=10) {
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)>=65 && str.charAt(i)<=90)
					upperfound=1;
				else if(str.charAt(i)>=97 && str.charAt(i)<=122)
					lowerfound=1;
				else if(str.charAt(i)>=48 && str.charAt(i)<=57)
					digitfound=1;
				else
					specialcharfound=1;		
			}
		}
		if(upperfound==1 &&lowerfound==1 && digitfound==1&& specialcharfound==1)
			System.out.println("valid pass");
		else
			System.out.println("invalid");
	}
	void reversestring(String str) {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ')
				for(int j=i;j>=0;j--)
					System.out.print(str.charAt(j));
		}
	}
	void ourtrim(String str) {
		String str1=" ";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ' || str.charAt(str.length()-1-i)==' ') {
				str.replace(str1,"");
			}
			System.out.println(str.charAt(i));
				
			
		}
		//System.out.println(str);
	}
}
public class StringPracticeprogram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your string-: ");
		String str=sc.nextLine();
		test obj=new test();
		//obj.seperatestring(str);
		//obj.task2(str);
		obj.validpass(str);
		//obj.reversestring(str);
	}
}
