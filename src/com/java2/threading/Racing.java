package com.java2.threading;


import java.util.List;
import java.util.ArrayList;

public class Racing {

	public static void main(String[] args) {
		List<Horse> list = new ArrayList<>();
		Horse h1 = new Horse(list);
		h1.start();
		Horse h2 = new Horse(list);
		h2.start();
		Horse h3 = new Horse(list);
		h3.start();
		try{
		h1.join();
		h2.join();
		h3.join();
		}
	
	catch (InterruptedException e) {
	e.printStackTrace();
		}
		System.out.println("main ended");
		//Horse h2 = new Horse();
		//h2.start();
		/*HorseRunable h2 = new HorseRunable();
		Thread thr = new Thread(h2);
		thr.start();
		try{
			h1.join();
			thr.join();
		}
			catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main ended");*/
		/*List<Horse> horses = new ArrayList<>();//多匹馬用Arraylist
		for(int i=0;i<=8;i++){
			Horse h = new Horse();
			horses.add(h);
			h.start();*/
		}
	}


