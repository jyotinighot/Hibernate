/*import java.util.*;


public class TestVector{
	public static void main(String[] args)
	{
		Vector v=new Vector(5);
		Vector v1=new Vector(2);
		v.add(1);
		v.add(10);
		v.add(11);
		v.add(12);
		v.add(13);
		v1.add(10);
		v1.add(15);
		System.out.println(" "+v);
		
		//List l1=new ArrayList<>();
		//l1.add(10);
		//l1.add(20);
		//l1.add(30);
		//v.add(l1);
		v.add(v1);
		/*System.out.println(" "+v);
		v.addElement("Mango");
		System.out.println(" "+v);
		v.add(3,"Apple");
		System.out.println(" "+v);
		v.retainAll(v1);
		//v.removeAll(v1);
		System.out.println(" "+v);
		Vector<String> v2= new Vector<String>();
		Vector<String> v3= new Vector<String>();
		v2.add("A");
		v2.add("B");
		v2.add("C");
		v2.add("D");
		v2.add("E");
		v3.add("F");
		v3.add("G");
		//System.out.println(" "+v2);
		//System.out.println(" "+v3);
		v3.addAll(v2);
		//System.out.println(" "+v3);
		v3.retainAll(v2);
		//System.out.println(" "+v3);
		System.out.println(" "+v2);
		v3.addAll(v1);
	//	System.out.println(" "+v3);
		v3.retainAll(v1);
		System.out.println(" "+v3);
		v.addAll(v2);
		System.out.println(" "+v);
		v.retainAll(v2);System.out.println(" "+v);
		v.removeAllElements();
		System.out.println(" "+v);
		System.out.println(" "+v2);
		System.out.println("Hash Code of Vector v2= "+v2.hashCode());
		Vector v4=new Vector();
		System.out.println(" "+v2);
		v4=(Vector)v2.clone();
		System.out.println(" "+v4);
		Vector v5=new Vector(15);
		v5.add(110);
		v5.add(111);
		v5.add(112);
		v5.add(113);
		v5.add(114);
		System.out.println(" "+v5);
		System.out.println("Lenght = " +v5.size());
		System.out.println("Capacity = " +v5.capacity());
		
		
		
	}
}*/

/*
import java.util.*;
class TestVector    
{
    public static void main(String[] arg)
    {
        Vector vec = new Vector(7);
        Vector vecretain = new Vector(4);
 
        // use add() method to add elements in the vector
        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);
        vec.add(5);
        vec.add(6);
        vec.add(7);
       
        // this elements will be retained
        vecretain.add(5);
        vecretain.add(3);
        vecretain.add(2);
         System.out.println("Calling retainAll()");
        vec.retainAll(vecretain);
       
        // let us print all the elements available in vector
        System.out.println("Numbers after removal :- "); 
    
        Iterator itr = vec.iterator();
    
        while(itr.hasNext())
        {
         System.out.println(itr.next());
                
        }
   }     
}*/

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
public class TestVector {
  public static void main(String[] args) {
     Vector<String> vector = new Vector<String>();
     vector.add("Harry");
     vector.add("Steve");
     vector.add("Vince");
     vector.add("David");
     vector.add("Matt");

     System.out.println("Vector elements before replacement: ");
     for(int i=0; i < vector.size(); i++)
     {
         System.out.println(vector.get(i));
     }
 
     //Replacing index 1 element
     vector.set(1,"Mark");
     //Replacing index 2 element
     vector.set(2,"Jack");
 
     System.out.println("Vector elements after replacement: ");
     for(int i=0; i < vector.size(); i++)
     {
        System.out.println(vector.get(i));
     }
     List<String> list=Collections.list(vector.elements());
     System.out.println(list);
  }
}