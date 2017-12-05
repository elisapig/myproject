package com.elisa.oo;

public class Tester {

	public static void main(String[] args) {
		Student stu =new Student("¤ı¤p©ú",65,40,85);
		//stu.english = 65;
		//stu.math = 40;
		//stu.chinese = 85;
		stu.print();
		int avg =stu.getAverage();
		System.out.println(stu.name+":"+avg);

	}
}