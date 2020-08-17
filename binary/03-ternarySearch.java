/*
    ternarySearch - Recursive
    O(logn with base 3)
*/

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
		int x = sc.nextInt();
		int arr[] = new int[]{2,4,5,345,543,567,1023};
		
		int res = ternarySearch(arr,0,arr.length-1,x);
		if(res == -1)
		    System.out.println("Not found");
		else
		    System.out.println("Found at index : "+ res);
		
	}
	public static int ternarySearch(int arr[], int l, int r, int x){
	    if(r>=l){
	        int mid1 = l + (r-l)/3;
	        int mid2 = mid1 + (r-l)/3;
	        
	        if(arr[mid1] == x)
	            return mid1;
	        if(arr[mid2] == x)
	            return mid2;
	       
	       if(x > arr[mid2])
	            return ternarySearch(arr, mid2+1,r,x);
	       if(x < arr[mid1])
	            return ternarySearch(arr,l,mid1-1,x);
	       return ternarySearch(arr,mid1+1,mid2+1,x);
	        
	            
	    }
	    return -1;
	    
	}
}
