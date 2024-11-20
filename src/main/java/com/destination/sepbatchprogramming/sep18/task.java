package com.destination.sepbatchprogramming.sep18;

public class task {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if((i+j)%2==0)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}
		
		System.out.println("\n\n");
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i%2==0)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}
		System.out.println("\n\n");
		int k=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
					System.out.print((char)(k++ +65));
			}
			System.out.println();
		}
		System.out.println("\n\n");
		
		int m=1,n=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if((m<10))
					System.out.print("0"+m++ +"	");
				else
					System.out.print(m++ +"	");
			}
			System.out.println();
		}
		System.out.println("\n\n\n\n");
		
		
	}
}















