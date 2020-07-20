/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		double marks = 0.0;
		if(sc.hasNextDouble())
	        marks = sc.nextDouble();
    	if((int)marks >=1 && (int)marks <=50)
		    System.out.println("100");
		else if((int)marks >=51 && (int)marks <=100)
		    System.out.println("50");
		else
		    System.out.println("0");
		
	}
}
