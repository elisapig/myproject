package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

public class Bingo{
	public static void main(String[] args) {
	int ary,chsd,chsdval,tmp;
	
	
	Random rd = new Random();
	FileReader fr;
	BufferedReader br;
	ArrayList<Integer> ushs,bgo;
	//�ϥΪ̿襤�����G���X,��i���G�d

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
		bgo = new ArrayList<Integer>();
		for(int i=1; i<ary+1;i++) {
		bgo.add(i);
	}
	//�~�P
	for(int i=0;i<bgo.size();i++) {
		chsd =rd.nextInt(ary-1);
		chsdval = bgo.get(chsd);
		tmp = bgo.get(i);
		bgo.set(i, chsdval);
		bgo.set(chsd, tmp);
		
		
	}
	for (int i = 0; i < bgo.size(); i++) {
		int n = bgo.get(i);
		if(n<10){
			System.out.print(" ");
		}
		System.out.print(n<10?" ":" ");
		System.out.print(n);
		if((i+1)%5==0){
			System.out.println();
		
	}
	}
	System.out.println(bgo.indexOf(uchs.get(0)));
	String[] ar = br.readLine().split(",");
	}catch(Exception e) {
		System.out.println(e);
	}
	}
	private static int bgo(int index) {

		return 0;

}
}