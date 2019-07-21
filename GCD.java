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
		int a=0,b=0,gcd=0;
		if(sc.hasNextInt()){
		    a = sc.nextInt();
		    b = sc.nextInt();
		}
		int prod = a*b;
		for(int i=1;i<prod;i++)
		    if(a%i==0 && b%i==0)
		        gcd=i;
		System.out.println(gcd);
	}
	
}
