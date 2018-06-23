// Throwable , object ...
// ArithmeticException , 
// ArrayIndexOutOfBoundsException ..
// NullPointerException ...

package com.shiyanlou.course;

public class NullPointerExceptionTest{
	public static void main(String[] args){
		String s = null;
		
		System.out.println(s.toUpperCase());
	}
}


package com.shiyanlou.course;
public clas MyAriException extends ArithmeticException{

	public MyAriException(){

	}

	public MyAriExcetpion(String msg){

		super(msg);
	}
}

package com.shiyanlou.course;

import java.util.Arrays

public class ExceptionTest{
	public static void main(String[] args){
		int [] array = new int[5];

		Arrays.fill(array, 5);

		for (inti = 4; i > -1;i--){
			if( i == 0){
				
				throw new MyAriException("there is an exception occured.");
			}
			System.out.println("array[" + i + "..");
		}
	}
}


package com.shiyanlou.course;

public class CatchException{
	public static vovid main(String[] args){
		try{
			System.out.prinln("I am try block.");
			Class<?> tempclass  =class.forName("");
			System.oput.println("Bye !Try block.");
		}catch (ClassNotFoundException e){
			System.our.println("I am catch block.");
			e.printStackTrace();
			System.out.println("Goodby ! Catch block");
		}finally {
			System.out.println("I am finally block.");
		}
	}
}



