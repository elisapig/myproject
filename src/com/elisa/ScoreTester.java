package com.elisa;
/*
 * score������
 * ���Ƥ���0-59 �LFailed
 * ���Ƥ���60-69 �LPassed
 * ���Ƥ���70-79 �LGood
 * ���Ƥ���80-89 �LGreat
 * ���Ƥ���90-100 �LExcellent
 */
public class ScoreTester {

	public static void main(String[] args) {
		int score = 100;
		System.out.println(score/10);
		int level = score/10;
		switch(level){
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Failed");
			break;
		case 6:	
			System.out.println("Passed");
			break;
		case 7:	
			System.out.println("Good");
			break;
		case 8:	
			System.out.println("Great");
			break;
		case 9:	
		case 10:
			System.out.println("Excellent");
			break;
		}
	}

}
