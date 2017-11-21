package com.elisa;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		/*
		 * Please entr a number:13 1 2 3 4 5 6 7 8 9 10 11 12 13 3ªº­¿¼Æ¤£¦L
		 */

		for (int k = 1; k <= 13; k++) {
			if (k % 3 == 0) {
				continue;
			}
			System.out.print(k + " ");
		}

		System.out.println();

		System.out.print("Please inter a number:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		int i = 1;
		while (i <= n) {
			System.out.print(i + " ");
			i = i + 1;
			if (i > 10) {
				break;
			}

		}
	}

}
