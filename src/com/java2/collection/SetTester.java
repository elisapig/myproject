package com.java2.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SetTester {

	public static void main(String[] args) {
		 SortedSet<String> set= new TreeSet<>();
		 set.add("Alpha");
		 set.add("Gamma");
		 set.add("Omega");
		System.out.println(set);
	}

}
