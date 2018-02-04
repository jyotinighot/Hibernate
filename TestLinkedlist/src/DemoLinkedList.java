
import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

import javafx.util.converter.PercentageStringConverter;
public class DemoLinkedList {
	public static void main(String args[]){
		
		LinkedList<Object> l1=new LinkedList<Object>();
		StudentData S3=new StudentData(100,"vvv",75);
		StudentData S1=new StudentData(25, "SSS", 77);
		StudentData S2=new StudentData(2, "BBB", 89.23);
		l1.add("Jyoti");
		l1.add(S2);
		l1.add(10);
		l1.add(56.23);
		l1.add(S3);
	//	System.out.println();
	//	System.out.println("\n"+l1);
		/*Iterator itr= l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		System.out.println("\n\nDisplay by For each Loop");
		for(Object ob: l1)
		{
			System.out.println(ob);
		}
		
		l1.addFirst(99);
		//l1.addLast(S1);
		l1.add(3, S1);
		l1.add(new StudentData(20, "JUI", 94));
		System.out.println("\n\nDisplay by Normal For Loop");
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		int x=l1.size();
		System.out.println("Total Number of Elements in the  Linked List are  "+ x);
		//System.out.println("\n\nDisplay vy Normal For Loop");
		if(!(l1.contains(98)))
	    {
			System.out.println("List doesnt Contain 98");
		}
		l1.remove("Jyoti");
		System.out.println("\n\nDisplay by Normal For Loop");
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		Object ob=l1.getFirst();
		System.out.println("\nFirst Element "+ob);
		Object ob1=l1.getLast();
		System.out.println("\nLast Element "+ob1);
		x=l1.indexOf(S1);
		System.out.println("\nIndex of " +S1 +"is   " +x);
		x=l1.lastIndexOf(S3);
		System.out.println("\nIndex of  " +S3 +"is  "+x);
		x=l1.size();
		System.out.println("\nTotal Number of Elements in the  Linked List are  "+ x);
		if((l1.contains(S2)))
	    {
			System.out.println("\nList Contains " + S2);
		}
		//l1.removeAll(StudentData S1);
	//	l1.remo
		//l1.removeAll(Collection<StudentData> );
	}
}
	 class StudentData{
	
	 int RollNo;
	 String Name;
	 double precentage;
	 void DisplayStudentData()
	 {
		 System.out.println("\nStud Roll No= "+RollNo+"\t Stud  Name= "+Name+" \t Stud Per"+ precentage);
	 }
	 
	public StudentData(int rollNo, String name, double precentage) {
		super();
		RollNo = rollNo;
		Name = name;
		this.precentage = precentage;
	}

	@Override
	public String toString() {
		return "StudentData [RollNo=" + RollNo + ", Name=" + Name
				+ ", precentage=" + precentage + "]";
	}
	 	 
	
 }