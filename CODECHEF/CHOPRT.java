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
		int t = sc.nextInt();
		for(int i=1;i<=t;i++){
		    double n1 = sc.nextDouble();
		    double n2 = sc.nextDouble();
		    if(n1>n2)
		        System.out.println(">");
		    else if(n1<n2)
		        System.out.println("<");
		    else
		        System.out.println("=");
		    
		}
	}
}
