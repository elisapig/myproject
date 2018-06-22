package com.java2.oo;
	
	import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
			for(Course c : courses){
				if(!c.isAvailable(weekday,hour)){
					System.out.println("[有課:"+c.getId+" "+c.getName+" 到"+(c.getWeekday+c.ge);
					avail = false;
					break;
				}
			}
		if(avail){
			System.out.println("[有空檔]");
		}
			
		
		
		public void readCourses() {
			try {
				BufferedReader in = new BufferedReader(new FileReader("schedule.txt"));
				String line = in.readLine();
				while(line!=null) {
					String tockens =Integer.parseInt(tockens[0]);
					
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
				
			
		}}


		private void readCourses() {
			new Main();
			
		}


		public static void main(String[] args) {
			
			Schedule sc = new Schedule();
			
			sc.print();
		}

	}

