package com.destination.sepbatchprogramming.sep18;

public class asds {
	public static void printTop(int userInput) {
	    String row = "";
	    int width = 2 * (userInput - 1) + 3 * userInput;
	    for (int height = 0; height < userInput; height++) {
	        for (int i = 0; i < userInput - 1; i++) {
	            row += "♡";
	        }
	        for (int i = 0; i < userInput; i++) {
	            row += "♥";
	        }
	        for (int i = 0; i < userInput; i++) {
	            row += " ";
	        }
	        for (int i = 0; i < userInput; i++) {
	            row += "♥";
	        }
	        for (int i = 0; i < userInput - 1; i++) {
	            row += "♡";
	        }
	        row += "\n";
	    }
	    System.out.println(row);
	}
	public static void main(String[] args) {
		printTop(4);
	}
}
