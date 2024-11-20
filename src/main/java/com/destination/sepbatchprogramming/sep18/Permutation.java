package com.destination.sepbatchprogramming.sep18;

public class Permutation {
    // Function to print all the permutations of the string
    static void permute(String str, String answer) {
    	int count=1;
        if (str.length() == 0) {
            System.out.print("1st-:"+answer + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left_substr = str.substring(0, i);
            String right_substr = str.substring(i + 1);
            String rest = left_substr + right_substr;
            System.out.println("original -:"+str);
            System.out.println("count "+count++);
            System.out.println("i= "+i);
            System.out.println("character-: "+answer);
            permute(rest, answer + ch);
        }
    }

    public static void main(String[] args) {
        String s = "AAB";
        permute(s, "");
    }
}

