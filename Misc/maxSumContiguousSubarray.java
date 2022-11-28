/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int maxSumContiguousSubarray(int arr[],int n){
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        
        for(int i=0;i<n;i++){
            max_ending_here+= arr[i];
            if(max_so_far<max_ending_here)
                max_so_far = max_ending_here;
            if(max_ending_here<0)
                max_ending_here = 0;
        }
    return max_so_far;
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a[] = {-2, -3, 4, -1, -2, 1, 5, -3}; 
		System.out.println(maxSumContiguousSubarray(a,a.length));
	}
}
