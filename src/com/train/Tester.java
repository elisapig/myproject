package com.train;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Ticket>ticket =new ArrayList<>();
		ticket.add(new Ticket(65));
		ticket.add(new Ticket(130));
		for(int i=0;i<ticket.size();i++){
		Ticket t =ticket.get(i);
		/*ticket.add("2018-01-08");
		ticket.add("18:30");
		ticket.add("�Q�s");
		ticket.add("�K��");
		ticket.add("65");*/
		Ticket t1 =new Ticket(65);
		t1.print();
		System.out.println("2018-01-08"+"\t"+"18:30"+
		"\t"+"�Q�s"+"\t"+"�K��"+"\t"+ticket);
		
	}
	}
}
