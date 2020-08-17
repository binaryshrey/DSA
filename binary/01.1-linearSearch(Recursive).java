/*
    linearSearch - Recursive
    O(n)
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
		
		int res = linearSearch(arr,0,arr.length-1,x);
		if(res == -1)
		    System.out.println("Not found");
		else
		    System.out.println("Found at index : "+ res);
		
	}
	public static int linearSearch(int arr[], int l, int r, int x){
	    if(r>=l){
	        if(arr[l] == x)
	            return l;
	        if(arr[r] == x)
	            return r;
	        return linearSearch(arr,l+1,r-1,x);
	    }
	    return -1;
	    
	}
}
