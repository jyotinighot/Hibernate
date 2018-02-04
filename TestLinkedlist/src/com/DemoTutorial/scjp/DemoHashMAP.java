package com.DemoTutorial.scjp;

import java.util.*;
import java.util.Map.Entry;
import java.util.Set;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class DemoHashMAP {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap=new HashMap<>();
		System.out.println("First hash map Insertion");
		System.out.println(hmap.put(61, "A"));
		System.out.println(hmap.put(null,"A"));
		System.out.println(hmap.put(null,"B"));
		System.out.println(hmap.put(20,null));
		System.out.println(hmap.put(3,"X"));
		System.out.println(hmap.put(3,"Z"));
		System.out.println(hmap.put(4,"C"));
		/*Set set = hmap.keySet();
		System.out.println("Using Keyset Iterator");
		Iterator itr= set.iterator();
				while(itr.hasNext())
				{
					Integer i=(Integer)itr.next();

					System.out.println("Value of "+i + "  is " + hmap.get(i));
				}
				System.out.println("is Empty Demo");
		if(!hmap.isEmpty()){
			System.out.println("Value of 1 : " + hmap.get(1));
			System.out.println("Value of 3 : " + hmap.get(3));
		}
		System.out.println("size of hmap is "+hmap.size());*/

		HashMap<Integer, String> hmap1=new HashMap(hmap);
		System.out.println("Second hash map Insertion");
		System.out.println(hmap1.put(4,"D"));
		System.out.println(hmap.put(5,"R"));
		System.out.println("Hashmap Display usin hmap.keyset()");
		System.out.println("size of hmap1 is "+hmap1.size());System.out.println();
		
		System.out.println(" Iterator Using keyset() method");
		System.out.println();
		Set<Integer> set1 = hmap.keySet();
		Iterator itr1= set1.iterator();
		while(itr1.hasNext())
		{
			Integer i=(Integer)itr1.next();

			System.out.println("Value of "+i + "  is " + hmap1.get(i));
		}
		System.out.println();
		System.out.println(" Iterator Using Entyset() method ");
		System.out.println();
		Set<Entry<Integer, String>> eSet=hmap1.entrySet();
		Iterator itr2= eSet.iterator();
		while(itr2.hasNext())
		{
			Entry<Integer, String> entry=(Entry<Integer, String>) itr2.next();
			System.out.print("Key=   "+entry.getKey());
			System.out.println("   Value=   "+entry.getValue());
		}
		System.out.println();
		System.out.println("Iterator Using values() method ");
		System.out.println();
		Collection<String> cValues=hmap1.values();
		Iterator itr3= cValues.iterator();
		while(itr3.hasNext())
		{
			String s=(String)itr3.next();
			System.out.println(s);
		}
		System.out.println("\n\nEmployee Database HasHMAP DEMO");
		HashMap<Employee, String> hmap22=new HashMap();
		Employee e1=new Employee(101, "ABC", 15000);
		Employee e2=new Employee(102, "ABC1", 25000);
		Employee e3=new Employee(103, "ABC1", 35000);
		Employee e4=new Employee(101, "ABC", 15000);
		System.out.println(hmap22.put(e1,"Jyoti"));
		System.out.println(hmap22.put(e2,"Rohini"));
		System.out.println(hmap22.put(e3,"Yogita"));
		System.out.println(hmap22.put(e4,"Jyoti"));
		System.out.println(" \n\nIterator Using keyset() method");
		System.out.println();
		Set<Employee> set2 = hmap22.keySet();
		Iterator itr22= set2.iterator();
		while(itr22.hasNext())
		{
			Employee e=(Employee)itr22.next();

			System.out.println("Value of "+e + "  is " + hmap22.get(e));
		}
		
		System.out.println(" \n\nIterator Using Entyset() method ");
		System.out.println();
		Set<Entry<Employee, String>> empSet=hmap22.entrySet();
		Iterator empitr=empSet.iterator();
		while(empitr.hasNext())
		{
			Entry<Employee, String> e=(Entry<Employee, String>)empitr.next();
			System.out.print("Key=   "+e.getKey());
			System.out.println("   Value=   "+e.getValue());
		}
		
		System.out.println();
		System.out.println("Iterator Using values() method ");
		System.out.println();
		
		Collection<String> cValues1=hmap22.values();
		Iterator itr33= cValues1.iterator();
		while(itr33.hasNext())
		{
			String s=(String)itr33.next();
			for(Object o : hmap22.keySet())
			{
				if(hmap22.get(o).equals(s))
				{
					System.out.println(o+ " is the  key for value "+ s);
					break;
				}
				
			}
		
		}
		
		
		

	}

}	
