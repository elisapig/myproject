package com.java2.oo;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class VendingMachine {
	int total = 0;
	List<Drink> drinks = new ArrayList<>();

	public void on() {
		System.out.println("�Ч��.....");
		for (int i = 0; i < drinks.size(); i++) {
			Drink drink = drinks.get(i);//��X����+����
			System.out.println(drink.getId() + "\t" + drink.getName() + "\t" + drink.getPrice());
		}

		Scanner scanner = new Scanner(System.in);
		int data = -1;
		int money =0;
		while (data != 0) {
			data = scanner.nextInt();
			switch (data) {
			case 0:
			break;
			}
		}
	}
}
