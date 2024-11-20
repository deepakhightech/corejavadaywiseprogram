package com.destination.sepbatchprogramming.sep18;

import java.util.Arrays;

import java.util.HashSet;

 class demo {
    public static void main(String[] args) {
        int[] arr = {1, 3,3,3,3, 4, 2, 2, 3, 1};  // Example array with multiple duplicates

        findDuplicates(arr);
    }

    static void findDuplicates(int[] arr) {
        System.out.println("Duplicate elements are:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // Check if two elements are equal and not already printed
                if (arr[i] == arr[j] && i != j) {
                    // Print only if it's the first occurrence of the duplicate
                    boolean alreadyPrinted = false;
                    for (int k = 0; k < i; k++) {
                        if (arr[k] == arr[i]) {
                            alreadyPrinted = true;
                            break;
                        }
                    }
                    if (!alreadyPrinted) {
                        System.out.println(arr[i]);
                    }
                }
            }
        }
    }
}




