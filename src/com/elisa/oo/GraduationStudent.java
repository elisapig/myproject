package com.elisa.oo;

public class GraduationStudent extends Student {
	int thesis;

	public GraduationStudent() {
		super();
		System.out.println("hahaha");
	}

	@Override//�Ƽg�����O�A�Ƽg��d��i�H��j�����i�Y�p
	public void print() {
		super.print();//super�I�s�����O���غc�l 
		System.out.println(pass);
		System.out.println(english + "\t" + math + "\t" + chinese + "\t" + thesis);
	}
	@Override
	public int getAverage(){
		return(english+math+chinese+thesis)/4;
	}
}

