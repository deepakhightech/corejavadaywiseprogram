package com.destination.sepbatchprogramming.sep18;

import java.util.Scanner;

class jfjdfd{
	void vowel_even_pos(String str) {
		str=str.toLowerCase();
		int count =0;
		 for(int i=0;i<str.length();i++) {
			 if(i%2==0) {
				 if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
					count++; 
			 } 
		 }
		 if(count==(str.length()+1)/2)
			 System.out.println("vowel are present in the even places");
		 else
			 System.out.println("vowel are not present in the even places");
	}
	void vowel_with_special_char(String str) {
		String str1="";
		for(int i=0;i<str.length();i++) {
			 if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				 str1+="#";
			 }
			 else
				 str1+=str.charAt(i); 
		}
		System.out.println(str1);
	}
	void vowel_slice_five(String str) {
		String temp="";
		for(int i=0;i<str.length();i++) {
			if(i%2!=0) {
				//System.out.print((char)(str.charAt(i)+5));
				temp+=(char)(str.charAt(i)+5);
			}
			else
				temp+=str.charAt(i); //  System.out.print(str.charAt(i));
		}
		System.out.println(temp);
	}
	void sum_and_product(String str){
		int sum=0;
		long product=1;
		for(int i=0;i<str.length();i++) {
			sum=sum+(int)str.charAt(i);
			product*=(int)str.charAt(i);
		}
		System.out.println("\n sum-: "+sum+" procuct-:"+product);
	}
}
public class task23 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string -: ");
		String str=sc.nextLine();
		jfjdfd obj=new jfjdfd();
		obj.vowel_even_pos(str);
		obj.vowel_with_special_char(str);
		obj.vowel_slice_five(str);
		obj.sum_and_product(str);

}
}
