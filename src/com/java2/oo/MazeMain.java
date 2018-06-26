package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*有一個遊戲場地，長寬由執行當時決定，場地中亂數產生陷阱
 * 陷井數也由當時決定有一個玩家，初始植為100hp，走一步消耗1hp，
 * 撞到牆扣5hp，撞到陷阱*扣20hp
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
