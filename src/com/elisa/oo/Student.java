package com.elisa.oo;

public class Student {//public 只限於同package可用
	
	 int english;//Private 只限於這個版面可用
	protected int math;//屬性 ,protected可給子類別用和同package用
	int chinese;
	String name;
	static int pass =60;//Static類別成員
	
	//建立空建構子
	public Student(){
	}
	
	public Student(String name,int english,int math,int chinese){
		          //instance variable (屬性)
		this.name = name;
		this.english = english;
		this.math = math;
		this.chinese = chinese;
		
		
	}
	public Student(String name){
		this.name = name;
	
	}
	public static void method(){
		System.out.println("Hello");
	}
	public void print(){
	System.out.println(pass);
	System.out.println(english+"\t"+math+"\t"+chinese);
	//沒有回傳值 void
	}
	public int getAverage(){
		return(english+math+chinese)/3;
	//有回傳值 int
	}
}

