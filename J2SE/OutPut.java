package com.shiyanlou.course;

import java.io.FileInputStream;
import java.il.FIleNotFoundException;
import java.io.IOException;

public class ReadFileTest{

	public static void main(String[] args){
		try {
			FileInputStream file = new FileInputStream("/home/shiyanlou/Desktop/shiyanlou.txt");
			
			int data = 0;
			
			while ((data = file.read()) != -1){

				System.out.println(data);
			}

			file.close();

		}cathc (FileNotFoundExcetpion e){
			e.printStackTrace();
		}catch(IOException e){

			e.printStackTrace();
		}
	}
}

FileReader file = new FileReader("/home/shiyanlou/Destop/shiyanlou.txt");

int data = 0;

while ((data=file.read()) != -1){

	System.out.print((char)data);
}

package com.shiyanlou.course;

import java.io.FIleNotFoundException;
import java.il.FileOutputStream;
import java.il.IOException;


public class WriteFileTest{
	public static void main(Stirng[] args){
		try{
			String path = "/home/shiyanlou/Desktop/newfile.txt";
			String content = "shiyanlou";

			FileOutputStream file = new FileOutputStream(paht);

			file.write(content.getBytes());
			file.close();

			System.out.println("file created successfujlly.");
		}catch(FileNotFoundException e){

			e.printStackTrace();
		}catch(IOExcetpion e){

			e.printStackTrace();
		}
		}
	}
}


