package com.DemoTutorial.scjp;
import java.io.Serializable;
import java.util.*;
public class DemoListCollectionSort {
	public static void main(String[] args)
	{
			System.out.println("Hello");
			List a1=new ArrayList();
			LinkedList l1=new LinkedList();
		/*	System.out.println(a1 instanceof Serializable);
			System.out.println(a1 instanceof Cloneable);
			
			System.out.println(l1 instanceof Serializable);
			System.out.println(l1 instanceof Cloneable);*/
			/*a1.add("JUI");
			a1.add("JYOTI");
			a1.add("MININATH");
			System.out.println("Array List Elements are\n");
			System.out.println(a1.get(2));
			System.out.println("\t"+a1);
			a1.remove(1);
			Iterator itr= a1.iterator();
			a1.removeAll(a1);
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			List a2=new LinkedList();
			a2.add("JUI");
			a2.add("JYOTI");
			a2.add("MININATH");
			System.out.println("Linked List Elements are\n");
			System.out.println("\t"+a2);
			System.out.println("Student Database");*/
			StudentData1 s1=new StudentData1(1, "aaAAAaa",84);
			StudentData1 s2=new StudentData1(2,"BBB",66);
			StudentData1 s3= new StudentData1(3, "ACCC", 45);
			StudentData1 s4= new StudentData1(4, "9ACCC", 78);
			StudentData1 s5= new StudentData1(5, "eACCC", 59);
			StudentData1 s6= new StudentData1(6, "ACCC", 64);
			StudentData1 s7= new StudentData1(7, "xxxACCC", 74);
			StudentData1 s8=s7;
			ArrayList<StudentData1> a3=new ArrayList<StudentData1>();
			//System.out.println("\t"+a3);
			a3.add(s1);
			a3.add(s2);
			a3.add(s3);
			a3.add(s4);
			a3.add(s5);
			a3.add(s2);
			a3.add(s6);
			a3.add(s7);
			a3.add(s8);
			
			System.out.println(a3);
			Collections.sort(a3);
			System.out.println(a3);
			System.out.println(a3.size());
	}
}

class StudentData1 implements Comparable<StudentData1>
{
	int RollNo;
	String name;
	int res;
	
	public StudentData1(int rollNo, String name, int res) {
		super();
		RollNo = rollNo;
		this.name = name;
		this.res = res;
	}

	@Override
	public String toString() {
		return "\nStudentData1 [RollNo=" + RollNo + ", name=" + name + ", res="
				+ res + "]";
	}
	
	 public int compareTo(StudentData1 st)
	 {
		 return this.name.compareTo(st.name);
	 }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + RollNo;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + res;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentData1 other = (StudentData1) obj;
		if (RollNo != other.RollNo)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (res != other.res)
			return false;
		return true;
	}
	 
}








