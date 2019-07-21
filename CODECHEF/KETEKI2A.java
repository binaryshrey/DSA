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
		int n=0,K=0,P=0;
		if(sc.hasNextInt())
		    n = sc.nextInt();
		    
		if(n>=1 && n<=100000){
		    int C[] = new int[n];
		    int a = n/2;
		    int b = n/2;
		    for(int i=0;i<n;i++)
		        if(sc.hasNextInt())
		            C[i] = sc.nextInt();
		            
		    if(n%2==0){
		        for(int i=0;i<a;i++)
		            P = P + C[i];
		        for(int i=(n-1);i>=b;i--)
		            K = K + C[i];
		    }
		    else{
		        for(int i=0;i<=a;i++)
		            P = P + C[i];
		        for(int i = (n-1);i>b;i--)
		            K = K + C[i];
		    }
		    System.out.println(K-P);
		    
		}    
	}
}
