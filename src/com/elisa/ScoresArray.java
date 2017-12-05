package com.elisa;

public class ScoresArray {

	public static void main(String[] args) {
		int scores[][] = new int[5][3];
		scores[0][0] = 10;
		scores[0][1] = 20;
		scores[0][2] = 30;
		scores[1][0] = 20;
		scores[1][1] = 40;
		scores[1][2] = 60;
		scores[2][0] = 50;
		scores[2][0] = 20;
		scores[2][1] = 30;
		scores[2][2] = 40;
		scores[3][0] = 60;
		scores[3][1] = 50;
		scores[3][2] = 10;
		scores[4][0] = 40;
		scores[4][1] = 60;
		scores[4][2] = 80;
		for (int i = 0; i < 5; i++) {
			System.out.print(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t"
					+ (scores[i][0] + scores[i][1] + scores[i][2]) / 3);

			int average = ((scores[i][0] + scores[i][1] + scores[i][2]) / 3);
			if (average < 60) {
				System.out.println("*");
			} else {
				System.out.println();
			}

		}
	}
}
