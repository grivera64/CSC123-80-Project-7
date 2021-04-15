//package project7.ExceptionTest;

/*
 * 
 * Name: ExceptionTester.java
 * Purpose: Tests try catch to continue looping
 *			unitl proper input is given
 * Author: grivera64
 * Date: 04/15/2021
 * 
 */

/* Required Imports */
import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionTester
{
	
	/* Main (Drive) Method */
	public static void main(String[] args)
	{
		
		/* Create Scanner */
		Scanner keyboard = new Scanner(System.in);
		
		/* Create local variables */
		int[] arr = new int[5];										//Array size 5
		int value = 0, index = 0;									//Initialize to 0
		
		/* Infinite loop */
		while (true)
		{
			
			/* Try-Catch Block to ask to change an array slot's value */
			try
			{
				
				System.out.printf("Please enter a value: ");
				value = keyboard.nextInt();							//Throws InputMistmatch
				keyboard.nextLine();
				
				System.out.printf("Please enter an index: ");
				index = keyboard.nextInt();							//Throws InputMismatch
				keyboard.nextLine();
				
				arr[index] = value;									//Throw IndexOutOfBounds
				
				System.out.printf("The value for the array at index %d is %d\n", 
						index, arr[index]);
				
				/* End infinite loop */
				break;
				
			}
			/* Catch statements that print the stack trace of the error */
			catch (IndexOutOfBoundsException e)
			{
				
				e.printStackTrace();
				
			}
			catch (InputMismatchException e)
			{
				
				e.printStackTrace();
				keyboard.next();									//clears input
				
			}
			catch (Exception e)
			{
				
				e.printStackTrace();
				
			}
			
		}
		
		/* Close keyboard */
		keyboard.close();
		
		/* Terminate Program */
		
	}
	
}