
package com.destination.sepbatchprogramming.sep18;

import java.util.Scanner;

class DeletingDublicatearraydata{
	int arr[];
	int size;
	int newarray[];
	
	
	Scanner sc =new Scanner(System.in);
	
	void creatarray(int s) {
	arr=new int[s];	
	System.out.println("array is created successfully \n\n");
	}
	void takedata() {
		for(int i=0;i<arr.length;i++) {
				System.out.println("enter data ");
				arr[i]=sc.nextInt();
			}
	}	
	void dltdupelement() {
		accendingsort();
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j]=arr[i];
				j++;
			}
				
		}
		arr[j]=arr[arr.length-1];
		j++;
		System.out.print("\n after removing array element is ->>> ");
		for(int i=0;i<j;i++) {
			System.out.print(arr[i]+" ");
		}
	} 

	void accendingsort() {
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.print("after sorting the given array element is ->>");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
public class DeletingDublicate {
	public static void main(String[] args) {
		System.out.println("enter the size of array------:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		DeletingDublicatearraydata obj=new DeletingDublicatearraydata();
		obj.creatarray(size);
		obj.takedata();
		obj.dltdupelement();
		//obj.accendingsort();
	
	}
}

