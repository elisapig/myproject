package com.java2.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
//showFunction方法:顯示主功能列表
//start:開始接收使用者輸入功能
//inputSales方法:接收使用者輸入一筆銷售紀錄
	
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
				System.out.println("請輸入會員等級");
				int type = scanner.nextInt();
				System.out.println("請輸入銷售金額");
				int amount =scanner.nextInt();
				out.print(type+"\t"+amount);
				out.flush();
				out.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
				
			}
		public void ShowFunctions(){
			System.out.println("請輸入功能(1~3):");
			System.out.println("1) 輸入銷售紀錄");
			System.out.println("2) 印出銷售報表");
			System.out.println("3) 結束");
	}
		public static void main(String[] args) {
			Sogo sogo = new Sogo();
			sogo.start();
			
}
}