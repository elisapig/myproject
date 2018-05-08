package com.java2.collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MainList {

	public static void main(String[] args) {
		  List<String> nameList = new ArrayList()<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));

		    for(String name:nameList){
		    	System.out.println(name);
		    }
		    List nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));


		    String[] strArray = nameList.toArray(new String[0]);


		    for (int i = 0; i < strArray.length; i++) {
		      System.out.println(strArray[i]);
		    }
	}

}
