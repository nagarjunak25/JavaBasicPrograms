package com.test.Basic_Java_Programs;

import java.util.Scanner;

public class Test3_User_Input 
{
	public static void main(String[] args) 
	{
		int a ;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value");
		a=sc.nextInt();		
		if(a%2==0) {
			System.out.println("even number "+a);
		}else {
			System.out.println("odd number :"+a);
		}
		System.out.println("enter b number ");
		int b=sc.nextInt();
		System.out.println("sum of "+a+" + "+b +"=" +(a+b));
		
		
		/*
		 * int a;
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.print("Enter the Value : ");
		 * 
		 * a = sc.nextInt();
		 * 
		 * System.out.println(a);
		 */
	
	}

}

// Output:
/*
  
 
Enter the Value : 100
100

 

 
 */
