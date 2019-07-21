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
		int T=0,N=0,c=0,num=0,rem=0,sum=0;
		double s=0.00;
		
		if(sc.hasNextInt())
		    T = sc.nextInt();
		if(T>=1 && T<=1000)
		{
		    for(int i=1;i<=T;i++){
		    if(sc.hasNextInt())
		        N = sc.nextInt();
		    num = N;
		    while(num>0)
		    {
		        c+=1;
		        num/=10;
		    }
		    while(N>0)
		    {
		        rem=N%10;
		        s = rem*Math.pow(10,(c-1));
		        sum=sum+(int)s;
		        c=c-1;
		        N=N/10;
		    }
		    System.out.println(sum);
		    rem=0;
		    c=0;
		    s=0.00;
		    sum=0;
		    num=0;
		    
		}
		}
	}
}
