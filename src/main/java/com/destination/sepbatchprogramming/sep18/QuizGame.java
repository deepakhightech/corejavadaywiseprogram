package com.destination.sepbatchprogramming.sep18;

import java.util.Random;
import java.util.Scanner;

// Class for User Information
class UserInformation {
    private String userName;
    private String userAge;
    private String userPhone;

    void userInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        userName = sc.nextLine().toUpperCase();
        System.out.println("Enter your age:");
        userAge = sc.next();
        System.out.println("Enter your Mobile number:");
        userPhone = sc.next();
    }

    public String getUserName() {
        return userName;
    }

    public String getUserAge() {
        return userAge;
    }

    public String getUserPhone() {
        return userPhone;
    }
}

// Class for storing questions
class Question {
    private String[] questions = {
            "1. Which of the following is NOT a feature of Java?",
            "2. What is the size of an int in Java?",
            "3. Which of these keywords is used to define a constant in Java?",
            "4. Which of these access specifiers can be used for a class?",
            "5. In Java, which operator is used to compare two values for equality?",
            "6. Which of the following is used to handle exceptions in Java?",
			"7. Which of these access modifiers allows access from any other class in Java?",
			"8. Which of these is not a feature of Java?",
			"9. Which method in Java is called when an object is created?",
			"10 .What is the correct way to declare an array in Java?",
			"11. Which of the following is the correct syntax to inherit a class in Java?",
			"12. Which package contains the Scanner class in Java?",
			"13. What will happen if a class does not have a main method?",
			"14. Which exception is thrown when dividing a number by zero in Java?"
    };

    public String getQuestion(int index) {
        return questions[index];
    }
    public int getquestionlength() {
    	return questions.length;
    }
}

// Class for storing options
class Option {
    private String[] options = {
    		"a Platform independence\r\n"
    		+ "b Object-oriented\r\n"
    		+ "c Supports pointers\r\n"
    		+ "d Multithreading",
    				
    				"a 8 bits\r\n"
    				+ "b 16 bits\r\n"
    				+ "c 32 bits\r\n"
    				+ "d 64 bits",
    				
    				"a constant\r\n"
    				+ "b static\r\n"
    				+ "c final\r\n"
    				+ "d immutable",
    				
    				"a public\r\n"
    				+ "b protected\r\n"
    				+ "c private\r\n"
    				+ "d All of the above",
    				
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
    				"D. It will throw an exception at runtime.",
    				
    				"a NumberFormatException\r\n"
    				+ "b ArithmeticException\r\n"
    				+ "c NullPointerException\r\n"
    				+ "d IllegalArgumentException"
    };

    public String getOptions(int index) {
        return options[index];
    }
}

// Class for storing rewards
class Reward {
    private int[] rewards = {1000, 2000, 4000, 8000, 16000,32000,64000,128000,256000,512000,1024000,2048000,4096000,8192000};

    public int getReward(int index) {
        return rewards[index];
    }
}
// class for answer
class Answer{
	private String[] answers = { "C", "C", "C", "A", "A",
			"B", "C", "D", "C", "A",
			"A", "B", "C","B" };
	
    public String getanswers(int index) {
        return answers[index];
    }
}

// Class for game functionality
class FunctionalityGame {

    void showQuestions(Question question, Option option, Reward reward,Answer answer) {
        String userAnswer;
        int lifeline;
        int call = 1;
        int fifty = 1;
        int totalAmount = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 13; i < question.getquestionlength(); i++) {
            System.out.println("\n" + question.getQuestion(i));
            System.out.println("\n" + option.getOptions(i));
            System.out.println("\nPlease choose the option or (choose lifeline (L)): ");
            userAnswer = sc.nextLine().toUpperCase();

            if (userAnswer.charAt(0) == 'L') {
                if (call == 0 && fifty == 0) {
                    System.out.println("Sorry! You have already used your lifeline...");
                    System.out.println("Please enter your option (A-D): ");
                    userAnswer = sc.nextLine().toUpperCase();
                } else {
                    if (call == 1) {
                        System.out.println("\n1. Take Help from Audience");
                    }
                    if (fifty == 1) {
                        System.out.println("2. Fifty-Fifty");
                    }
                    System.out.println("\nPlease choose your lifeline:");
                    lifeline = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    if (lifeline == 1 && call == 1) {
                        System.out.println("\nEnter Audience answer is: -: ");
                        userAnswer = sc.nextLine().toUpperCase();
                        call = 0;
                    } else if (lifeline == 2 && fifty == 1) {
                        System.out.println("\n50-50 lifeline activated");
                        String correctAnswer = answer.getanswers(i);
                        Random rand = new Random();
                        int correctIndex = correctAnswer.charAt(0) - 'A';
                        boolean[] toHide = new boolean[4];
                        int removed = 0;

                        while (removed < 2) {
                            int randomIndex = rand.nextInt(4);
                            if (randomIndex != correctIndex && !toHide[randomIndex]) {
                                toHide[randomIndex] = true;
                                removed++;
                            }
                        }
                        System.out.println("\nOptions after 50-50:\n");
                        for (int j = 0; j < 4; j++) {
                            if (!toHide[j]) {
                                System.out.println(option.getOptions(i).split("\n")[j]);
                            }
                        }
                        System.out.println("\nEnter your answer:");
                        userAnswer = sc.nextLine().toUpperCase();
                        fifty = 0;
                    }
                }
            }

            if (userAnswer.charAt(0) == answer.getanswers(i).charAt(0)) {
                System.out.println("Congratulations! You won " + reward.getReward(i) + " Rs");
                totalAmount += reward.getReward(i);
                System.out.println("Your total winning amount is: " + totalAmount + " Rs");
            } else {
                System.out.println("SORRY! You should try next time...");
                System.out.println("Your total winning amount is: " + totalAmount + " Rs");
                break;
            }
        }
    }
}

// Main class
public class QuizGame {
    public static void main(String[] args) {
        FunctionalityGame game = new FunctionalityGame();
        UserInformation user = new UserInformation();
        Question question = new Question();
        Option option = new Option();
        Reward reward = new Reward();
        Answer answer =new Answer();

        Scanner sc = new Scanner(System.in);
        user.userInfo();

        System.out.println("Hi " + user.getUserName() + ", are you interested in playing KBC? Enter Y/N (YES/NO): ");
        String userPermission = sc.next().toUpperCase();

        if (userPermission.charAt(0) == 'Y') {
            game.showQuestions(question, option, reward,answer);
        } else {
            System.out.println("OK! sir Thank you!");
            System.exit(0);
        }
    }
}
