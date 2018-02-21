package com.DemoTutorial.scjp.HibernatePrictice;

import javax.persistence.Column;
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

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestEmpWithHibernate {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		SessionFactory sf=cfg.configure().buildSessionFactory();
		Session session=sf.openSession();

		//session.close();
		Scanner in=new Scanner(System.in);
		int ch=0;int n=0;
		Employee1 e=new Employee1();
		while(ch!=6){
			System.out.println("\n1:Insert\n2:Display ALL\n3:Display Specific \n4:Update\n5:Delete");
			System.out.println("Enter You Choice");
			ch=in.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("How many records to insert");
				n=in.nextInt();

				Transaction tr= session.beginTransaction();
				for(int i=0;i<n;i++){
					//e=null;
					System.out.println("Enter the Details of Employee1" + (i+1));
					//e.setEmpID(10);
					System.out.println("Enter Employee1 name ");
					e.setEmpName(in.next());
					//System.out.println(e.empName);
					System.out.println("Enter Employee1 Salary ");
					e.setEmpSalary(in.nextDouble());
					System.out.println("Enter Employee1 city ");
					e.setEmpCity(in.next());
					session.save(e);
				}
				tr.commit();
				session.flush();
				//	session.close();
				break;
			case 2:
				//	Session session1=sf.openSession();
				Transaction tr1= session.beginTransaction();
				Query query = session.createQuery("from Employee1");
				List<Employee1> list = query.list();
				System.out.println("\tEmpID\tEmp Name\t\tEmpSalary\t\tEmpCity");
				for (Employee1 Employee1 : list) {
					System.out.println("\t"+Employee1.empID+"\t\t"+Employee1.empName+"\t\t"+Employee1.empSalary+"\t\t"+Employee1.empCity);
				}
				tr1.commit();
				session.flush();
				//	session1.close();
				break;
			case 3:
				Transaction tr11= session.beginTransaction();
				System.out.println("Enter Employee1 id ");
				n=in.nextInt();
				Employee1 e1=(Employee1)session.get(Employee1.class,n);
				if(null==e1)
				{
					System.out.println("Not Found ");
				}
				else System.out.println(e1);
				tr11.commit();
				session.flush();
				break;
			case 4:
				Transaction tr31= session.beginTransaction();
				System.out.println("Enter Employee1 id ");
				n=in.nextInt();
				Employee1 e11=(Employee1)session.get(Employee1.class,n);
				if(null==e11)
				{
					System.out.println("Not Found "+e);
				}
				else {
					System.out.println(e11);
					System.out.println("Enter Employee1 name ");
					e11.setEmpName(in.next());
					//System.out.println(e.empName);
					System.out.println("Enter Employee1 Salary ");
					e11.setEmpSalary(in.nextDouble());
					System.out.println("Enter Employee1 city ");
					e11.setEmpCity(in.next());
					session.update(e11);
				}
				tr31.commit();
				session.flush();
				break;
			case 5:
				Transaction tr21= session.beginTransaction();
				System.out.println("Enter Employee1 id ");
				n=in.nextInt();
				Employee1 e21=(Employee1)session.get(Employee1.class,n);
				if(null==e21)
				{
					System.out.println("Not Found "+e21);
				}
				else System.out.println(e21);
				session.delete(e21);
				tr21.commit();
				session.flush();
			case 6: 
				System.exit(0);
			}
		}
	}

}


@Entity
@Table(name="Employee1DATA")
class Employee1 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="EmpID")
	int empID;
	@Column(name="EmpNAME",nullable=false,length=50)
	String empName;
	@Column(name="EmpSALARY")
	double empSalary;
	@Column(name="EmpCITY")
	String empCity;
	
	@Override
	public String toString() {
		return "Employee1 [empID=" + empID + ", empName=" + empName
				+ ", empSalary=" + empSalary + ", empCity=" + empCity + "]";
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

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee1(int empID, String empName, double empSalary, String empCity) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empCity = empCity;
	}
	
	
}
