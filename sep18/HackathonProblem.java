package com.destination.sepbatchprogramming.sep18;

public class HackathonProblem {
	public static void main(String[] args) {
		String str1 = "fgrqsqsnodwmzkzxqegkndaa";
		String str2 = "ky";
		int j = 0, k = 0;
		System.out.println(str2.charAt(str2.length() - 1));
		j = str1.indexOf(str2.charAt(0));
		if (j == -1)
			System.out.println("cgaracter is not match in given string ");
		else {
			System.out.println(j);
			for (int i = j; i < str1.length(); i++) {
				if (str2.charAt(str2.length() - 1) == str1.charAt(i)) {
					k = i;
					break;
				}
			}
			System.out.println(j + "  " + k);
			if (k == j || k == 0)
				System.out.println(str1.substring(j));
			else
				System.out.println(str1.substring(j, k + 1));
		}
	}
}
