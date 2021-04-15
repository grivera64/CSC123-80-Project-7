package project7.ThrowTest2;

/*
 * 
 * Name: Trace2.java
 * Purpose: Tests try-catch with deep method
 * 			calls in Divider2.java
 * Author: grivera64
 * Date: 04/14/2021
 * 
 */

/* Import for using input */
import java.util.Scanner;

public class Trace2
{
	
	/* Main (Driver) Method */
	public static void main(String[] args)
	{
		
		
		Scanner keyboard = new Scanner(System.in);				// Create keyboard Scanner
		
		Divider2 divider = new Divider2();						// Create Divider2 Object
		
		/* Local Variables */
		int a, b, answer;
		
		/* Ask user 2 times for input */
		for (int i = 0; i < 2; i++)
		{
			
			System.out.printf("Please enter two integers, "
					+ "a numerator and a denominator: ");
			
			a = keyboard.nextInt();
			b = keyboard.nextInt();
			keyboard.nextLine();
			
			/* Protects the program from crashing from an Arithmetic Exception */
			try
			{
				
				answer = divider.divideA(a, b); 				// Throws an Arithmetic
																// Exception if b == 0
				
				System.out.printf("The quotient of %d and %d using integer arithmetic is %d.\n",
						a, b, answer);
				
			}
			catch (ArithmeticException e) 						// Jumps here if Arithmetic
			{													// Exception is thrown
				
				/* Print error message */
				System.out.printf("Message: ");
				e.printStackTrace();
				
			}
			
		}
		
		/* Close Scanner */
		keyboard.close();
		
		/* Terminate Program */
		
	}
	
}