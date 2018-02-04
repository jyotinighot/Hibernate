import java.lang.reflect.MalformedParametersException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public abstract class DemoIteratorMAPall {

	public static void main(String[] args) {
		Address d1=new Address("Pune",411046);
		Address d2=new Address("Mumbai", 411050);
		Address d3=new Address("Delhi",411047);
		Address d4=new Address("Banglore",411052);
		Emp e1=new Emp(11, "Jyoti", 10000, d4);
		Emp e2=new Emp(23, "Kirti", 15000, d3);
		Emp e4=new Emp(28, "Kaushal", 15550, d2);
		Emp e5=new Emp(73, "Pranjal", 175000, d1);
		Emp e3=new Emp(97, "Rina", 12400, d1);
		/***************      HASH MAP   IMPLEMENTATION   ****************/
		HashMap<Emp, String> map1=new HashMap<>();
		System.out.println(map1.put(e3, "book"));
		System.out.println(map1.put(e2, "pen"));
		System.out.println(map1.put(e4, "mobile"));
		System.out.println(map1.put(e1, "eraser"));
		System.out.println(map1.put(e5, "pouch"));
		System.out.println(map1.put(e1, "pouch"));
		System.out.println(map1.size());
		System.out.println("\n\n/*****Using keyset  &  Iterator********/" );
		Set<Emp> mapset= map1.keySet();
		/*      Using Iterator   */
		Iterator itr =mapset.iterator();
		while(itr.hasNext())
		{
			Emp e=(Emp)itr.next();
			System.out.println("Key=  "+e+"Value=  "+map1.get(e));
		}

		System.out.println("\n\n/*****Using Keyset  &  For Each  ********/" );
		for (Emp emp : mapset) {
			System.out.println("Key=  "+emp+"Value=  "+map1.get(emp));
		}
		/*      Using For loop   cannot apply index on set so created list from that set Sand then applied index variable on that*/
		System.out.println("\n\n/*****Using Keyset  &  For Loop ********/" );
		List<Emp> list1=new ArrayList(mapset);
		for(int i=0; i<list1.size();i++)
		{
			System.out.println("Key=  "+list1.get(i)+"Value=  "+map1.get(list1.get(i)));
		}
		/*      Using entryset()   */
		System.out.println("\n\n/*****Using Entryset  &  Iterator********/" );
		Set<Entry<Emp,String>> mapset1= map1.entrySet();
		/*      Using Iterator   */

		Iterator itr1 =mapset1.iterator();
		while(itr1.hasNext())
		{
			Entry<Emp,String> e=(Entry<Emp,String>)itr1.next();
			System.out.println("Key=  "+e.getKey()+"Value=  "+e.getValue());
		}
		System.out.println("\n\n/*****Using Entryset  &  For Each ********/" );
		for (Entry<Emp, String> entry : mapset1) {
			System.out.println("Key=  "+entry.getKey()+"Value=  "+entry.getValue());
		}

		/*      Using values()   */
		System.out.println("\n\n/*****Using values()  &  Iterator ********/" );

		Collection<String> mapValue= map1.values();
		Iterator<String> itr2=mapValue.iterator();
		while(itr2.hasNext())
		{
			String s=(String)itr2.next();
			for (Object O:map1.keySet()) {

				if(map1.get(O).equals(s))
				{
					System.out.println(O+ " is the  key for value "+ s);
					break;
				}
			}

		}
		/***********   LINKED HASHMAP IMPLEMENTATION     ***********/
		LinkedHashMap<Emp,String> lhm=new LinkedHashMap<Emp,String>();  
		lhm.put(e1,"A");
		lhm.put(e5,"B");
		lhm.put(e3,"C");
		lhm.put(e4,"D");
		lhm.put(e2,"E");
		Set<Emp> mapset11= lhm.keySet();
		/*      Linked Hash MAP Using Iterator   */
		System.out.println("\n\n/***** Linked Hash MAP Using ITERATOR  ********/" );
		Iterator itr11 =mapset11.iterator();
		while(itr11.hasNext())
		{
			Emp e=(Emp)itr11.next();
			System.out.println("Key=  "+e+"Value=  "+lhm.get(e));
		}

		System.out.println("\n\n/***** Linked Hash MAP Using Keyset  &  For Each  ********/" );
		for (Emp emp : mapset11) {
			System.out.println("Key=  "+emp+"Value=  "+lhm.get(emp));
		}
		/*      Using For loop   cannot apply index on set so created list from that set Sand then applied index variable on that*/

		
		/***********  HASHTABLE IMPLEMENTATION     ***********/
		
		Hashtable<Emp, String> hashTbl=new Hashtable<>();
		hashTbl.put(e1,"A");
		hashTbl.put(e5,"B");
		hashTbl.put(e3,"C");
		hashTbl.put(e4,"D");
		hashTbl.put(e2,"E");

		/***********  HASHTABLE IMPLEMENTATION   using Enumeration   ***********/
		System.out.println("\n\n/***** HASHMAP using ENUMERATION  and keySET() ********/" );
		Enumeration<Emp> e=hashTbl.keys();
	
		while(e.hasMoreElements())
		{
			Emp ee=(Emp)e.nextElement();
			System.out.println("Key=   "+ee+"Values=   "+hashTbl.get(ee));
		}
		System.out.println("\n\n/***** HASHMAP using ENUMERATION  and elements() ********/" );
		Enumeration<String> estr=hashTbl.elements();
		while(estr.hasMoreElements())
		{
			String ss=(String)estr.nextElement();
			for(Object o:hashTbl.keySet())
			{
				if(hashTbl.get(o).equals(ss))
				{
					System.out.println("Key=   "+o+"Value=   "+ss);
				}
					
			}
		}
		
	}//End of MAIN
}//End of Class














class Emp {
	int empID;
	String empName;
	int salary;
	Address empAdd;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Address getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(Address empAdd) {
		this.empAdd = empAdd;
	}
	@Override
	public String toString() {
		return "\nEmp [empID=" + empID + ", empName=" + empName + ", salary=" + salary + ", empAdd=" + empAdd + "]";
	}
	public Emp(int empID, String empName, int salary, Address empAdd) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
		this.empAdd = empAdd;
	}


}

class Address
{
	String city;
	int pinCode;
	public Address(String city, int pinCode) {
		super();
		this.city = city;
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pinCode=" + pinCode + "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}


}