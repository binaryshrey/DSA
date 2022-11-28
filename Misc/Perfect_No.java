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
		Scanner sc  = new Scanner(System.in);
	    int n = 0,c = 0;
		if(sc.hasNextInt())
		    n = sc.nextInt();
		for(int i=1;i<n;i++)
		    if(n%i==0)
		        c+=i;
		if(c==n)
		    System.out.println("Perfect No");
	}
}
