package com.java2.collection;

import java.util.SortedSet;
import java.util.TreeSet;
//tree set �����ƨ̤j�p�Ƨ�
//Hash set �����Ƥ������� is faster than free set
//ArrayList
//LinkList
public class SetTester {

	public static void main(String[] args) {
		 SortedSet<String> set= new TreeSet<>();
		 set.add("Alpha");
		 set.add("Gamma");
		 set.add("Omega");
		System.out.println(set);
	}
 //Sample Input:
 //6
 //postgres
 //sqlite
 //oracle
 //mongodb
 //postgres
 //mssql
	SortedSet<String> set= new TreeSet<>(Array.asList("6","postgres","sqlite","oracle","mongodb","postgres","mssql"));
	 
