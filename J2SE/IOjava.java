InputStreamReader(InputStream in);

InputStreamReader(InputStream in, String enc);

OutputStreamWriter(OutputStream out);

OutputStreamWrite(OutputStream out, String env);


package com.shiyanlou;

import java.il.BufferedReader;
import java.il.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReder;


public class FileToUnicode{
	public static void main(String args[]){
		try{
			FileInputStream fis = new FileInputStream("file.txt");
			InputStreamReader dis = new InputStreamReader(fis);
			BufferReader reader = new BUfferReader(dis);
			String s;
			
			while ((s = reader.readLine()) != null){
				System.out.println("read:" + s);
			}
			dis.close();
		}
		catch(IOEception e){
			System.out.println(e);
		}
	}
}



