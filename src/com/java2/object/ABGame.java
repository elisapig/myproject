package com.java2.object;

import java.util.Scanner;

public class ABGame {

	public static void main(String[] args) {
		String secret = "9873";
		// String nums = "1356";
		// String nums = "2461";
		String nums = "7895";
		// String nums = "8793";
		// String nums = "9873";
		int a = 0;
		int b = 0;
		Scanner scanner = new Scanner(System.in);
	while(a!=4){
			a=0;
			b=0;
			System.out.println("Please enter your guess:");
			
			String line = scanner.nextLine();
		
		
		int lenght = secret.length();
		for (int i = 0; i < nums.length(); i++) {
			char c = nums.charAt(i);
			for (int j = 0; j < lenght; j++) {
				if (c == secret.charAt(j)) {
					if (i == j) {
						a++;
					} else {
						b++;
					}
					break;
				}
			}
			
		}
		System.out.print(a + "A" + b + "B");
		System.out.println("");
	}
	}
}