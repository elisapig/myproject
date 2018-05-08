package com.java2.collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainList2 {

	public static void main(String[] args) {

		 
		  List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		  
		    list.remove(0);
		    list.remove(1);
		    list.remove(2);
		    list.remove(3);
		    System.out.print(list.get(2)+" ");
		    System.out.print(list.get(1)+" ");
		    System.out.print(list.get(0)+" ");
		

	}

}
