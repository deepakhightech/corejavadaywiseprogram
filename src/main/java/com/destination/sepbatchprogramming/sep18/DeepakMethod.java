package com.destination.sepbatchprogramming.sep18;

import java.util.Scanner;
class OurMethod{
	
	void anagram(String str1,String str2) {
		 int count=1;
		 char[] ch=str1.toCharArray();
		 for(char c:ch) {
			 if(!str2.contains(Character.toString(c))) {
				 count=0;break;
			 }	 		 
		 }
		 if(count!=0)
			 System.out.println("given string is Anagram");
		 else
			 System.out.println("given string is not Anagram");
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
		 if(count==1)
			 System.out.println("given string is Panagram");
		 else
			 System.out.println("given string is not Panagram");
	}
	
	void palindrome(String str1,String str2) {
		boolean count=true;
		if(str1.length()==str2.length()) {
			for(int i=0;i<str1.length();i++) {
				if(str1.charAt(i)!=str2.charAt(str2.length()-1-i)) {
					count=false;
					break;
				}		
			}
			if(count)
				System.out.println("given string is Palindrome");
			else
				System.out.println("given string is not Palindrome");
		}
		else
			System.out.println("given string is not Palindrome..");
			
	}
	
	String reverse(String str) {
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse+=str.charAt(i);
		}
		return reverse;
	}
	int wordcount(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ' )
				count++;
		}
		return count+1;
	}
	
	void reverse_word(String str) {
		String [] str_arr=str.split(" ");
		for(int i=0;i<str_arr.length;i++) {	
			System.out.print(reverse(str_arr[i])+" ");
		}
	}
	
	void get_string_first_word(String str) {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ' && (i==0 || str.charAt(i-1)==' '))
				System.out.print(str.charAt(i)+" ");
		}
	}
	
	void get_string_first_word1(String str) {
		String[] str_array=str.split(" ");
		for(int i=0;i<str_array.length;i++) {
			for(int j=0;j<str_array[i].length();j++) {
				System.out.print(str_array[i].charAt(0)+" ");
				break;
			}	
		}
	}
	
	void get_string_first_word2(String str) {
		String[] str_array=str.split(" ");
		for(int i=0;i<str_array.length;i++) {
			for(int j=0;j<str_array[i].length()-(str_array[i].length()-1);j++) {
				System.out.print(str_array[i].charAt(0)+" ");
				break;
			}	
		}
	}
}
public class DeepakMethod {
	public static void main(String[] args) {
/*		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string-: ");
		String str1=sc.nextLine();
		System.out.println("enter second string-: ");
		String str2=sc.nextLine();  */
		OurMethod obj=new OurMethod();
		//obj.anagram(str1, str2);
		obj.panagram("qwertyuiopasdfghjklzxcvbnmvhdfiuviru");
		//obj.palindrome("deepak", "kapeejd");
		//System.out.println(obj.reverse("deepak"));
		System.out.println(obj.wordcount("cvhjd kdvgd  kdfgu"));
		System.out.println();
		obj.reverse_word("deepak huii");
		//obj.reverse_word("my name is deepak kumar");
		//obj.get_string_first_word2("deepak kumar bind");
	}
}
