/*
    jumpSearch
    O(n^1/2)
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
		
		int res = jumpSearch(arr,arr.length,x);
		if(res == -1)
		    System.out.println("Not found");
		else
		    System.out.println("Found at index : "+ res);
		
	}
	public static int jumpSearch(int arr[], int n, int x){
	    
	    int step = (int)Math.floor(Math.sqrt(n));
	    
	    int prev = 0;
	    while(arr[Math.min(step,n)-1] < x){
	        prev = step;
	        step+= (int)Math.floor(Math.sqrt(n));
	        if(prev >= n)
	            return -1;
	    }
	    
	    while(arr[prev] < x){
	        prev+= 1;
	        
	        if(prev == Math.min(step,n))
	            return -1;
	    }
	    if(arr[prev] == x)
	        return prev;
	        
	    return -1;
	    
	    
	    
	    
	    
	    
	    
	    
	}
}
