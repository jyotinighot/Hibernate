package com.DemoTutorial.scjp;

import java.util.*;

class EmployeeDB implements Comparable<EmployeeDB>
{
	int EmpID;
	String EmpName;
	Double EmpSalary;
	
	public EmployeeDB(int empID, String empName, Double empSalary) {
		super();
		EmpID = empID;
		EmpName = empName;
		EmpSalary = empSalary;
	}
	
	
	/*public int compareTo(EmployeeDB o) {
		if(this.EmpID > o.EmpID) 
				return 1;
		else if(this.EmpID < o.EmpID)
				return -1;
		else
			return 0;
	}*/
	
/*
	public int getEmpID() {
		return EmpID;
	}


	public void setEmpID(int empID) {
		EmpID = empID;
	}


	public String getEmpName() {
		return EmpName;
	}


	public void setEmpName(String empName) {
		EmpName = empName;
	}


	public Double getEmpSalary() {
		return EmpSalary;
	}


	public void setEmpSalary(Double empSalary) {
		EmpSalary = empSalary;
	}

*/
	public int compareTo(EmployeeDB o) {
		//return this.getEmpName().compareTo(o.getEmpName());
		return this.EmpName.compareTo(o.EmpName);
	}
	
	@Override
	public String toString() {
		return "\nEmployeeDB [EmpID=" + EmpID + ", EmpName=" + EmpName + ", EmpSalary=" + EmpSalary + "]";
	}
	}

public class DemoTreeSet  {
	public static void main(String args[]){  
		EmployeeDB e1=new EmployeeDB(48, "Jyoti", 25000.25);
		EmployeeDB e2=new EmployeeDB(102, "Rohini", 25400.56);
		EmployeeDB e3=new EmployeeDB(11, "Aparna", 45000.48);
		EmployeeDB e4=new EmployeeDB(40, "Sushma", 40000.85);
		EmployeeDB e5=new EmployeeDB(21, "Ranjana", 27899.45);
	TreeSet<EmployeeDB> t1=new TreeSet<EmployeeDB>(); 
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
	//t1.
	System.out.println(t1);
	/*t1.add("ABC");
	t1.add("aABB");
	t1.add("aBC");
	t1.add("pqr");
	System.out.println(t1);
	TreeSet<String> t2=new TreeSet<String>(t1); 
	t2.add("Jyoti");
	t2.add("JUI");
	System.out.println(t2);
	TreeSet<String> t3=new TreeSet<String>();
	t3.addAll(t2);
	t3.add("MKN");
	
	System.out.println(t3);
	Iterator itr=t3.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());*/
	
	}
}





/*Employee e1 = new Employee(1, "A", 1000, 32, new Date(2011, 10, 1));
Employee e2 = new Employee(2, "AB", 1300, 22, new Date(2012, 10, 1));
Employee e3 = new Employee(3, "B", 10, 42, new Date(2010, 11, 3));
Employee e4 = new Employee(4, "CD", 100, 23, new Date(2011, 10, 1));
Employee e5 = new Employee(5, "AAA", 1200, 26, new Date(2011, 10, 1));
Read more: http://javarevisited.blogspot.com/2014/01/java-comparator-example-for-custom.html#ixzz55foFHeSt*/




