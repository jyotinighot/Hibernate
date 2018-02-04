package com.DemoTutorial.scjp;

public class Employee {
	int empID;
	String empName;
	double salary;
	public Employee(int empID, String empName, double salary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
	}
	/*public boolean equals(Employee e){
		if((this.empID==e.empID) &&  (this.empName==e.empName) && (this.salary==e.salary))
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}*/
	@Override
	public String toString() {
		return "\nEmployee [empID=" + empID + ", empName=" + empName
				+ ", salary=" + salary + "]";
	}

	

}