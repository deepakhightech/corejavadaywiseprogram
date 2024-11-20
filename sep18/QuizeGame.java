package com.destination.sepbatchprogramming.sep18;

import java.util.Random;
import java.util.Scanner;
class UserInforamation{
	private String user_name;
	private String user_age;
	private String user_phone;
	void user_info() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name -:");
		user_name=sc.next().toUpperCase();
		System.out.println("Enter your age -:");
		user_age=sc.next();
		System.out.println("Enter your Mobile number -:");
		user_phone=sc.next();
		
	}
	public String getUser_name() {
		return user_name;
	}
	public String getUser_age() {
		return user_age;
	}
	public String getUser_phone() {
		return user_phone;
	}
}
class FunctonalityGame {
	String[] question = { "1. What is the default value of a boolean variable?",
			"2. Which of the following is not a keyword in Java?",
			"3. Which of these is a valid way to create an object in Java?",
			"4. Which of these methods is used to get the length of a string in Java?",
			"5. In Java, which operator is used to compare two values for equality?",
			"6. Which of the following is used to handle exceptions in Java?",
			"7. Which of these access modifiers allows access from any other class in Java?",
			"8. Which of these is not a feature of Java?",
			"9. Which method in Java is called when an object is created?",
			"10 .What is the correct way to declare an array in Java?",
			"11. Which of the following is the correct syntax to inherit a class in Java?",
			"12. Which package contains the Scanner class in Java?",
			"13. What will happen if a class does not have a main method?" };
	
	
	private String[] option = { 
			"A. true\r\n" + 
			"B. false\r\n" + 
			"C. 0\r\n" + 
			"D. null",
			
			"A. class\r\n" + 
			"B. try\r\n" + 
			"C. get\r\n" + 
			"D. new",
			
			"A. Class obj = new Class();\r\n" + 
			"B. Class obj = Class();\r\n" + 
			"C. new Class obj = new Class();\r\n"+ 
			"D. obj Class = new Class();",
			
			"A. length()\r\n" + 
			"B. size()\r\n" + 
			"C. length\r\n" + 
			"D. getSize()",
			
			"A. ==\r\n" + 
			"B. =\r\n" + 
			"C. !=\r\n" + 
			"D. equals",
			
			"A. if statement\r\n" + 
			"B. try-catch block\r\n" + 
			"C. throw statement\r\n" + 
			"D. None of the above",
			
			"A. private\r\n" + 
			"B. protected\r\n" + 
			"C. public\r\n" + 
			"D. default",
			
			"A. Platform-independent\r\n" + 
			"B. Object-oriented\r\n" + 
			"C. Robust\r\n" + 
			"D. Pointer-based",
			
			"A. finalize\r\n" + 
			"B. start\r\n" + 
			"C. constructor\r\n" + 
			"D. main",
			
			"A. int arr[] = new int[5];\r\n" + 
			"B. int arr = new int[5];\r\n" + 
			"C. arr{5} = new int[];\r\n" + 
			"D. int arr(5);",
			
			"A. class A extends B {}\r\n" + 
			"B. class B implements A {}\r\n" + 
			"C. class A + B {}\r\n"+ 
			"D. class A inherits B {}",
			
			"A. java.io\r\n" + 
			"B. java.util\r\n" + 
			"C. java.lang\r\n" + 
			"D. java.awt",
			
			"A. It will compile and run normally.\r\n" + 
			"B. It will not compile.\r\n"+ 
			"C. It will compile but not run.\r\n" + 
			"D. It will throw an exception at runtime."
			};

	private String answer[] = { "B. false", "C. get", "A. Class obj = new Class()", "A. length()", "A. ==",
			"B. try-catch block", "C. public", "D. Pointer-based", "C. constructor", "A. int arr[] = new int[5]",
			"A. class A extends B {}", "B. java.util", "C. It will compile but not run" };
	
	private int reward[] = { 1000, 2000, 4000 };

	void showquestion() {
		String user_answer;
		int lifiline;
		int call = 1;
		int fifty = 1;
		int totalamount = 0;
		for (int i = 0; i < 4; i++) {
			System.out.println("\n" + question[i]);
			System.out.println("\n" + option[i]);
			System.out.println("\n please choose the option or (choose lifeline (L)) -: ");
			Scanner sc = new Scanner(System.in);
			user_answer = sc.nextLine().toUpperCase();
			if (user_answer.charAt(0) == 'L') {
				if (call == 0 && fifty == 0) {
					System.out.println("sorry ! you have already use your lifeline...");
					System.out.println("Please enter your option (a-d/A-D) -: ");
					user_answer = sc.nextLine().toUpperCase();
				} else {
					if (call == 1) {
						System.out.println("\n1. take Help our audiance");
					}
					if (fifty == 1) {
						System.out.println("2. fiftyfity");
					}
					System.out.println("\nplease choose your lifeline-:");
					lifiline = sc.nextInt();
					if (lifiline == 1 && call == 1) {
						System.out.println("\nEnter audiance answer is-: ");
						user_answer=sc.next().toUpperCase();
						call = 0;
					} else if (lifiline == 1 && call == 0) {
						System.out.println("audiance is already used");
			
					}
					else if (lifiline == 2 && fifty == 0) {
						System.out.println("50-50 are already used");
						//fifty = 0;
					} 		else if (lifiline == 2 && fifty == 1){
						System.out.println("\n50-50 using");
						String correctAnswer = answer[i]; // Fetch the correct answer
						Random rand = new Random();
						int correctIndex = correctAnswer.charAt(0) - 'A'; // Determine correct option index
						int removed = 0;
						boolean[] toHide = new boolean[4];
						
					    while (removed < 2) {
					        int randomIndex = rand.nextInt(4); // Choose an index from 0 to 3
					        if (randomIndex != correctIndex && !toHide[randomIndex]) {
					            toHide[randomIndex] = true;
					            removed++;
					        }
					    }
					    System.out.println("\nHere are the options after using 50-50:\n");
					    for (int j = 0; j < 4; j++) {
					        if (!toHide[j]) {
					            System.out.println(option[i].split("\r\n")[j]); // Display valid options
					        }
					    }
					    System.out.println("\nEnter your answer:");
					    user_answer = sc.next().toUpperCase();
					    fifty = 0; // Mark 50-50 as used
					}
				} // end of main else
			} // end of main if
		   
			if (user_answer.charAt(0) == answer[i].charAt(0)) {
				System.out.println("congratualation ! you won " + reward[i] + " Rs");
				totalamount = totalamount + reward[i];
				System.out.println("you have WON total amount = " + totalamount + " Rs");
			} else {
				System.out.println("SORRY ! you should try next time..........");
				System.out.println("you have WON total amount = " + totalamount + " Rs");
				break;
			}
		}
	}

}

public class QuizeGame {
	public static void main(String[] args) {
		
		FunctonalityGame g = new FunctonalityGame();
		UserInforamation user=new UserInforamation();
		
		Scanner sc = new Scanner(System.in);
		user.user_info();
		System.out.println("Hii "+user.getUser_name() +" are you interested for playing KBC with me if you are interestd enter Y/N or (YES/NO) -: ");
		String user_permission=sc.next().toUpperCase();
		if(user_permission.charAt(0)=='Y') {
			g.showquestion();
		}else {
			System.out.println("OK SIR THANK YOU !");
			System.exit(0);
		}
		
	

		
	}
}


