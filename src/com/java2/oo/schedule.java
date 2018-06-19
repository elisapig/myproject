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
	 class Main{
		List<Course> courses = new ArrayList<>();
		public Main(){
			readCourses();
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("請輸入星期(1~7):");
			int weekday = scanner.nextInt();
			System.out.println("請輸入時(0~24):");
			int hour = scanner.nextInt();
			boolean avail = true;
			for(Couese c : courses){
				if(!c.isAvailable(weekday,hour)){
					System.out.println("[有課:"+c.getId+" "+c.getName+" 到"+(c.getWeekday+c.ge);
					avail = false;
					break;
				}
			}
		if(avail){
			System.out.println("[有空檔]");
		}
			
		
		



		public static void main(String[] args) {
			
			Schedule sc = new Schedule();
			
			sc.print();
		}

	}

