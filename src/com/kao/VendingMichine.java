package com.kao;

import java.util.Scanner;

public class VendingMichine {

	public static void main(String[] args) {
	Drink d1 =new Drink("a", 15);
	Drink d2 =new Drink("b", 20);
	Drink d3 =new Drink("c", 30);
	/*如果很多項 要用陣列比較快
	 * Drink[] drinks =new Drink[10]; 有10項
	  drinks[0] = new Drink("a",15);
	  drinks[1] = new Drink("b",20);
	  drinks[2] = new Drink("c",30);
	*/	
	System.out.println("請投幣或選擇飲料");
	Scanner scanner =new Scanner(System.in);
	String line = scanner.nextLine();
	int sum = Integer.parseInt(line);
	System.out.println("販賣機餘額"+":"+sum);
	
	
	
	}
}
