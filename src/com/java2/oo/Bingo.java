package com.java2.oo;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
/*25�N��5X5�@25���y�A���ͮɴN���üƱƦC�X��
 * �p�U:
 *  5 10 11  8 25
 * 13  6 21  4  1
 * 22 15 23 19  7
 *  2 20 18  3 14
 * 17  9 12 24 16 
 * bingo.txt:25
 * 8,4,7,18,21,3,5,1,9,10
 */
public class Bingo{
	public Bingo() {
		FileReader fr;
		try {
//			bingi���
			fr = new FileReader("bingo.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			int number = Integer.parseInt(line);
			int table =(int) Math.sqrt(number);
			String token[] = line.split(",");
			List<Integer> ans = new ArrayList<>();
			for(int i = 0 ;i<=token.length-1;i++) {
				int an = Integer.parseInt(token[i]);
				ans.add(an);
			}
			Table tb = new Table(table, number, ans);
			tb.print();
			tb.bingo();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
				
	}
		public static void main(String[] args) {
	        new Bingo(); 
//			Random r = new Random();
//			int list[] = new int[25 + 1];
//			for (int i = 1; i <= 25; i++) {
//				list[i] = i;
//			}
//			for (int i = 0; i < list.length; i++) {
//				int j = r.nextInt((25) + 1);
//				// card[i]<->card[j]
//				int tmp = list[i];
//				list[i] = list[j];
//				list[j] = tmp;
//			}
//			for (int i = 1; i <= list.length; i++) {
//				int y = list[i];
//				if (i % 5 == 0) {
//					System.out.println(y);
//				} else {
//					System.out.print(y + "\t");
//				}
	//
	//
//			}
		}
	}

