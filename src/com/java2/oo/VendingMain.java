package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class VendingMain {

	public static void main(String[] args) {
		
		//讀取鍵盤輸入 BufferedReader buf  =  new BufferdReader (new InputStreamReader(System.in));
		//readLine() 讀取檔案每行資料 傳回為String 自動刪除跳行符號回此字會湊在一起
		VendingMachine vm = new VendingMachine();
		FileReader fr;
		try {
			fr = new FileReader("vending.txt");
			BufferedReader in = new BufferedReader(fr);//讀取"vending.txt"
			String line = in.readLine();
			String[] tokens = line.split(",");//代號以，作分類
			int count = Integer.parseInt(tokens[0]);//3項飲料
			for (int i = 0; i < count; i++) {
				
				String name = tokens[i * 2 + 1];//基數項為名稱
				int price = Integer.parseInt(tokens[i * 2 + 2]);//偶數項為價錢
				vm.drinks.add(new Drink(i + 1, name, price));
			}
			vm.on();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
