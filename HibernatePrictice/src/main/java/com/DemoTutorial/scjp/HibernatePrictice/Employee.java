package com.DemoTutorial.scjp.HibernatePrictice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="Emp_Collection")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="EmpID")
	int empID;
	@Column(name="EmpNAME",nullable=false,length=50)
	String empName;
	@Column(name="EmpSALARY")
	double empSalary;
	 @ElementCollection
     private Collection<Address> lisOfAddresses = new ArrayList<Address>();
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public Collection<Address> getLisOfAddresses() {
		return lisOfAddresses;
	}
	public void setLisOfAddresses(Collection<Address> lisOfAddresses) {
		this.lisOfAddresses = lisOfAddresses;
	}
	@Override
	public String toString() {
		final int maxLen = 10;
		return "\nEmployee [empID="
				+ empID
				+ ", empName="
				+ empName
				+ ", empSalary="
				+ empSalary
				+ ", lisOfAddresses="
				+ (lisOfAddresses != null ? toString(lisOfAddresses, maxLen)
						: null) + "]";
	}
	private String toString(Collection<?> collection, int maxLen) {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		int i = 0;
		for (Iterator<?> iterator = collection.iterator(); iterator.hasNext()
				&& i < maxLen; i++) {
			if (i > 0)
				builder.append(", ");
			builder.append(iterator.next());
		}
		builder.append("]");
		return builder.toString();
	}
	public Employee(int empID, String empName, double empSalary,
			Collection<Address> lisOfAddresses) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empSalary = empSalary;
		this.lisOfAddresses = lisOfAddresses;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
}






/***************** Value Type and Embedded Objects Example ****************/
/*@Entity
@Table(name="EmployeeAddress")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="EmpID")
	int empID;
	@Column(name="EmpNAME",nullable=false,length=50)
	String empName;
	@Column(name="EmpSALARY")
	double empSalary;
	 @Embedded
	Address address;
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName
				+ ", empSalary=" + empSalary + ", address=" + address + "]";
	}
	public Employee(int empID, String empName, double empSalary, Address address) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empSalary = empSalary;
		this.address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
 */
/***************** Value Type and Embedded Objects Example ****************/