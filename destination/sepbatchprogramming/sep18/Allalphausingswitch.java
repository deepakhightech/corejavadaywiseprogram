package com.destination.sepbatchprogramming.sep18;

import java.util.Scanner;

public class Allalphausingswitch {
	static boolean condition(int i, int j, char ch, int n) {
		switch (ch) {
		case 'a':
			return ((i==0 && j!=0 && j!=n-1) || (j == 0 && i != 0) || (j == n - 1 && i != 0) || i == n / 2);
		case 'b':
			return (i==0 || i==n-1 || j==0 || j==n-1 || i==n/2);
		case 'c':
			return ((i==0 && j!=0)|| (j==0 && i!=0 && i!=n-1)||(i==n-1 && j!=0));
		case 'd':
			return (j==0 || (i==0 && j!=n-1) || (j==n-1 && i!=0 && i!=n-1) || (i==n-1 && j!=n-1));
		case 'e':
			return (i==0 || i==n-1 || j==0 || i==n/2);
		case 'f':
			return (i==0 || j==0 || i==n/2);
		case 'g':
			return ((i==0 && j<=n/2 && j!=0) ||(j==0 && i!=0 && i!=n-1) || (i==n-1 && j!=0 && j<n/2) || (j==n/2 && i>n/2 && i!=n-1) || (i==n/2 && j>n/2 && j!=n-1) || (j==n-1 && i>n/2));
		case 'h':
			return (j==0 || j==n-1 || i==n/2);
		case 'i':
			return (i==0 || i==n-1 || j==n/2);
		case 'j':
			return (i==0 || j==n/2 || i-j==n/2);
		case 'k':
			return (j==0 || i+j==n/2 || i-j==n/2);
		case 'l':
			return (j==0 || i==n-1);
		case 'm':
			return (j==0 || j==n-1 || (i==j && j<=n/2) || (i+j==n-1 && i<=n/2));
		case 'n':
			return (j==0 || j==n-1 || i==j);
		case 'o':
			return ((i==0 && j!=0 && j!=n-1)||(j==0 && i!=0 && i!=n-1)||(i==n-1 && j!=0 && j!=n-1) || (j==n-1 && i!=0 && i!=n-1));
		case 'p':
			return ((i==0 && j!=0 && j!=n-1)||(j==0 && i!=0)|| (j==n-1 && i<n/2 && i!=0)|| (i==n/2 && j!=n-1));
		case 'q':
			return (i==0 || i==n-1 || j==0 || j ==n-1 || i==n/2);
		case 'r':
			return ((i==0 && j!=0 && j!=n-1)||(j==0 && i!=0)|| (j==n-1 && i<n/2 && i!=0)|| (i==n/2 && j!=n-1)|| (i-j)==n/2);
		case 's':
			return ((i==0 && j!=0 && j!=n-1)|| (j==0 && i<n/2 && i!=0) || (i==n/2 && j!=0 && j!=n-1) || (j==n-1 && i>n/2 && i!=n/2)|| (i==n-1 && j!=0 && j!=n-1));
		case 't':
			return (i==0 || j==n/2);
		case 'u':
			return ((j==0 && i!=0 && i!=n-1) || (i==n-1 && j!=n-1 && j!=0) || (j==n-1 && i!=0 && i!=n-1));
		case 'v':
			return (j==0 && i<=n/2) || i-j==n/2 || i+j==(n-1)+n/2 || (j==n-1 && i<=n/2);
		case 'w':
			return (j==0 || (i+j==n-1 && j<=n/2) || (i==j && j>=n/2) || j==n-1);
		case 'x':
			return (i==j ||i+j==n-1);
		case 'y':
			return (i+j==n-1 || (i==j && j<=n/2));
		case 'z':
			return (i==0 || i==n-1 || i+j==n-1);
		case ' ':  return (i>12 && j!=0);
		default:
			return false;
		}
	}

	static void printmsg(String str,int n) {
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < str.length(); k++) {
				for (int j = 0; j < n; j++) {
					if (condition(i, j, str.charAt(k), n))
						System.out.print("\u2665");
					else
						System.out.print(" ");
				}
				System.out.print(" ");

			}System.out.println("");

		}
	}
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter your message -:");
			//String str=sc.next();
			int n=7;
			//printmsg(str,n);
			printmsg("teaching method",n);
			System.out.println("\n");
			printmsg("is excellent in", n);
			System.out.println("\n");
			printmsg("destination institute", n);
		}
	}

}

