package com.exceptionHandling;

public class Voting {
	public void checking(int age)
	{
	
	if (age >=18) {
		System.out.println("you can vote");
		
	}else {
		throw new ArithmeticException("Access denied : you must be atleast 18 years old");
	}

}
}
