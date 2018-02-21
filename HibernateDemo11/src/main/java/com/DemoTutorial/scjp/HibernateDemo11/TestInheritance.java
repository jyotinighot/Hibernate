package com.DemoTutorial.scjp.HibernateDemo11;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestInheritance {

	public static void main(String[] args) {
		A a1=new A(1, "One");
		//B b1=new B(11, "AA", 110, "BB");
		//C c1=new C(22,"AA",52,"Cc");
		Configuration cfg = new Configuration();
		SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tr =session.beginTransaction();
		session.save(a1);
		tr.commit();
		session.close();

	}

}


