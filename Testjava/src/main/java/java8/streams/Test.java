package java8.streams;

import java.util.ArrayList;

public class Test {
	public static void main(String args[]) {
		//Note: that lambda expressions can only be used to implement functional interfaces
		
		/*
		 * Lambda Expression Syntax lambda 
		 * operator -> body 
		 * 
		 * There are three Lambda Expression Parameters are mentioned below:
		 * 
		 * 1 Zero Parameter : () -> System.out.println("Zero parameter lambda");
		 * 2 Single Parameter :  (p) -> System.out.println("One parameter: " + p);
		 * 3 Multiple Parameters: (p1, p2) -> System.out.println("Multiple parameters: " + p1 + ", " + p2);
		 * 
		 */
		// lambda expression to implement above
		// functional interface. This interface
		// by default implements abstractFun()
		functionalInterface fobj = (int x) -> System.out.println(2 * x);
		// This calls above lambda expression and prints 10.
		fobj.abstractFun(5);

		functionalInterface fob = (x) -> System.out.println(3 * x);
		fob.abstractFun(5);

		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(13);
		al.add(16);
		al.add(19);
		System.out.println("normal retrive arraylist " + al);
		for (int x : al) {
			System.out.println(x);
		}
		// by using lambda expression
		System.out.println("by using lambda expression");
		al.forEach(x -> System.out.println(x));
		System.out.println("even nymbers");
		//even numbers
		al.forEach(n-> {
		if(n%2==0)
			System.out.println(n);
		});
	}
}
