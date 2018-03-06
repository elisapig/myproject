package com.java2.object;

public class Customer  {
	int burger;
	int cola;
	int milk;
	float discount =0.05f;
	public Customer(int amount){
		this.burger =amount;
	}
	public void print(){
		int total = (int)((burger+cola+milk)*(1-discount));
		System.out.println(burger+"\t"+total);
		}
	public Customer(){
		
	}
}
