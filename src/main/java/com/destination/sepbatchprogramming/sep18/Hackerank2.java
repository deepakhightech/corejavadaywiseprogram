package com.destination.sepbatchprogramming.sep18;

import java.util.Scanner;
class practice{
	void palindrome(String str) {
		String strtemp="";
		for(int i=0;i<str.length();i++) {
			//System.out.print(str.charAt(str.length()-i-1));
			strtemp=strtemp+str.charAt(str.length()-i-1);
		}
		if(str.equals(strtemp))
			System.out.println("alredy palindeom not paying any cost");
		else {
			for(int i=1;i<strtemp.length();i++) {
				str=str+strtemp.charAt(i);
			}
		System.out.println(str);
		System.out.println("cost given by cutomer is-:"+(strtemp.length()-1));
		}
	}
}
public class Hackerank2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your string-: ");
		String str=sc.next();
		practice obj=new practice();
		obj.palindrome(str);
	}
}
