package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			String[] tokens =line.split(",");
			int col=Integer.parseInt(tokens[0]);
			int row=Integer.parseInt(tokens[1]);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
	}

	public class Maze {
		int row, col;
		int trapCount;
		int[] traps;
		int[] positions;
		Player player;
	
		public Maze(int col, int row, int trapCount) {
			this.col = col;
			this.row = row;
			this.trapCount = trapCount;
		}
	}

	class Player {
		int hp = 100;
		int pos = 0;

	}
}
