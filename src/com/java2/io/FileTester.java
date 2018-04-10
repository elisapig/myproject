package com.java2.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTester {

	public static void main(String[] args) {
		try{//一個try可以有1或2個catch
			FileOutputStream out = new FileOutputStream("data.txt");
			out.write(65);
			out.write(66);
			out.write(67);
			out.flush();
			out.close();
		}catch(FileNotFoundException e){			//若偵測到FileNotFoundException
			System.out.println("File Not Found");	//就跳到此行
		}catch(IOException e){						//若偵測到IOException
			System.out.println("File Output Error");//就跳到此行
		}											//兩者之外
													//跳出去執行
	}
	

}
