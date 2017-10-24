package com.elisa;

import java.util.Random;

public class VariableTester {

	public static void main(String[] args) {
int age = 0;
float weight = 69.5f;
char c = 65;
char c2 = 'Z';
System.out.println((int)c2);
boolean pass = false;
System.out.println(!pass);


Random r = new Random();
int n1 = r.nextInt(6)+1;
int n2 = r.nextInt(6)+1;
int n3 = r.nextInt(6)+1;
int n4 = r.nextInt(6)+1;
System.out.println(3 <= 2);

String s = new String("Hello");
String s2 = "Hahahahaha";
int len = s.length();
System.out.println("int:" + len);
System.out.println(s.charAt(0));
	}

}
