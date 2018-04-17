package com.java2.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SimpleWriteTest {

	public static void main(String[] args) throws FileNotFoundException  {
			PrintStream out;
		
				
					out = new PrintStream("data.txt");
				
			
		
		out.print("Tzu Yu\t19\t0206");// \t 空一格
		out.flush();				  //確認緩衝區內的資料送出去
		out.close();			      //關閉資料夾
	}

}
