package com.java2.oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Collecctions;
/*25�N��5X5�@25���y�A���ͮɴN���üƱƦC�æC�L�X��
 * �p�U:
 *  5 10 11  8 25
 * 13  6 21  4  1
 * 22 15 23 19  7
 *  2 20 18  3 14
 * 17  9 12 24 16 
 */
public class BIngoMain {
	List<Integer> numbers = new ArrayList<>();
	int count;
	int row;
	public void BingoMain(int count){
		for(int i=0;i<count;i++){
			numbers.add(i+1);
		}
		Collecctions.shuffle(nembers);
		
	}
	public static void main(String[] args) {
		
	}

}
