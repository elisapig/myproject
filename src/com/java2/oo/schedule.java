package com.java2.oo;
	
	import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	/*���@�Ӥ�r���x�s�F����(schedule.txt)
	 * ��Ū����ƫ�A�]�p�{���i�ˬd�O�_������?
	 * �p:
	 * �п�J�P��(1~7):2
	 * �п�J��(0~24):11
	 * [������]
	 * �п�J�P��(1-7):4
	 * �п�J��(0-24):14
	 * [����: C004 English �� 16��]
	 * */
	 class Main{
		List<Course> courses = new ArrayList<>();
		public Main(){
			readCourses();
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("�п�J�P��(1~7):");
			int weekday = scanner.nextInt();
			System.out.println("�п�J��(0~24):");
			int hour = scanner.nextInt();
			boolean avail = true;
			for(Course c : courses){
				if(!c.isAvailable(weekday,hour)){
					System.out.println("[����:"+c.getId+" "+c.getName+" ��"+(c.getWeekday+c.ge);
					avail = false;
					break;
				}
			}
		if(avail){
			System.out.println("[������]");
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

