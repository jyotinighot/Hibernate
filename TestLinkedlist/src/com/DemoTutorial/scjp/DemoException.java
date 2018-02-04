package com.DemoTutorial.scjp;

public class DemoException {

	public static void main(String[] args) {
		String s1=null;
		try{
			System.out.println("Try 1 Executed");
			//String s1=null;
			//System.out.println(10/0);
			//System.out.println(s1.length());
			try{
				System.out.println("Try 2 Executed");
				//System.out.println(10/0);
				System.out.println(s1.length());
			}
			catch(ArithmeticException e){
				System.out.println("Catch 2 for ArithmeticException Executed");
			}
			finally{
				System.out.println("Finally 2 Executed");
			}
		}
		
		catch(ArithmeticException e){
			System.out.println("Catch 1 for ArithmeticException Executed");
			//System.out.println(s1.length());
		}
		catch (NullPointerException e) {
			System.out.println("Catch 1 for NullPointerException Executed");
			
		}
		finally{
			System.out.println("Finally 1 Executed");
		}
		
	}

}



/*try{
	System.out.println("Try Executed");
	//String s1=null;
	//System.out.println(s1.length());
	System.out.println(10/0);
}
catch(ArithmeticException e){
	System.out.println("Catch for ArithmeticException Executed");
	System.out.println(s1.length());
}
catch (NullPointerException e) {
	System.out.println("Catch for NullPointerException Executed");
	
}
finally{
	System.out.println("Finally Executed");
}*/