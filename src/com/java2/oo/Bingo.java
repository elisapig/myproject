package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

public class Bingo{
	FileReader fr;
	BufferedReader br;
	ArrayList<Integer> ushs,bgo;
	//�ϥΪ̿襤�����G���X,��i���G�d
	Random rm = new Random();
	int ary,chsd,chsdval,tmp;
	//�NŪ�����Ĥ@����iint,�Q��ܥ洫���x�}�����s��,�Q��ܥ洫���x�}�����ƭ�,�Ȧs�s��i�ƭ�
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
