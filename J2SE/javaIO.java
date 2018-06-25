package com.shiyanlou;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class test{

	public void copy(InputStream in, OutputStream out) throws IOException{
		byte[] buf = new byte[4086];
		int len = in.read(buf)
		
		while (len != -1){
			out.write(buf, 0, len);
			len = in.read(buf);
		}
	}

	public static void main(String[] args) throws IOException
	{
		test t = new test();
		System.out.prinln("input character");
		t.copy(System.in, System.out);
	}

package com.shiyanlou;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundExcetpion;
import java.io.IOException;

public class test{
	public static void main(String[] args){
		try{
			File inFile = new File("/Users/mumutongxue/");
			File outFile = new File("file2.txt");
			FileInputStream fis = new FileInputStream(inFile);
			FileOutputStream fos = new FileOutputStream(outFile);

			int c;
			while((c = fis.read()) != -1){
				fos.write(c);
			}
			fis.close();
			fos.close();
		}catch(FileNotFoundException e){
			Sytem.out.println("FileStreamsTest" + e);
		}catch(IOException e){
			System.err.println("FileStreamTest" + e);	
		}
	}
}

FileInputStream in = new FileInputStream("file.txt");
FileOutPutStream out = new FileOutPutStream("file2.txt");

BufferedInputStream bin = new BufferedInputStream(in, 256);
BufferedOutputStream bout = new BufferedOutPustStream(out, 256)

int len;
byte bArra[] = new byte[256];
len = bin.read(bArray);


public void copy(InputStream in, OutputStream out) throws IOException{
	out = new BufferedOutputStream(out, 4096);
	byte[] buf = new byte[4096];
	int len = in.read(buf);
	while (len != -1){
		out.write(buf, 0, len);
		len = in.read(buf);
	}
	out.flush();
}



	
