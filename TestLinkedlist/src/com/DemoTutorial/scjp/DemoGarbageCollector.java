package com.DemoTutorial.scjp;
import java.util.Date;
public class DemoGarbageCollector {

	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println("Free Memory  " +r.freeMemory());
		for (int i = 0; i <800000; i++) {
			Date D=new Date();
			D=null;
		}
		System.out.println("Total Memory  "+r.totalMemory());
		System.out.println("Free Memory  " +r.freeMemory());
		r.gc();
		System.out.println("Free Memory  " +r.freeMemory());
		TestGC t=new TestGC();
		t.S="JUYI";
		t.finalize();
		t=null;
		System.gc();
		
	}

}
class TestGC
{
String S="Jyoti";
public void finalize()
{
	System.out.println("TestGC Class Finalize Method  ");
}

}