package com.DemoTutorial.scjp;
import java.util.*;
public class DemoHashSet {

	public static void main(String[] args) {
		/*HashSet h1=new HashSet();
		//h1.add("100");
		h1.add(10);
		h1.add(20);
	//	h1.add(10);
		HashSet h2=new HashSet();
		h2.add(10);
		h2.add(20);
		System.out.println(h1.equals(h2));
		System.out.println(h1.add(30)==h1.add(30));*/
		Employee e1=new Employee(101, "ABC", 15000);
		Employee e2=new Employee(102, "ABC1", 25000);
		Employee e3=new Employee(103, "ABC1", 35000);
		Employee e4=new Employee(101, "ABC", 15000);
		
		HashSet<Employee> h1=new HashSet<Employee>();
		HashSet<Employee> h2=new HashSet<Employee>();
		System.out.println(h1.add(e1));
		//System.out.println(h1.add(e1));
		//h1.add(e3);
		h1.add(e2);
		//h1.add(e4);
		System.out.println(h1);
		System.out.println(e1.equals(e4));
		//h2.add(e1);
		h2.add(e3);
	//	h2.add(e2);
		h2.add(e4);
		System.out.println(h2);
		System.out.println(h1.equals(h2));
	}

}
