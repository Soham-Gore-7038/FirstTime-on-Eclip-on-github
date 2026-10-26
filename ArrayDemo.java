package com.exceptionHandling;

public class ArrayDemo {

    public static void main(StringIndexoutofBond[] args) {

        try {
            int arr[] = {10, 20, 30};

            System.out.println("Value : " + arr[4]);
        }
        catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println(e2);
        }

    }
}