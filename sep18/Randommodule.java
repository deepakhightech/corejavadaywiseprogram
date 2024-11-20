package com.destination.sepbatchprogramming.sep18;

import java.util.Scanner;
import java.util.Random;

public class Randommodule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Questions, options, and answers
        String[] questions = {
            "What is the capital of France?",
            "What is the largest planet in our solar system?",
            "Who developed the theory of relativity?"
        };

        String[][] options = {
            {"A. Berlin", "B. Madrid", "C. Paris", "D. Rome"},
            {"A. Earth", "B. Jupiter", "C. Mars", "D. Saturn"},
            {"A. Isaac Newton", "B. Galileo Galilei", "C. Nikola Tesla", "D. Albert Einstein"}
        };

        char[] answers = {'C', 'B', 'D'}; // Correct answers
        int score = 0;
        boolean callUsed = false;
        boolean fiftyFiftyUsed = false;

        // Quiz loop
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your answer (or type 'L' for lifeline): ");
            char answer = scanner.next().toUpperCase().charAt(0);

            // Lifeline option
            if (answer == 'L') {
                System.out.println("Choose a lifeline: ");
                if (!callUsed) System.out.println("1. Call a Friend");
                if (!fiftyFiftyUsed) System.out.println("2. 50-50");

                int lifelineChoice = scanner.nextInt();
                
                if (lifelineChoice == 1 && !callUsed) {
                    System.out.println("Your friend thinks the answer is: " + answers[i]);
                    callUsed = true;
                } else if (lifelineChoice == 2 && !fiftyFiftyUsed) {
                    // Remove two wrong options for 50-50
                    System.out.println("50-50 Lifeline used! Here are two possible options:");
                    int correctIndex = answers[i] - 'A'; // Convert answer to index
                    int wrongOption;
                    do {
                        wrongOption = random.nextInt(4);
                    } while (wrongOption == correctIndex); // Ensure not the correct option

                    System.out.println(options[i][correctIndex]);
                    System.out.println(options[i][wrongOption]);
                    fiftyFiftyUsed = true;
                } else {
                    System.out.println("Lifeline already used or invalid choice.");
                }

                // Ask again after using lifeline
                System.out.print("Your answer: ");
                answer = scanner.next().toUpperCase().charAt(0);
            }

            // Check answer
            if (answer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong answer! Exiting the quiz.");
                break; // Exit the quiz if the answer is incorrect
            }
        }

        // Display final score
        System.out.println("Your final score is " + score + " out of " + questions.length + ".");
        
        scanner.close();
    }
}
