package com.DemoTutorial.scjp;
public class DemoThread {
	public static void main(String[] args) {

			MyThread t1= new MyThread();
		//	System.out.println("Main Thread");
			t1.start();
			System.out.println("Main Thread");
			t1.run(2);
	}

}


