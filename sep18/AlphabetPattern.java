package com.destination.sepbatchprogramming.sep18;

public class AlphabetPattern {
	static void a(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==0 && j!=0 && j!=n-1) || (j==0 && i!=0)|| (j==n-1  && i!=0) || i==n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		// B laphabet
		System.out.println("\nfor B\n");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 || j==0 || j==n-1 || i==n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		// c laphabet
		System.out.println("\nfor c\n");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==0 && j!=0)|| (j==0 && i!=0 && i!=n-1)||(i==n-1 && j!=0))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
		// D laphabet
		System.out.println("\nfor D\n");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || (i==0 && j!=n-1) || (j==n-1 && i!=0 && i!=n-1) || (i==n-1 && j!=n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		// E laphabet
		System.out.println("\nfor E\n");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 || j==0 || i==n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		// F laphabet
		System.out.println("\nfor F\n");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0  || j==0  || i==n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		// G laphabet
		System.out.println("\nfor B\n");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==0 && j<=n/2 && j!=0) ||(j==0 && i!=0 && i!=n-1) || (i==n-1 && j!=0 && j<n/2) || (j==n/2 && i>n/2 && i!=n-1) || (i==n/2 && j>n/2 && j!=n-1) || (j==n-1 && i>n/2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		// H laphabet
		System.out.println("\nfor H\n");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1 || i==n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		// I laphabet
		System.out.println("\nfor I\n");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 || j==n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		// J laphabet
		System.out.println("\nfor B\n");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j==n/2 || i-j==n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		// K laphabet
		System.out.println("\nfor K\n");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || i+j==n/2 || i-j==n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		// L laphabet
		System.out.println("\nfor L\n");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || i==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		// M laphabet
		System.out.println("\nfor M\n");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1 || (i==j && j<=n/2) || (i+j==n-1 && i<=n/2) || (i==n-1 && j!=0 && j!=n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
		
		// N laphabet
		System.out.println("\nfor N\n");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1 || i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
		// O laphabet
		System.out.println("\nfor O\n");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==0 && j!=0 && j!=n-1)||(j==0 && i!=0 && i!=n-1)||(i==n-1 && j!=0 && j!=n-1) || (j==n-1 && i!=0 && i!=n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		// p laphabet
		System.out.println("\nfor P\n");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==0 && j!=0 && j!=n-1)||(j==0 && i!=0)|| (j==n-1 && i<n/2 && i!=0)|| (i==n/2 && j!=n-1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		// Q laphabet
		System.out.println("\nfor Q is also pending for no proper structure\n");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 || j==0 || j==n-1 || i==n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		// R laphabet
		System.out.println("\nfor R\n");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==0 && j!=0 && j!=n-1)||(j==0 && i!=0)|| (j==n-1 && i<n/2 && i!=0)|| (i==n/2 && j!=n-1)|| (i+j)==n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		// S laphabet
		System.out.println("\nfor S\n");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==0 && j!=0 && j!=n-1)|| (j==0 && i<n/2 && i!=0) || (i==n/2 && j!=0 && j!=n-1) || (j==n-1 && i>n/2 && i!=n/2)|| (i==n-1 && j!=0 && j!=n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			} 
			System.out.println();
		}
		
		// T laphabet
		System.out.println("\nfor T\n");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j==n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		// U laphabet
		System.out.println("\nfor U\n");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((j==0 && i!=0 && i!=n-1) || (i==n-1 && j!=n-1 && j!=0) || (j==n-1 && i!=0 && i!=n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		// V laphabet
		System.out.println("\nfor V\n");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((j==0 && i<=n/2) || i-j==n/2 || i+j==(n-1)+n/2 || (j==n-1 && i<=n/2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		// W laphabet
		System.out.println("\nfor W\n");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || (i+j==n-1 && j<=n/2) || (i==j && j>=n/2) || j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		// X laphabet
		System.out.println("\nfor X\n");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j || i+j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
		// Z laphabet
		System.out.println("\nfor Y\n");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j==n-1 || (i==j && j<=n/2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	System.out.println("\nfor Z\n");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 || i+j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int n=11;
		a(n);
		System.out.print("dfgfdgd");
			
	}

}
