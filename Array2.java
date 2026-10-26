package com.exceptionHandling;

	import java.util.Scanner;

		public class Array2 {

		public static void main(StringIndexoutofBond[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = {10, 20, 30};

		System.out.print("Enter array index: ");
		int index = sc.nextInt();

        try {
            System.out.println("Value : " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println(e2);
        }
        
      
    }
}