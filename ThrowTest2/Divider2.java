package project7.ThrowTest2;

/*
 * 
 * Name: Divider2.java
 * Purpose: Extends the deepness of the original divideA
 * 			Method from Divide1.java to test Exceptions
 * 			a deeper called method
 * Author: grivera64
 * Date: 4/14/2021
 * 
 */

public class Divider2
{
	
	/* Returns the quotient of a and b from divideB*/
	public int divideA(int a, int b)
	{
		
		return divideB(a, b);
		
	}
	
	/* Returns the divideC to divideA */
	public int divideB(int a, int b)
	{
		
		return divideC(a, b);
		
	}
	
	/* Returns the quotient of a and b to divideB */
	public int divideC(int a, int b)
	{
		
		return a / b;
		
	}
	
}