package com.java2.object;

import java.util.ArrayList;
import java.util.List;

public class ListTester {

	public static void main(String[] args) {
		List<Integer> cards =new ArrayList<>();
		cards.add(26);
		cards.add(51);
		cards.add(19);
		cards.set(1,99);
		System.out.println("removing number:"+cards.remove(0));
		System.out.println(cards.size());
		 
		System.out.println(cards);
		
	}

}
