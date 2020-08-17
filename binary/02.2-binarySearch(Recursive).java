/*
    binarySearch - Recursive
    O(logn)
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
		int arr[] = new int[]{2,5,4,345,543,567,1023};
		
		int res = binarySearch(arr,0,arr.length-1,x);
		if(res == -1)
		    System.out.println("Not found");
		else
		    System.out.println("Found at index : "+ res);
		
	}
	public static int binarySearch(int arr[], int l, int r, int x){
	    if(r>=l){
	        int mid = l + (r-l)/2;
	        
	        if(arr[mid] == x)
	            return mid;
	        if(x > arr[mid])
	            return binarySearch(arr,mid+1,r,x);
	        else
	            return binarySearch(arr,l,mid-1,x);
	            
	    }
	    return -1;
	    
	}
}
