/*
    exponentialSearch
    O(logn)
    O(1) - Space
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
		
		int res = exponentialSearch(arr,arr.length,x);
		if(res < 0)
		    System.out.println("Not found");
		else
		    System.out.println("Found at index : "+ res);
		
	}
	public static int exponentialSearch(int arr[], int n, int x){
	    
	    if(arr[0] == x) 
	        return 0;
	   
	    int i = 1;
	    while(i< n && arr[i] <= x)
	        i = i*2;

        return Arrays.binarySearch(arr,i/2,Math.min(i,n),x);
	   

	    
	    
	}
}
