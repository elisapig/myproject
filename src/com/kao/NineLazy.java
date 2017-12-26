package com.kao;

public class NineLazy {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int n = 2; n <= 9; n++) {
				if (3 < i && i < 9) {
					System.out.print("..." + "\t");
				} else {

					if ((i * n) < 10) {
						System.out.print(n + "*" + i + "=" + " " + (n * i) + "\t");
					} else {
						System.out.print(n + "*" + i + "=" + (n * i) + "\t");
					}
				}

			}
			System.out.println("");
		}
	}
}