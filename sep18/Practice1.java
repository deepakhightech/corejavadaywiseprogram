package com.destination.sepbatchprogramming.sep18;

import java.util.Scanner;



class Jackarray{
	long arr[][][];
	long arr1[];
	long total_ravanue;
	long total_investment;
	long prev_profit;
	int lan;
	int cat;
	int mov;
	
	Scanner sc =new Scanner(System.in);
	
	void creatarray(int m,int n,int o) {
		lan=n; 
		cat=n;
		mov=o;
		arr=new long[m][n][o];
		arr1=new long[lan];
		
		
		System.out.println("array is created successfully \n\n");
	}
	void adddata() {
		long sum=0;
		System.out.println("enter total investment-: ");
		total_investment=sc.nextLong();
		System.out.println("enter total previus year profit -: ");
		prev_profit=sc.nextLong();
		System.out.println("collecting data ..........");
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside language no -:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
			System.out.println("inside categaries no-: "+(j+1));
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("enter the ravanue of the movies-: "+(k+1));
				arr[i][j][k]=sc.nextLong();
				sum=sum+arr[i][j][k];	
				total_ravanue=total_ravanue+arr[i][j][k];
			}
			
			}
			arr1[i]=sum;
			sum=0;
		}
		System.out.println("information  collecting successfully");
	}
	void display() {
		System.out.println("displaying data ..........");
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside language no -:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
			System.out.println("inside categaries no-: "+(j+1));
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("the ravanue of the movies-: "+(k+1)+" is-: "+arr[i][j][k]);
				
			}	
		}
	}
		for(int i=0;i<arr1.length;i++) {
			System.out.println("the revanue made by language "+(i+1)+" is ="+arr1[i]);
		}
	System.out.println("total revanue made by sanjana financial YEAR 2023-2024 is-:"+total_ravanue);
}
	 void checkprofite() {
		 long profit;
		if(total_ravanue>total_investment) {
			System.out.println("sanjana is profit side in investment.......... ");
			profit=total_ravanue-total_investment;
			if(profit>prev_profit) {
				System.out.println("sanjana make a profit previus year during 2023 is -: "+(profit-prev_profit));
			}
			else {
				System.out.println("sanjana make a lesser profit previus year during 2023 is -: "+(prev_profit-profit));
			}
		}
		else {
			System.out.println("\n sanjana loss side ----------");
			System.out.println("sanjana make a loss the financial year 2023-2024 -: "+ (total_investment-total_ravanue));
		}
	 }
	 void check() {
		 
	 }

}
public class Practice1 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter no of langauage for creating movie---");
			int lan=sc.nextInt();
			System.out.println("entre no of categaries of movies---");
			int cat=sc.nextInt();
			System.out.println("enetr no of movies---");
			int mov=sc.nextInt();
			Jackarray obj=new Jackarray();
			
			obj.creatarray(lan,cat,mov);
			obj.adddata();
			obj.display();
			obj.checkprofite();
		
		}
	
	}
}
