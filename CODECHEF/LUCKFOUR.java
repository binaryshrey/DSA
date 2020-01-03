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
		double T = sc.nextDouble();
		int d=0,c=0;
		for(int i=1;i<=T;i++){
		    double n = sc.nextDouble();
		    while(n>0){
		        d = (int)n%10;
		        if(d==4)
		            c+=1;
		        n=n/10;
		    }
		    System.out.println(c);
		    d=0;c=0;
		}
	}
}
