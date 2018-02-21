package com.DemoTutorial.scjp.HibernateDemo11;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class TestDemo {

	public static void main(String[] args) {
		ProductDemo p1 = new ProductDemo(20, "DELL Taptop", 5689, "Product250");
		Configuration cfg = new Configuration();
		SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tr =session.beginTransaction();
		session.save(p1);
		tr.commit();
		session.close();
/*
		ProductDemo p1 = new ProductDemo(80, "ProductDemo80", 3200, "New ProductDemo5");
		ProductDemo p2 = new ProductDemo(81, "ProductDemo81", 2500, "New ProductDemo6");
		ProductDemo p3 = new ProductDemo(82, "ProductDemo82", 6300, "New ProductDemo7");*/
		/*******get and load difference ********************* 
		Configuration cfg = new Configuration();
		SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println("Fetch object with Get");
		ProductDemo p1 = (ProductDemo) session.get(ProductDemo.class,5);
		System.out.println("Fetch object with load");
		ProductDemo p2 =(ProductDemo) session.load(ProductDemo.class,6);
		System.out.println("Print result of get");
		System.out.println(p1);
		System.out.println("Print result of load");
		System.out.println(p2);
		Transaction tr = session.beginTransaction();
		session.save(p1); 
		session.save(p2);
		session.flush();
		tr.commit(); 
		/*******get and load difference ********************* */
		
		
		
		
		/*******update() & merge()  difference ********************* 
		Configuration cfg = new Configuration();
		SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		ProductDemo p1 = (ProductDemo) session.get(ProductDemo.class,1);
		session.close();
		System.out.println("p1    "+p1);
		
		Session session1 = sessionFactory.openSession();
		ProductDemo p2 = (ProductDemo) session1.get(ProductDemo.class,1);
		System.out.println("p2   "+p2);
		p1.setProductName("Produc150");
	//	session1.update(p1);
		session1.merge(p1);
		ProductDemo p3 = (ProductDemo) session1.get(ProductDemo.class,1);
		System.out.println("p3   "+p3);
		session1.close();
		/*******update() & merge()  difference ********************* */
		
	
		


	}

}


//org.hibernate.exception.GenericJDBCException: could not execute statement
//org.hibernate.HibernateException: save is not valid without active transaction  (whe0
//org.hibernate.MappingNotFoundException: