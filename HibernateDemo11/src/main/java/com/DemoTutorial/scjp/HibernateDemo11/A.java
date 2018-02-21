package com.DemoTutorial.scjp.HibernateDemo11;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;

@Entity
@Table(name="Parent_AA")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="Parent_Child")
public class A {
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	int Id;
	String a;
	@Override
	public String toString() {
		return "\nA [Id=" + Id + ", a=" + a + "]";
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public A(int id, String a) {
		super();
		Id = id;
		this.a = a;
	}
	public A() {
		super();
	}
	
}
@Entity
@Table(name="Child_B")
class B extends A{
	int b1;
	String b;
	@Override
	public String toString() {
		return "B [b1=" + b1 + ", b=" + b + ", Id=" + Id + ", a=" + a + "]";
	}
	public B(int id, String a, int b1, String b) {
		super(id, a);
		this.b1 = b1;
		this.b = b;
	}
	
	public B() {
		super();
	}
	public int getB1() {
		return b1;
	}
	public void setB1(int b1) {
		this.b1 = b1;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	
	
}

@Entity
@Table(name="Child_C")
class C extends A{
	int c1;
	String c;
	@Override
	public String toString() {
		return "C [c1=" + c1 + ", c=" + c + ", Id=" + Id + ", a=" + a + "]";
	}
	public C(int id, String a, int c1, String c) {
		super(id, a);
		this.c1 = c1;
		this.c = c;
	}
	public C() {
		super();
	}
	public int getC1() {
		return c1;
	}
	public void setC1(int c1) {
		this.c1 = c1;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	
}