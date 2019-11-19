/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void small_fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n=0,t=0;
		if(sc.hasNextInt())
		    t = sc.nextInt();
	    for(int i=1;i<=t;i++){
	        if(sc.hasNextInt())
		        n = sc.nextInt();
		    small_fact(n);
	    }
	}
}
