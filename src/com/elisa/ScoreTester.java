package com.elisa;
/*
 * scoreだ计
 * だ计ざ0-59 Failed
 * だ计ざ60-69 Passed
 * だ计ざ70-79 Good
 * だ计ざ80-89 Great
 * だ计ざ90-100 Excellent
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
