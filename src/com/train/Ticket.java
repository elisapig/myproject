package com.train;

public class Ticket {
	//2018-01-08,18:30,ªQ¤s,¤K°ô,65
	int amount=65;
	float discount =0.15f;
	public Ticket(int amount){
		this.amount =amount;
	}
	public void print(){
		int ticket =(int)(amount*(1-discount));
		System.out.println(amount +"\t"+ticket);
	}
	
	
	
}
