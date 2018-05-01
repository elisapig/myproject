package com.java2.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Tester {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(1);
		System.out.println(list);
		Set<Integer> set = new HashSet<>();  //set 印出來不會重覆
		set.add(1);
		set.add(4);
		set.add(3);
		set.add(1);
		System.out.println(set);
		Set<String> set2 = new HashSet<>();
		set2.add("Elisa");
		set2.add("BearQ");
		set2.add("Star");
		set2.add("Elisa");
		System.out.println(set2);
		Map<String, String> stocks =new TreeMap<>(); //會按照順序排
		stocks.put("0206","Elisa");
		stocks.put("0501","Star");
		stocks.put("0201","BearQ");
		System.out.println(stocks);
		
		}	

}
