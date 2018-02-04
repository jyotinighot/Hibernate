package com.DemoTutorial.scjp;
import java.util.*;
public class DemoTreeSet1 {

	public static void main(String[] args) {
		Employee1 e1 = new Employee1(1, "A", 1000, 32);
		Employee1 e2 = new Employee1(2, "AB", 1300, 22);
		Employee1 e3 = new Employee1(3, "B", 10, 42);
		Employee1 e4 = new Employee1(4, "CD", 100, 23);
		Employee1 e5 = new Employee1(5, "AAA", 1200, 26);
		
		TreeSet<Employee1> t1=new TreeSet<Employee1>(new Emp_Salary()); 
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println("Use Comparator Sorting Employee Database According to Employee Salary");
		System.out.println(t1);
		TreeSet<Employee1> t2=new TreeSet<Employee1>(new Emp_Name()); 
		t2.add(e1);
		t2.add(e2);
		t2.add(e3);
		t2.add(e4);
		t2.add(e5);
		System.out.println("\nUse of Comparator Sorting Employee Database According to Employee Name");
		System.out.println(t2);
		
		Comparator<Employee1> ageCompare1 = new Comparator<Employee1>() {
			@Override
			public int compare(Employee1 o1, Employee1 o2) {
				return (o1.age-o2.age);
			}
		};
		
		TreeSet<Employee1> t3=new TreeSet<Employee1>(ageCompare1); 
		t3.add(e1);
		t3.add(e2);
		t3.add(e3);
		t3.add(e4);
		t3.add(e5);
		System.out.println("\nAnonymous Class  Sorting Employee Database According to Employee Age");
		System.out.println(t3);
		
	}
	
}

class Emp_Salary implements Comparator<Employee1>{
		public int compare(Employee1 e1, Employee1 e2) {
			if(e1.getSalary()>e2.getSalary()){
				return 1;
			}
			else if(e1.getSalary()<e2.getSalary()){
				return -1;
			}
			else{
				return 0;
			}
		}
	}
	
	class Emp_Name implements Comparator<Employee1>
	{
		public int compare(Employee1 e1, Employee1 e2) {
			return e1.getName().compareTo(e2.getName());
		}
	}

 class Employee1{
	 int id;
	 String name;
	 int salary;
	 int age;
    
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Employee1(int id, String name, int salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	
	}
	@Override
	public String toString() {
		return "\n Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age  + "]";
	}
    
    
 }

