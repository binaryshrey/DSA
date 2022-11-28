/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int largestSumContiguousIncreasingSubarray(int arr[],int n){
        int result = Integer.MIN_VALUE, curr_val = 0;
        for(int i=0;i<n;i++){
            curr_val = arr[i];
            while(i+1<n && arr[i+1]>arr[i]){
                curr_val+=arr[i+1];
                i++;
            }
            if(result<curr_val)
                result = curr_val;
        }
        return result;
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int arr[] = {1, 1, 4, 7, 3, 6}; 
		System.out.println(largestSumContiguousIncreasingSubarray(arr,arr.length));
	}
}
