package com.destination.sepbatchprogramming.sep18;

import java.util.Scanner;

class matrxoperation{
	int m1[][];
	int m2[][];
	int sum[][];
    void create() {
    	m1=new int[2][2];
    	m2=new int[2][2];
    	sum=new int[2][2];
    }
    Scanner sc=new Scanner(System.in);
    void colllectdata() {
    	System.out.println("enter data of first arry-:");
    	for(int i=0;i<2;i++) {
    		for(int j=0;j<2;j++) {
    			System.out.println("enter data -:");
    			m1[i][j]=sc.nextInt();
    		}
    	}
    	System.out.println("enter data of second arry-:");
    	for(int i=0;i<2;i++) {
    		for(int j=0;j<2;j++) {
    			System.out.println("enter data -:");
    			m2[i][j]=sc.nextInt();
    		}
    	}
    	
    }
    
    void add() {
     	System.out.println("additin of matrix is-:");
    	for(int i=0;i<2;i++) {
    		for(int j=0;j<2;j++) {
    			for(int k=0;k<2;k++) {
    				sum[i][j]=sum[i][j]+m1[i][k]*m2[k][j];
    			}
    			//sum[i][j]=m1[i][j]+m2[i][j];       // sum of matrx
    			
    			System.out.print(sum[i][j]+"  ");
    		}
    		System.out.println();
    	}
    }
    
    
}
public class Addtwomatrx {
	public static void main(String[] args) {
		matrxoperation obj=new matrxoperation();
		obj.create();
		obj.colllectdata();
		obj.add();
	}
}
