import java.util.*;
public class TestStack{

	static void showpush(Stack st, int a) {
		st.push(new Integer(a));
		System.out.println("push(" + a + ")");
		System.out.println("stack: " + st);
	}

	static void showpop(Stack st) {
		System.out.print("pop -> ");
		Integer a = (Integer) st.pop();
		System.out.println(a);
		System.out.println("stack: " + st);
	}

	static void showpeek(Stack st) {
		Integer a=(Integer)st.peek();
		System.out.println("Stack Peek "+a);
		System.out.println("stack P: " + st);
	}

	static void searchStack(Stack st, int a){
		Integer index=(Integer)st.search(a);
		if(index==-1)
		{
			System.out.println("Element "+ a+ " not present in Stack ");
		}
		else
		{
			System.out.println("Element "+ a+ " present at position "+ index);
		}
	}


	public static void main(String args[]) {
		Stack st = new Stack();
		System.out.println("stack: " + st);
		showpush(st, 42);
		showpush(st, 66);
		showpush(st, 99);
		st.add(100);
		showpush(st, 52);
		showpush(st, 16);
		showpeek(st);
		showpop(st);
		showpeek(st);;
		showpop(st);
		showpush(st, 25);
		showpush(st, 39);
		searchStack(st,52);
		showpeek(st);
		searchStack(st,89);
		searchStack(st,99);
		showpop(st);
		showpop(st);

		try {
			showpop(st);
		} catch (EmptyStackException e) {
			System.out.println("empty stack");

		}


	}
}