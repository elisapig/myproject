package com.kao;

import java.util.Scanner;

public class VendingMichine {

	public static void main(String[] args) {
	Drink d1 =new Drink("a", 15);
	Drink d2 =new Drink("b", 20);
	Drink d3 =new Drink("c", 30);
	/*�p�G�ܦh�� �n�ΰ}�C�����
	 * Drink[] drinks =new Drink[10]; ��10��
	  drinks[0] = new Drink("a",15);
	  drinks[1] = new Drink("b",20);
	  drinks[2] = new Drink("c",30);
	*/	
	System.out.println("�Ч���ο�ܶ���");
	Scanner scanner =new Scanner(System.in);
	String line = scanner.nextLine();
	int sum = Integer.parseInt(line);
	System.out.println("�c����l�B"+":"+sum);
	
	
	
	}
}
