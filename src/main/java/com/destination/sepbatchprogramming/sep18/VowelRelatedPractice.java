package com.destination.sepbatchprogramming.sep18;

import java.util.Scanner;

class VowelPractice{
	int nonalphabet;
	int vowel;
	int consonent;
	void totalvowel(String str) {
		str=str.toUpperCase();
		System.out.println(str);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' )
					vowel++;
				else
					consonent++;
			}
			else
				nonalphabet++;
		}
		System.out.println("total number of vowel -:"+vowel++);
		
		
	}
	void totalconsonent() {
		System.out.println("total number of consonent -:"+consonent++);
	}
	void total_non_alphabet() {
		System.out.println("total number of non-alphabet -:"+nonalphabet++);
	}
	
	void totaluppercasevowels(String str) {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' )
				vowel++;
			else
				consonent++;
				
		}
		System.out.println("upeer case vowel -: "+vowel);
		System.out.println("upeer case consonent -: "+consonent);
		
	}
	void totallowercasevowels(String str) {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' )
				vowel++;
			else
				consonent++;
				
		}
		System.out.println("upeer case vowel -: "+vowel);
		System.out.println("upeer case consonent -: "+consonent);
		
	}

	void replace_lower_case_vowel(String str) {
		String str2 = "";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ) 
				str2=str2+'@';
			else
				str2=str2+str.charAt(i);
		}		
		System.out.println(str2);
	}
	
	void replace_upper_case_vowel(String str) {
		String str2 = "";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' ) 
				str2=str2+'@';
			else
				str2=str2+str.charAt(i);
		}		
		System.out.println(str2);
	}
	void replace_all_case_vowel(String str) {
		String str2 = "";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ||
					str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' 	) 
				str2=str2+'@';
			else
				str2=str2+str.charAt(i);
		}		
		System.out.println(str2);
	}
	
	
}


public class VowelRelatedPractice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your string-: ");
		String str=sc.next();
		VowelPractice obj=new VowelPractice();
		obj.totalvowel(str);
		obj.totalconsonent();
		obj.total_non_alphabet();		
		obj.totaluppercasevowels(str);
		obj.replace_lower_case_vowel(str);
		obj.replace_upper_case_vowel(str);
		obj.replace_all_case_vowel(str);
		
	}

}
