package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class VendingMain {

	public static void main(String[] args) {
		
		//Ū����L��J BufferedReader buf  =  new BufferdReader (new InputStreamReader(System.in));
		//readLine() Ū���ɮרC���� �Ǧ^��String �۰ʧR������Ÿ��^���r�|��b�@�_
		VendingMachine vm = new VendingMachine();
		FileReader fr;
		try {
			fr = new FileReader("vending.txt");
			BufferedReader in = new BufferedReader(fr);//Ū��"vending.txt"
			String line = in.readLine();
			String[] tokens = line.split(",");//�N���H�A�@����
			int count = Integer.parseInt(tokens[0]);//3������
			for (int i = 0; i < count; i++) {
				
				String name = tokens[i * 2 + 1];//��ƶ����W��
				int price = Integer.parseInt(tokens[i * 2 + 2]);//���ƶ�������
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
