package com.elisa.sogo;

import java.util.ArrayList;
public class Tester {
	public static void main(String[] args) {
		ArrayList<Customer> customers=new ArrayList<>();
		Customer c1 =new Customer(10000);
		SilverCustomer c2 =new SilverCustomer(10000);
		GoldenCustomer c3 =new GoldenCustomer(10000);
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		//8~13也可以這樣寫
		//customers.add(new Customer(10000));
		//customers.add(new SilverCustomer(10000));
		//customers.add(new GoldenCustomer(10000));
		for(int i=0;i<customers.size();i++){
			Customer c =customers.get(i);
			c.print();
		}
		
		
		
		ArrayList<Integer> list = new ArrayList<>();
		//Integer泛型語法 可直接轉型為整數 
		list.add(10);//0
		list.add(20);//1
		list.add(30);//2
		int n = list.get(0);
		int n1 = list.get(1);
		int n2 = list.get(2);
		System.out.println(list.get(1));
		System.out.println(list.size());//集合中有n個資料
		for(int i = 0; i < list.size();i++){
			System.out.println(list.get(i));
		}
		
		
		/*Customer c1 = new Customer(1000);
		c1.print();
		SilverCustomer c2 = new SilverCustomer(1000);
		c2.print();*/
		
	}
}
