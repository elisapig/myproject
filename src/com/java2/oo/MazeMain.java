package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
