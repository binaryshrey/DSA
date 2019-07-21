/* package codechef; // don't place package name! */

import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T=0,a=0,b=0;
		
		if(sc.hasNextInt())
		    T=sc.nextInt();
		    
		for(int i=1;i<=T;i++)
		{
		    if(sc.hasNextInt())
		    {
		        a=sc.nextInt();
		        b=sc.nextInt();
		    }
		    System.out.println(a%b);
		    
		}
		    
	}
}
