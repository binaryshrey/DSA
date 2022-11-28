/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int P=0,R=0,T=0;
		double amt = 0.0, ci = 0.0 , si=0.0;
		if(sc.hasNextInt()){
		    P = sc.nextInt();
		    R = sc.nextInt();
		    T = sc.nextInt();
		}
		si = (P*R*T)/100;
		amt = P*(Math.pow(1+R/100,T));
		ci = amt-P;
		
		System.out.println("Simple Interest = "+si);
		System.out.println("Amount = "+amt);
		System.out.println("Compound Interest = "+ci);
		
		
	}
}
