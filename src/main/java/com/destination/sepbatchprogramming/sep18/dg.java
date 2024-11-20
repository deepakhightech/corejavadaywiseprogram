package com.destination.sepbatchprogramming.sep18;

public class dg {
	public static void main(String[] args) {
		int n=5;
//		for(int i=1;i<=n;i++) {
//			
//			System.out.println("-".repeat(n-i) +j+++" ".repeat(2*i-1));
//		}
//		for(int i=n;i>=1;i--) {
//			System.out.println("-".repeat(n-i) +"*".repeat(2*i-1));
//		}
//		
//		System.out.println("\n\n\n");
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("-");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=i;j--) {
				System.out.print("-");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		
		
		
		
		System.out.println("\n\n\n");
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || j==1 || i==n || j==n)
					System.out.print("1");
				else if(i==n/2+1 && j==n/2+1)
					System.out.print("3");
				else
					System.out.print("2");
			}
			System.out.println();
		}
		
	}
}

