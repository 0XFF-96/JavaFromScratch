package com.shiyanlou.course;

public class CreateThread{

	public static void main(String[] args)
	{
		Thread1 thread1 = new Thread1();
		Thread thread2 = new Thread(new Thread2());
		
		thread1.start();
		thread2.start();
	}
}

class Thread1 extends Thread
{
	public void run()
	{

		for (int i = 0; i < 100; ++i)
		{
			System.out.println("Hello this is " + i);
		}
	}
}

class Thread2 impl
	public void run()
	{
		for (int i = 0; i < 100; ++i)
		{
			System.out.println("hello! This is " + i);
		}
	}
}

class Thread2 implements Runnable {

	public void run()
	{
		for (int i =0; i < 100; ++i)
		{
			System.out.println("Thanks . There is " + i);
		}
	}
}


// start() sleep() wait()  run()  Terminate .. 


package com.shiyanlou.course

public class ThreadState implements Runnable{
	public synchronized void waitFroAMoment() throws InterruptedException{
		wait(500);
	}

	public synchronized void waitForever() throws InterruptedException{
		wait();
	}

	public synchronized void notifyNow() throws InterruptedException{
		notify();
	}

	public void run(){
	
		try{
			waitForAMoment();
			waitForever();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}


