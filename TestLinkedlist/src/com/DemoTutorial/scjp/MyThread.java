package com.DemoTutorial.scjp;
public class MyThread extends Thread{
	/*public void run()
	{
		System.out.println("Thread Task  A+B= "+(2+3));
	}*/
	public void start()
	{
		super.start();
		System.out.println("Start Method");
	}
	
	public void run(int i)
	{
		System.out.println("Overloaded run");
	}
}