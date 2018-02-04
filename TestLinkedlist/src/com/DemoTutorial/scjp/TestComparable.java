package com.DemoTutorial.scjp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {
		Student st1 = new Student(15,"abcdaswc",26,"Pune");
		Student st2 = new Student(102,"Absassscc",30,"Pune");
		Student st3 = new Student(89,"abcsA",80,"Pune");
		Student st4 = new Student(132,"91dashjbc",24,"Pune");
		Student st5 = new Student(132,"91dashjbcc",24,"Pune");
		Student st6 = st2;
		Student st7 = st3;
		
		List<Student> slist = new ArrayList<>();
		slist.add(st1);
		slist.add(st2);
		slist.add(st3);
		slist.add(st4);
		slist.add(st5);
		slist.add(st6);
		slist.add(st7);
      System.out.println(slist.size());
				
		/**
		 * how will you sort emp objects
		 * comparable vs comaprator
		 * return value significance
		 * write down the code for all possible ways
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		System.out.println("Before sorting -- "+slist);
		Collections.sort(slist);
		System.out.println("After sorting -- "+slist);
		
		
		
		System.out.println("Using comparator...");
		

		
		Comparator<Student> ageCompare = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return -(o1.age-o2.age);
			}
		};
		
		
		
		Comparator<Student> nameCompare = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.name.compareTo(o2.name);
			}
		};
		
		
		
		/**
		 * return value
		 * 0   objects are equal
		 * +   left side object is greater
		 * -   left side object is smaller
		 * 
		 * 
		 * Comparable -- 
		 * 			int CompareTo(ob)
		 * 			natural sorting, can have one sequence at a time
		 * 			collection.Sort(list);
		 *
		 *Comparator 
		 *		  int compare(o1,o2)
		 *		  boolean equals(ob1)
		 *		  customize sorting, you can have multiple sorting seq
		 *         Write new comparator type class
		 *         Annonymous implemtation
		 *         
		 * 
		 * employee objects
		 * 
		 * 
		 * 
		 * 
		 */
		
		System.out.println("Age -- Before sorting -- "+slist);
		Collections.sort(slist,ageCompare);
		System.out.println("Age --After sorting -- "+slist);
		
		
		
		
		

		/*System.out.println("name --Before sorting -- "+slist);
		Collections.sort(slist,new NameComparator());
		System.out.println("name --After sorting -- "+slist);
*/
		
	}
	
	
}


class AgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.age-o2.age;
	}
	
}


class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
	
}



class Student implements Comparable<Student>{
	
	
	int id;
	String name;
	int age;
	String address;
	public Student(int id, String name, int age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	@Override
	public String toString() {
		return "\nStudent [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Student other = (Student) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Student stud) {
		return this.name.compareTo(stud.name);
	}
	
	
	
	
	
	
	
}