package com.java2.oo;
	
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
	public class Schedule {
		List<Integer> days = new ArrayList<>();
		int week;
		int time;
		String subject;
		
		public void schedule() {
			System.out.println("�п�J�P��:");
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			int n = Integer.parseInt(line) ;

			if (n=1){
				System.out.println("�O�_��");
			 }else{System.out.println("�O����");
				
			System.out.println("�п�J�ɶ�:");
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

