/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int msis(int arr[], int n){
        int msis[] = new int[n];
        int max=0;
        for(int i=0;i<n;i++)
            msis[i]=arr[i];
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j] && msis[i]<msis[j]+arr[i])
                    msis[i]=msis[j]+arr[i];
            }
        }
        for(int i=0;i<n;i++)
            if(max<msis[i])
                max= msis[i];
        return max;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 }; 
        int n = arr.length; 
        System.out.println("Maximum Sum Increasing Subsequence is " + msis( arr, n ));
	}
}
