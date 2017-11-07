package com.elisa;

public class Prime {

	public static void main(String[] args) {
		int n = 10;
		boolean prime = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				// Not prime
				prime = false;
				break;
				// System.out.println("Not PRIME");
			}

		}
		if (prime) {
			System.out.println(n + "Is PRIME NUMBER");
		} else {
			System.out.println(n + "NOT PRIME");
		}
	}

}
