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
	    int n = 0,c = 0,sum=0,d=0;
		if(sc.hasNextInt())
		    n = sc.nextInt();
		int no = n;
		no = no*no;
		
		while(no>0){
		    d = no%10;
		    sum+=d;
		    no = no/10;
		}
		if(sum==n)
		    System.out.println("Neon no");
		else
		    System.out.println("Not Neon");
	}
}
