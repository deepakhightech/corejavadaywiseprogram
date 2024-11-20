package com.destination.sepbatchprogramming.sep18;

import java.util.Arrays;
import java.util.Scanner;

// reverse string 
class ReverseString{
	void string_reverse_1(String str) {
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}
	// another way
	void string_reverse_2(String str) {
		System.out.println();
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(str.length()-i-1));
		}
	}
// using stringbulder
	 void string_reverse_3(String str) {
		 System.out.println();
		 StringBuilder strbul=new StringBuilder(str);
		 strbul.reverse();
		 //System.out.println("          "+strbul.replace(1, 2, "dfg"));
		 System.out.println(strbul);
	 }
	 
	 void palindrom(String str) {
		 String str2="asdf";
		 boolean count =true;
		 if(str.length()==str2.length()) {
			 for(int i=0;i<str.length();i++) {
				 if(str.charAt(i)!=str2.charAt(str2.length()-i-1))
					 count=false;
			 }
			 if(count)
				 System.out.println("palindrom");
			 else
				 System.out.println("not ");	 
		 }
		 else
			 System.out.println("not");
	 }
	 
	 void anagram3(String str1) {
		 String str2="deepak";
		 //converting string to character array
		 char[] charstr1=str1.toCharArray();
		 char[] charstr2=str2.toCharArray();
		 Arrays.sort(charstr1);
		 Arrays.sort(charstr2);
		 System.out.println(charstr1);
		 System.out.println(charstr2);
		 if(Arrays.equals(charstr1,charstr2))
			 System.out.println("anagram");
		 else
			 System.out.println("not");
	 }
	 
	 void anagram2(String str1) {
		 String str2="deepak";
		 //converting string to character array
		 char[] charstr1=str1.toCharArray();
		 char[] charstr2=str2.toCharArray();
		 Arrays.sort(charstr1);
		 Arrays.sort(charstr2);
	
		 str1=new String(charstr1); // converting char array to String
		 str2=new String(charstr2);
		 System.out.println(str2);
		 if(str1.equals(str2))
			 System.out.println("anagram");
		 else
			 System.out.println("not");
	 }
	 void anagram(String str) {
		 int count=1;
		 String str1="deepak";
		 char[] ch=str.toCharArray();
		 for(char c:ch) {
			 if(!str1.contains(Character.toString(c))) {
				 count=0;break;
			 }	 		 
		 }
		 if(count!=0)
			 System.out.println("anagram");
		 else
			 System.out.println("not anagram");
			
	 }
	 // remove character to the string using replace
	 void remove_character(String str) {
		 System.out.println("replace -:"+str.replace("d", ""));
	 }
	 void replace_char_or_string(String str) {
		 System.out.println("replace string"+str.replace("d","dfvfd"));
	 }
	 void remove_duplicate(String str) {
		 int count=0;
		 String temp="";
		 for(int i=0;i<str.length();i++) {
			 for(int j=i+1;j<str.length();j++) {
				 if(str.charAt(i)==str.charAt(j)) {
					 count++;
					 if(count==1)
						temp=temp+str.charAt(i)+'@';
				 }count=0;
			 }
			 
		 }
		 System.out.println(temp);
	 }
	 void panagram(String str) {
		 int count=1;
		 String strmain="qwertyuiopasdfghjklzxcvbnm";
		 char [] ch=strmain.toCharArray();
		 for(char c:ch) {
			 if(!str.contains(Character.toString(c))) {
				 count =0; break;
			 }	 		 
		 }
		 if(count!=0)
			 System.out.println("panagram");
		 else
			 System.out.println("not panagram");	 
	 }
}
public class Interview1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your string-: ");
		String str=sc.nextLine();
		
		ReverseString obj=new ReverseString();
		//obj.string_reverse_1(str);
		//obj.string_reverse_2(str);
		//obj.string_reverse_3(str);
		//obj.palindrom(str);
		//obj.anagram(str);
		//obj.anagram2(str);
		//obj.remove_character(str);
		//obj.replace_char_or_string(str);
		//obj.remove_duplicate(str);
		//obj.anagram3(str);
		//obj.panagram(str);
		obj.anagram2(str);
	}
}


