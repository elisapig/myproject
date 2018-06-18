package com.java2.oo;
	
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	/*有一個文字檔儲存了表資料(schedule.txt)
	 * 請讀取資料後，設計程式可檢查是否有空檔?
	 * 如:
	 * 請輸入星期(1~7):2
	 * 請輸入時(0~24):11
	 * [有空檔]
	 * 請輸入星期(1-7):4
	 * 請輸入時(0-24):14
	 * [有課: C004 English 到 16時]
	 * */
	public class Schedule {
		List<Integer> days = new ArrayList<>();
		int week;
		int time;
		String subject;
		
		public void schedule() {
			System.out.println("請輸入星期:");
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			int n = Integer.parseInt(line) ;

			if (n=1){
				System.out.println("是奇數");
			 }else{System.out.println("是偶數");
				
			System.out.println("請輸入時間:");
			Scanner s = new Scanner(System.in);
			String l = scanner.nextLine();
		}
		}
		public void print() {
			
		}
		public static void main(String[] args) {
			
			Schedule sc = new Schedule();
			
			sc.print();
		}

	}

