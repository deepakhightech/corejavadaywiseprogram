package com.destination.sepbatchprogramming.sep18;

public class dedkd {
	public static void main(String[] args) {
		OurMethod om=new OurMethod();
		String str="hii deepak kumar";
		String [] strarray=str.split(" ");
		for(int i=0;i<strarray.length;i++) {
			System.out.print(om.reverse(strarray[i])+" ");
		}

	}
}
