package com.elisa;

import java.util.Scanner;

public class GameTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = -1;
		while (n != 0) {
			System.out.print("�п�J��V");
			String line = scanner.nextLine();
			n = Integer.parseInt(line);
			switch (n) {

			case 8:
				System.out.println("�V�W");
				break;
			case 2:
				System.out.println("�V�U");
				break;
			case 4:
				System.out.println("�V��");
				break;
			case 6:
				System.out.println("�V�k");
				break;
			case 0:
				System.out.println("You Lose");
			}
		}
	}

}
