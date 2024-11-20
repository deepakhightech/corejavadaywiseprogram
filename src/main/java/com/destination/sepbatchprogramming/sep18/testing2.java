package com.destination.sepbatchprogramming.sep18;

import java.util.logging.*;

public class testing2 {
    private static final Logger LOGGER = Logger.getLogger(testing2.class.getName());

    public static void main(String[] args) {
        try {
            int result = 10 / 2; // Throws ArithmeticException
        } catch (ArithmeticException e) {
            LOGGER.warning("ArithmeticException occurred: " + e.getMessage());
        } finally {
            LOGGER.info("Finally block executed for logging.");
        }
    }
}
