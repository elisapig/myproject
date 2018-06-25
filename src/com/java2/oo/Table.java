package com.java2.oo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Table {
	int table;
	int number;
	List<Integer> answers;
	List<Integer> numbers = new ArrayList<>();

	public Table(int table, int number, List<Integer> answers) {
		this.table = table;
		this.number = number;
		this.answers = answers;
	}

	public void print() {
		for (int i = 1; i <= number; i++) {
			numbers.add(i);
		}
		Collections.shuffle(numbers);
		int[][] finaltable = new int[table][table];
		for (int i = 0; i < table; i++) {
			for (int j = 0; j < table; j++) {
				finaltable[i][j] = numbers.get(i * table + j);
				if (finaltable[i][j] > 9) {
					System.out.print(finaltable[i][j] + " ");
				} else {
					System.out.print(" " + finaltable[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	public int getTable() {
		return table;
	}

	public void setTable(int table) {
		this.table = table;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public List<Integer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Integer> answers) {
		this.answers = answers;
	}

	public List<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}
	public void bingo() {
		int rowbingo ;
		int row = 0;
		int colbingo ;
		int col = 0;
		int linebingo ;
		int line = 0;
		int[][] finaltable = new int[table][table];
		
		//��
		for (int i = 0; i < table; i++) {
			for (int j = 0; j < table; j++) {
				finaltable[i][j] = numbers.get(i * table + j);
			}
		}
		
		//�P�_�
		for (int ri = 0; ri < table; ri++) {
			rowbingo = 0;
			for (int rj = 0; rj < table; rj++) {
				for (int rp = 0; rp < answers.size(); rp++) {
					if (finaltable[ri][rj] == answers.get(rp)) {
						rowbingo++;
					}
				}
			}
			if(rowbingo==5) {
				row++;
			}
		}
		System.out.println("��u�G"+row+"��");
		//�P�_����
		for (int ci = 0; ci < table; ci++) {
			colbingo = 0;
			for (int cj = 0; cj < table; cj++) {
				for (int cp = 0; cp < answers.size(); cp++) {
					if (finaltable[cj][ci] == answers.get(cp)) {
						colbingo++;
					}
				}
			}
			if(colbingo==5) {
				col++;
			}
		}
		System.out.println("���u�G"+col+"��");
		//�P�_�׽u��(���W��k�U)
		linebingo = 0;
		for (int si1 = 0; si1 < table; si1++) {
				for (int sp1 = 0; sp1 < answers.size(); sp1++) {
					if (finaltable[si1][si1] == answers.get(sp1)) {
						linebingo++;
					}
				}
			if(linebingo==5) {
				line+=1;
			}
		}
		//�P�_�׽u��(�k�W�쥪�U)
		linebingo = 0;
		for (int si2 = 0; si2 < table; si2++) {
				for (int sp2 = 0; sp2 < answers.size(); sp2++) {
					if (finaltable[si2][table-(si2+1)] == answers.get(sp2)) {
						linebingo++;
					}
				}
			if(linebingo==5) {
				line++;
			}
		}
		System.out.println("�׽u�G"+line+"��");
		System.out.println("�@�G"+(row+col+line)+"��");
	}

}
