package com.DemoTutorial.scjp;

public class Course implements Cloneable {
	String sub1;
	String sub2;
	String sub3;
	public Course(String sub1, String sub2, String sub3) {
		super();
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	@Override
	public String toString() {
		return "Course [sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3
				+ "]";
	}
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}
