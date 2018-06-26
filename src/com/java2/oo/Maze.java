package com.java2.oo;

public class Maze {
	int col;
	int row;
	int trouble;
	int[] location;
	int hp;
	public Maze(int col, int row, int trouble) {
		super();
		this.col = col;
		this.row = row;
		this.trouble = trouble;
		
	}
	public void setLocation(int[] location) {
		
		this.location = location;
	}
	public int getCol() {
		return col;
	}
	public void setColg(int col) {
		this.col = col;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int[] getLocation() {
		return location;
	}
	
	
}
