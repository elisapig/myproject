package com.elisa;

import java.util.Scanner;

public class GameTester {
	/*
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = -1;
		int pos = 0;
		int row = 3;
		int column = 5;
		int hp = 100;
		while (n != 0) {
			System.out.print("�п�J��V");
			String line = scanner.nextLine();
			n = Integer.parseInt(line);
			switch (n) {

			case 8:
				if (pos / column >= row - 2) {
					pos = pos - column;
					System.out.println("�V�W");
					System.out.println(hp = hp - 5);
				} else {
					System.out.println(hp = hp - 30);
				}
				break;

			case 2:
				if (pos / column < row - 1) {
					pos = pos + column;
					System.out.println("�V�U");
					System.out.println(hp = hp - 5);
				} else {
					System.out.println(hp = hp - 30);
				}
				break;

			case 4:
				if (pos % column != 0) {
					pos = pos - 1;
					System.out.println("�V��");
					System.out.println(hp = hp - 5);
				} else {
					System.out.println(hp = hp - 30);
				}
				break;

			case 6:
				if (pos % column != (column - 1)) {
					pos = pos + 1;
					System.out.println("�V�k");
					System.out.println(hp = hp - 5);
				} else {
					System.out.println(hp = hp - 30);
				}
				break;

			}
			if (hp <= 0) {
				System.out.println("You Lose");
				break;
			}

		}
	}
}
