package com.DemoTutorial.scjp.HibernateDemo11;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class TestDemo {

	public static void main(String[] args) throws InterruptedException {
	/*	ProductDemo p1 = new ProductDemo(22, "DELL1 Taptop", 5689, "Product250");
		Configuration cfg = new Configuration();
		SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tr =session.beginTransaction();
		ProductDemo p2=(ProductDemo) session.get(ProductDemo.class, 22);
		session.save(p1);
		tr.commit();
		session.close();
		System.out.println(p2);
		p2.setProductPrice(5400);
		Session session1 = sessionFactory.openSession();
		Transaction tr1 =session1.beginTransaction();
		session1.save(p2);
		tr1.commit();
		session1.close();*/
		
		Configuration cfg = new Configuration();
		SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Employee e1=new Employee(1, "AAA", 1500);
		Employee e2=new Employee(11, "BBB", 4500);
		Employee e3=new Employee(12, "DDD", 1878);
		Employee e4=new Employee(14, "SSS", 478);
		Transaction tx = session.beginTransaction();
		session.save(e3);
		session.save(e2);
		session.save(e4);
		session.save(e1);
		//Get employee with id=1
		Employee emp = (Employee) session.load(Employee.class,1);
		printData(emp,1);
		
		//waiting for sometime to change the data in backend
		Thread.sleep(10000);
		
		//Fetch same data again, check logs that no query fired
		Employee emp1 = (Employee) session.load(Employee.class, 1);
		printData(emp1,2);
		
		//Create new session
		Session newSession = sessionFactory.openSession();
		//Get employee with id=1, notice the logs for query
		Employee emp2 = (Employee) newSession.load(Employee.class, 1);
		printData(emp2,3);
		
		//START: evict example to remove specific object from hibernate first level cache
		//Get employee with id=2, first time hence query in logs
		Employee emp3 = (Employee) session.load(Employee.class, 2);
		printData(emp3,4);
		
		//evict the employee object with id=1
		session.evict(emp);
		System.out.println("Session Contains Employee with id=1?"+session.contains(emp));

		//since object is removed from first level cache, you will see query in logs
		Employee emp4 = (Employee) session.load(Employee.class,  1);
		printData(emp4,5);
		
		//this object is still present, so you won't see query in logs
		Employee emp5 = (Employee) session.load(Employee.class, 2);
		printData(emp5,6);
		//END: evict example
		
		//START: clear example to remove everything from first level cache
		session.clear();
		Employee emp6 = (Employee) session.load(Employee.class, 1);
		printData(emp6,7);
		Employee emp7 = (Employee) session.load(Employee.class,2);
		printData(emp7,8);
		
		System.out.println("Session Contains Employee with id=2?"+session.contains(emp7));
		
		tx.commit();
		//session.close();
		
	}
	private static void printData(Employee emp, int count) {
		System.out.println(count+":: Name="+emp.getEmpName()+", Salary="+emp.getEmpSalary());
	}
}

		
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
		
	
		



//org.hibernate.exception.GenericJDBCException: could not execute statement
//org.hibernate.HibernateException: save is not valid without active transaction  (whe0
//org.hibernate.MappingNotFoundException: