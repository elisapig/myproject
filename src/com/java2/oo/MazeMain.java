package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*���@�ӹC�����a�A���e�Ѱ����ɨM�w�A���a���üƲ��ͳ���
 * �����Ƥ]�ѷ�ɨM�w���@�Ӫ��a�A��l�Ӭ�100hp�A���@�B����1hp�A
 * ������5hp�A���쳴��*��20hp
 */
public class MazeMain {

	public static void main(String[] args) {
		new MazeMain();
		FileReader fr;
		try {
			fr =new FileReader("maze.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			String[] tokens =line.split(",");
			int col=Integer.parseInt(tokens[0]);
			int row=Integer.parseInt(tokens[1]);
			System.out.println(tokens[0]);
			System.out.println(tokens[1]);

			line = br.readLine();
			int trouble = Integer.parseInt(line);
			Maze m = new Maze(col, row, trouble);
		    Random random = new Random();
		    Set<String> set = new TreeSet<>();
		    While (set.size() < trouble);
		    	String trap = String.valueOf(random.nextInt(24));
		    	set.add(trap);
		    
		
		Scanner scanner = new Scanner(System.in);

		int walk = scanner.nextInt();
		int hp=100;
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
	}

	private static void While(boolean b) {
		// TODO Auto-generated method stub
		
	}

	
}
