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
		int T=0,n=0,d=0,c=0;
		if(sc.hasNextInt())
		    T = sc.nextInt();
		    
		if(T>=1 && T<=100000){
		    
		    for(int i=1;i<=T;i++){
		        if(sc.hasNextInt())
		            n = sc.nextInt();
		        while(n>0){
		            d=n%10;
		            if(d==4)
		                c++;
		            n=n/10;
		        }
		       
		        System.out.println(c);
		        c=0;
		    }
		    
		}
	}
}
