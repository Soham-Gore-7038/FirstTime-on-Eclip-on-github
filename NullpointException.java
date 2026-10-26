package com.exceptionHandling;
import java.util.Scanner;

public class NullpointException {
    public static void main(StringIndexoutofBond[] args) {

        StringIndexoutofBond name = null;
        try
        {
        	System.out.println(name.length());
        }
        catch (NullPointerException e1){
        	System.out.println(e1);
        	
        }

        
    }
}