package com.java2.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SimpleWriteTest {

	public static void main(String[] args) throws FileNotFoundException  {
			PrintStream out;
		
				
					out = new PrintStream("data.txt");
				
			
		
		out.print("Tzu Yu\t19\t0206");// \t �Ť@��
		out.flush();				  //�T�{�w�İϤ�����ưe�X�h
		out.close();			      //������Ƨ�
	}

}
