package com.elisa.oo;

public class Student {//public �u����Ppackage�i��
	
	 int english;//Private �u����o�Ӫ����i��
	protected int math;//�ݩ� ,protected�i���l���O�ΩM�Ppackage��
	int chinese;
	String name;
	static int pass =60;//Static���O����
	
	//�إߪūغc�l
	public Student(){
	}
	
	public Student(String name,int english,int math,int chinese){
		          //instance variable (�ݩ�)
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
	//�S���^�ǭ� void
	}
	public int getAverage(){
		return(english+math+chinese)/3;
	//���^�ǭ� int
	}
}

