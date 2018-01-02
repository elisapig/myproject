package com.elisa.oo;

public class Tester {

	public static void main(String[] args) {
		// Student stu =new Student("王小明",65,40,85);
		Student stu = new Student("王小明");
		 stu.english = 65;
		 stu.math = 40;
		 stu.chinese = 85;
		 stu.pass = 60;
		stu.print();
		int avg = stu.getAverage();
		System.out.println(stu.name + ":" + avg);
		GraduationStudent gstu = new GraduationStudent();
		gstu.english = 65;
		gstu.math = 40;
	    gstu.chinese = 85;
	    gstu.pass = 60;
	    gstu.thesis = 80;
		gstu.print();

	}

}