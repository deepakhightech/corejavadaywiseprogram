package com.destination.sepbatchprogramming.sep18;
public class stringpractice {
	public static void main(String[] args) {
		java.lang.String s1="deepak";
		java.lang.String s2="deeeak";
		System.out.println(s1);
		System.out.println(s1.contains("pak"));
		
		int f=0;
		if(s1.length()==s2.length()){
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)!=s2.charAt(i))
					f=0;
				else
					f=1;
			}
			if(f==1)
				System.out.println("equal not");
			else
				System.out.println(" equal");
		}
		else {
			System.out.println("not equal");
		}
	}
}
