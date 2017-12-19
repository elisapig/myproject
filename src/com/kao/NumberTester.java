package com.kao;

public class NumberTester {

	public static void main(String[] args) {
		int n = 1;
		for (n = 1; n <= 100; n++) {
			if (n % 3 == 0) {
				System.out.print(n + " ");
				if (n % 15 == 0) {
					System.out.println(" ");
				}
			}
		}
	}
}
