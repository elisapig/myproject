package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

public class Bingo{
	FileReader fr;
	BufferedReader br;
	ArrayList<Integer> ushs,bgo;
	//使用者選中的賓果號碼,整張賓果卡
	Random rm = new Random();
	int ary,chsd,chsdval,tmp;
	//將讀取的第一行轉進int,被選擇交換的矩陣元素編號,被選擇交換的矩陣元素數值,暫存編號i數值
	try {
		fr = new FileReader("bingo.txt");
		br = new BufferedReader(fr);
		ary =Integer.parseInt(br.readLine());
		System.out.println(ary);
		
		String[] usrchs = br.readLine().split(",");
		ArrayList<Integer> uchs = new ArrayList<Integer>();
		for(int i=0;i<usrchs.length;i++) {
			uchs.add(Integer.parseInt(usrchs[i]));
			
			
		}
		System.out.println(uchs);
		//int bgo[] = new int[]{};
	}
	
}
