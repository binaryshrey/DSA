/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes her
		
		Scanner sc = new Scanner(System.in);
		int T = 0,n=0,sum=0;
		if(sc.hasNextInt())
		    T  =sc.nextInt();
		if(T>=1 && T<=100){
		    for(int k=1;k<=T;k++){
		        if(sc.hasNextInt())
		        n = sc.nextInt();
		    if(n>=1 && n<=150){
		        int a1[] = new int[n];
		        int b1[] = new int[n];
		        int tot[] = new int[n];
		        for(int i=0;i<n;i++)
		            if(sc.hasNextInt())
		                a1[i] = sc.nextInt();
		        for(int i=0;i<n;i++)
		            if(sc.hasNextInt())
		                b1[i] = sc.nextInt();
		      
		        for(int i=0;i<n;i++){
		            sum = a1[i]*20-b1[i]*10;
		            if(sum<0)
		                sum=0;
		            tot[i]=sum;
		        }
		        Arrays.sort(tot);
		        System.out.println(tot[n-1]);
		    }
		    }
		}
	}
}
