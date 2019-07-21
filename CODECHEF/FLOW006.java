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
		int N=0,rem=0,sum=0,T=0;
		if(sc.hasNextInt())
		    T = sc.nextInt();
		if(T>=1 && T<=1000)
		{
		    for(int i=1;i<=T;i++)
		    {
		        rem=0;sum=0;
		        if(sc.hasNextInt())
		            N = sc.nextInt();
		        while(N>0)
		        {
		            rem=N%10;
		            sum+=rem;
		            N/=10;
		        }
		        System.out.println(sum);
		    }
		}
		    
		
	}
}
