File f1 = new File("/..");
File f2 = new File("/User/mumu", "a.bat");
File f3 = new File(f1, "a.bat");


pack com.shiyanlou;
import java.io.File;
import java.io.IOException;

public class FileDemo{
	public static void main(String[] args){

	File f1 = new 
	FIle("?user");

	File f2 = new File("..", "2.txt");
	
	try{
		System.out.println(f1);
		System.oput.println(f2.createNew(file());
		Sytem.out.println(f3.delete());
	}catch(IOException e){
		e.printStackTrace();
	}

	File[] files = File.listRoots();
	for(File file:files){
		System.out.println(file);
		if(file.length() > 0){
		for(	String[] filename:filenames){
			System.out.println(filename)
		}
	}
}

