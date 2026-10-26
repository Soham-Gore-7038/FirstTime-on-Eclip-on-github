package com.exceptionHandling;

public class B {
	
	public void abc(int a , int b)  throws ArithhmeticException, ArrayIndexoutofBoundsException
	{
		
		
		try {
			
		try
		{
			int c = a/b;
			System.out.println("Division:" +c);
		}
		catch (ArithmeticException e) 
		{
				System.out.println(e);
				
		}
		
		try
		{
			int arr[]= {10,20,30};
			System.out.println("value :"+arr[4]);
		}
		
		catch (ArrayIndexOutOfBoundsException e2)
		{
			System.out.println(e2);
		}
		
		StringIndexoutofBond str = null;
		System.out.println("str len :"+str.length());
		}
		
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("isnde finally");
		}

	
	}

	public  void display() {
			System.out.println("Inside display");
			
		
		}
	}