package com.elisa;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
     System.out.println("�п�J�A���W�r:");
     Scanner scanner = new Scanner(System.in);
     String line = scanner.nextLine();
     System.out.println("Hello," + line);

     System.out.println("�A�X���O?");
     line = scanner.nextLine();
     int age = Integer.parseInt(line);
     System.out.println(age);
     System.out.println(age > 25);
     
System.out.println("Hello World");
Person p = new Person();
p.sayHello();
	}

}
