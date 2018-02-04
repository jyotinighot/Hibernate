package com.DemoTutorial .scjp;

import java.util.Date;

public class student implements Cloneable {

	int studID;
	String studName;
	Course course;
	//Date date;
	public student(int studID, String studName, Course course) {
		super();
		this.studID = studID;
		this.studName = studName;
		this.course = course;
	}
	@Override
	public String toString() {
		return "student [studID=" + studID + ", studName=" + studName
				+ ", course=" + course + "]";
	}
	protected Object clone() throws CloneNotSupportedException
	{
			student ss=(student)super.clone();
			ss.course=(Course)course.clone();
			return ss;
	}

	
	
}
