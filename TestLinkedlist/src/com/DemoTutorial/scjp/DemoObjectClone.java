package com.DemoTutorial.scjp;
import java.util.*;
public class DemoObjectClone {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c1=new Course("Maths","Hindi","English");
		student s1=new student(101, "ABC", c1);
		student s2=null;
		try {
			s2=(student)s1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(s1.studID==s2.studID);
		System.out.println(s1.course.sub1==s2.course.sub1);
		s1.course.sub1="Physics";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.course.sub1==s2.course.sub1);
		s2.course.sub2="Biology";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.course.sub2==s2.course.sub2);
	}

}
