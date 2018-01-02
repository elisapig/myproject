package com.elisa.oo;

public class GraduationStudent extends Student {
	int thesis;

	public GraduationStudent() {
		super();
		System.out.println("hahaha");
	}

	@Override//複寫父類別，複寫後範圍可以放大但不可縮小
	public void print() {
		super.print();//super呼叫父類別的建構子 
		System.out.println(pass);
		System.out.println(english + "\t" + math + "\t" + chinese + "\t" + thesis);
	}
	@Override
	public int getAverage(){
		return(english+math+chinese+thesis)/4;
	}
}

