package com.destination.sepbatchprogramming.sep18;


import java.util.Random;
import java.util.Scanner;

class FunctonalityGame3 {
    String[] question = {
        "1. What is the default value of a boolean variable?",
        "2. Which of the following is not a keyword in Java?",
        "3. Which of these is a valid way to create an object in Java?",
        "4. Which of these methods is used to get the length of a string in Java?",
        "5. In Java, which operator is used to compare two values for equality?",
        "6. Which of the following is used to handle exceptions in Java?",
        "7. Which of these access modifiers allows access from any other class in Java?",
        "8. Which of these is not a feature of Java?",
        "9. Which method in Java is called when an object is created?",
        "10. What is the correct way to declare an array in Java?",
        "11. Which of the following is the correct syntax to inherit a class in Java?",
        "12. Which package contains the Scanner class in Java?",
        "13. What will happen if a class does not have a main method?"
    };
    
    String[] option = {
        "A. true\nB. false\nC. 0\nD. null",
        "A. class\nB. try\nC. get\nD. new",
        "A. Class obj = new Class();\nB. Class obj = Class();\nC. new Class obj = new Class();\nD. obj Class = new Class();",
        "A. length()\nB. size()\nC. length\nD. getSize()",
        "A. ==\nB. =\nC. !=\nD. equals",
        "A. if statement\nB. try-catch block\nC. throw statement\nD. None of the above",
        "A. private\nB. protected\nC. public\nD. default",
        "A. Platform-independent\nB. Object-oriented\nC. Robust\nD. Pointer-based",
        "A. finalize\nB. start\nC. constructor\nD. main",
        "A. int arr[] = new int[5];\nB. int arr = new int[5];\nC. arr{5} = new int[];\nD. int arr(5);",
        "A. class A extends B {}\nB. class B implements A {}\nC. class A + B {}\nD. class A inherits B {}",
        "A. java.io\nB. java.util\nC. java.lang\nD. java.awt",
        "A. It will compile and run normally.\nB. It will not compile.\nC. It will compile but not run.\nD. It will throw an exception at runtime."
    };
    
    String[] answer = {
        "B. false", "C. get", "A. Class obj = new Class()",
        "A. length()", "A. ==", "B. try-catch block",
        "C. public", "D. Pointer-based", "C. constructor",
        "A. int arr[] = new int[5]", "A. class A extends B {}",
        "B. java.util", "C. It will compile but not run"
    };
    
    int[] reward = {1000, 2000, 4000, 8000, 16000};
    
    void showquestion() {
        Scanner sc = new Scanner(System.in);
        int totalAmount = 0;
        boolean fiftyUsed = false;
        boolean audienceUsed = false;

        for (int i = 0; i < 5; i++) {
            System.out.println("\n" + question[i]);
            System.out.println(option[i]);
            System.out.println("\nPlease choose an option or type 'L' for lifeline:");
            
            String userAnswer = sc.nextLine().toUpperCase();
            
            if (userAnswer.equals("L")) {
                if (fiftyUsed && audienceUsed) {
                    System.out.println("Sorry! You have already used all your lifelines.");
                    userAnswer = sc.nextLine().toUpperCase();
                } else {
                    System.out.println("Choose a lifeline:\n1. Audience Help\n2. 50-50");
                    int lifeline = sc.nextInt();
                    sc.nextLine(); // Consume the newline
                    
                    if (lifeline == 1 && !audienceUsed) {
                        System.out.println("Audience suggests: " + answer[i]);
                        audienceUsed = true;
                        userAnswer = sc.nextLine().toUpperCase();
                    } else if (lifeline == 2 && !fiftyUsed) {
                        fiftyUsed = true;
                        Random rn = new Random();
                        int correctIndex = answer[i].charAt(0) - 'A';
                        int wrongIndex;
                        do {
                            wrongIndex = rn.nextInt(4);
                        } while (wrongIndex == correctIndex);
                        
                        System.out.println("50-50 Lifeline:");
                        System.out.println(option[i].split("\n")[correctIndex]);
                        System.out.println(option[i].split("\n")[wrongIndex]);
                        
                        userAnswer = sc.nextLine().toUpperCase();
                    } else {
                        System.out.println("Lifeline already used or invalid choice.");
                        userAnswer = sc.nextLine().toUpperCase();
                    }
                }
            }
            
            if (userAnswer.charAt(0) == answer[i].charAt(0)) {
                System.out.println("Congratulations! You won " + reward[i] + " Rs");
                totalAmount += reward[i];
                System.out.println("Total amount won: " + totalAmount + " Rs");
            } else {
                System.out.println("SORRY! Better luck next time.");
                System.out.println("Total amount won: " + totalAmount + " Rs");
                break;
            }
        }
        sc.close();
    }
}

public class ExceptionHandling2 {
    public static void main(String[] args) {
        FunctonalityGame3 game = new FunctonalityGame3();
        game.showquestion();
    }
}

