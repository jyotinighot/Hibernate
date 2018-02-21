package com.DemoTutorial.scjp.HibernatePrictice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestValueTypeObject {

	public static void main(String[] args) {
		Address ad1=new Address("Pune", 411046);
		Address ad2=new Address("Mumbai", 15248);
		Address ad3=new Address("Delhi", 56874);
		Address ad4=new Address("Kolkata", 44785);
		Employee e1=new Employee();
		e1.getLisOfAddresses().add(ad1);
		e1.getLisOfAddresses().add(ad2);
		e1.getLisOfAddresses().add(ad4);
		e1.getLisOfAddresses().add(ad3);
		e1.setEmpName("Jyoti");
		e1.setEmpSalary(25000);
		//Employee e1=new Employee(2, "Sarika", 25000, ad);
		Configuration cfg=new Configuration();
		SessionFactory sf=cfg.configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(e1);
		
		tr.commit();
		session.flush();
	}
}
