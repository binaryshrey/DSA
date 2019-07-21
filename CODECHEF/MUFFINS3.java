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
		int T=0,N=0,pack=0;
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt())
		    T = sc.nextInt();
		    
		if(T>=1 && T<=1000)
		{
		    for(int i=1;i<=T;i++)
		    {
		        pack = 0;
		        if(sc.hasNextInt())
		            N = sc.nextInt();
		        if(N>=2 && N<=100000000)
		        {
		            if(N%2!=0)
		                pack = ((N+1)/2);
		            else
		                pack = (N/2)+1;
		        }
		        System.out.println(pack);
		    }
		    
		 }
		    

	}
	
}
