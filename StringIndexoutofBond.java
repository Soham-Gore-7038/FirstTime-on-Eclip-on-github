package com.exceptionHandling;
import java.util.Scanner;
public class StringIndexoutofBond {

	public static void main(java.lang.String[] args) {
		 String strin ="Soham";
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter String Index :");
	strin = sc.next();
	try { 
		int index = sc.nextInt();
		} 
	   catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("Character :"+strin.charAt(indix));
		
	}
	catch(StringIndexOutOfBoundsException e1){
		System.out.println(e1);
		
	}
	
	
	
	sc.close();	

	}

}
