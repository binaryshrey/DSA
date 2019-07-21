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
		int x=0;double y=0.00;
		if(sc.hasNextInt())
		    x = sc.nextInt();
		    
		if(sc.hasNextDouble())
		    y = sc.nextDouble();
		    
		if(x%5!=0 || x>=(int)y)
		    System.out.println(y);
		else
		    System.out.println(y-x-0.5);
		
	}
}
