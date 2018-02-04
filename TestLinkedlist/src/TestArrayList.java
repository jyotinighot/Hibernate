import java.io.Serializable;
import java.util.*;
public class TestArrayList {
	public static void main(String[] args)
	{
			System.out.println("Hello");
			List a1=new ArrayList();
			LinkedList l1=new LinkedList();
			System.out.println(a1 instanceof Serializable);
			System.out.println(a1 instanceof Cloneable);
			
			System.out.println(l1 instanceof Serializable);
			System.out.println(l1 instanceof Cloneable);
			/*a1.add("JUI");
			a1.add("JYOTI");
			a1.add("MININATH");
			System.out.println("Array List Elements are\n");
			System.out.println(a1.get(2));
			System.out.println("\t"+a1);
			a1.remove(1);
			Iterator itr= a1.iterator();
			a1.removeAll(a1);
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			List a2=new LinkedList();
			a2.add("JUI");
			a2.add("JYOTI");
			a2.add("MININATH");
			System.out.println("Linked List Elements are\n");
			System.out.println("\t"+a2);
			System.out.println("Student Database");
			StudentData1 s1=new StudentData1(1, "AAAaa",54);
			StudentData1 s2=new StudentData1(2,"BBB",66);
			StudentData1 s3= new StudentData1(3, "CCC", 89);
			ArrayList<StudentData1> a3=new ArrayList<StudentData1>();
			//System.out.println("\t"+a3);
			a3.add(s1);
			a3.add(s2);
			a3.add(s3);
			System.out.println("\t"+a3);
			Iterator itr1=a3.iterator();
			while(itr1.hasNext())
			{
				StudentData1 st=(StudentData1)itr1.next();  
			    System.out.println(st.RollNo+"    "+st.name+" "+st.res);  
			}
			ArrayList<String> a4=new ArrayList<String>();
			a4.add("Rohini");
			a4.add("Aparna");
			a4.add("Sushma");
			ArrayList<String> a5= new ArrayList<String>();
			a5.add("Yogita");
			a5.add("Ranjana");
			a4.addAll(a5);
			Iterator<String> itr3=a4.iterator();
			while(itr3.hasNext())
			{
				System.out.println("\t"+itr3.next());
			}
			a4.removeAll(a5);
			Iterator<String> itr5=a4.iterator();
			while(itr5.hasNext())
			{
				System.out.println("\t\t"+itr5.next());
			}*/
	}
}

class StudentData1
{
	int RollNo;
	String name;
	float res;
	
	public StudentData1(int rollNo, String name, float res) {
		super();
		RollNo = rollNo;
		this.name = name;
		this.res = res;
	}

	@Override
	public String toString() {
		return "StudentData1 [RollNo=" + RollNo + ", name=" + name + ", res="
				+ res + "]";
	}
	
		
}