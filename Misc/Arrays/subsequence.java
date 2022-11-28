/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void subsequence(int arr[], int n){
        int opsize = (int)Math.pow(2,n);
        for(int i=1;i<opsize;i++){
            for(int j=0;j<n;j++){
                if(BigInteger.valueOf(i).testBit(j))
                    System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a[] = {1,2,3,4,5};
		subsequence(a,a.length);
		
	}
}
