/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    public static void max_prod_sum(int a[]){
        int d = 0,prod=0,sum=0,max=0;
        int len = a.length;
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                sum=0;
                prod = a[i]*a[j];
                while(prod>0){
                    d=prod%10;
                    sum+=d;
                    prod=prod/10;
                }
                if(max<sum)
                    max = sum;
            }
        }
    System.out.println(max);
        
    }
    
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T=0,n=0;
		T = sc.nextInt();
		if(T>=1 && T<=100){
		    for(int j=1;j<=T;j++){
    		    n = sc.nextInt();
    		    if(n>=2 && n<=100){
    		        int arr[] = new int[n];
    		        for(int i=0;i<n;i++){
    		            arr[i] = sc.nextInt();
    		        }
    		        max_prod_sum(arr);
    		    }
		    }
		    
		    
		}
		
	}
}
