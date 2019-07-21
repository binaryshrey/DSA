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
		int T=0,N=0,last=0,first=0,sum=0;
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt())
		    T = sc.nextInt();
		for(int i=1;i<=T;i++)
		{
		    last=0;first=0;
		    if(sc.hasNextInt())
		        N = sc.nextInt();
		    last = N%10;
		    while(N>0)
		    {
		        if(N<=10)
		            first = N%10;
		        sum = last+first;
		        N/=10;
		    }
		    
		    System.out.println(sum);
		    sum=0;
		}
	}
}
