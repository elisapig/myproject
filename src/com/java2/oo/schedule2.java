package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class schedule2 {

	public static void main(String[] args) {
		Main m = new Main();
		m.readCourses();
	}
		
		List<Course> courses = new ArrayList<>();
		//public Main() {
			//readcourses();
//		}
		public void readCourses() {
			try {
				FileReader fr = new FileReader("schedule.txt");
				BufferedReader br = new BufferedReader(fr);
				
				while(true) {
					String line;
					Scanner scanner = new Scanner(System.in);
					System.out.println("�п�J�P��(1~7)");
					int w = scanner.nextInt();
					System.out.println("�п�J�ɶ�(0~24)");
					int t = scanner.nextInt();
					for (int i=0; i<5; i++) {
						line = br.readLine();
					    String[] token = line.split(",");
					    String id = token[0];
					    String name = token[1];
					    int weekday = Integer.parseInt(token[2]);
					    int time = Integer.parseInt(token[3]);
					    int duration = Integer.parseInt(token[4]);
					    Course c = new Course(id, name, weekday, time, duration);
					    //�B:&&  ��:||
					    //&&�u�n�e����false�A�N���|�~��p��᭱��	 
					    if(weekday==w) {
					    	if(time<=t && t<=(time+duration)) {
					    		System.out.println("[����:"+"\t"+c.getId()+"\t"+c.getName()+"\t"+"��"+"\t"+(c.getTime()+c.getDuration())+"��"+"]");
					            break;            
					    	}else { 
					    		System.out.println("[���Ű�]");
						    	break;
					    		}
					    	}
					    else { 
					    	
					    }
				}
					System.out.println("");
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


