package com.java2.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
//showFunction��k:��ܥD�\��C��
//start:�}�l�����ϥΪ̿�J�\��
//inputSales��k:�����ϥΪ̿�J�@���P�����
	
public class Sogo {
	Scanner scanner =new Scanner(System.in);
		public Sogo(){
		}
		
		public void start(){
			ShowFunctions();
		
		int function =0;
		while (function != 3){
			switch(function){
			case 1:
				inputSales();
				break;
			case 3:
				return;
			}	
			}}
		
		public void inputSales(){
			try{
				FileOutputStream fos = new FileOutputStream("sales.txt", true);
				PrintStream out=new PrintStream(fos);
				System.out.println("�п�J�|������");
				int type = scanner.nextInt();
				System.out.println("�п�J�P����B");
				int amount =scanner.nextInt();
				out.print(type+"\t"+amount);
				out.flush();
				out.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
				
			}
		public void ShowFunctions(){
			System.out.println("�п�J�\��(1~3):");
			System.out.println("1) ��J�P�����");
			System.out.println("2) �L�X�P�����");
			System.out.println("3) ����");
	}
		public static void main(String[] args) {
			Sogo sogo = new Sogo();
			sogo.start();
			
}
}