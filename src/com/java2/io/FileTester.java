package com.java2.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTester {

	public static void main(String[] args) {
		try{//�@��try�i�H��1��2��catch
			FileOutputStream out = new FileOutputStream("data.txt");
			out.write(65);
			out.write(66);
			out.write(67);
			out.flush();
			out.close();
		}catch(FileNotFoundException e){			//�Y������FileNotFoundException
			System.out.println("File Not Found");	//�N���즹��
		}catch(IOException e){						//�Y������IOException
			System.out.println("File Output Error");//�N���즹��
		}											//��̤��~
													//���X�h����
	}
	

}
