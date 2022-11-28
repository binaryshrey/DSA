/* 
    binarySearch - Iterative
    O(log n)

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
		
		int arr[] = new int[]{2,45,67,556,675,789,2234,5646,69703};
		int res = binarySearch(arr,0,arr.length-1,x);
		if(res == -1)
		    System.out.println("Not found");
		else
		    System.out.println("Index : "+ res);
		
	}
	
	public static int binarySearch(int arr[], int l, int r, int x){
	    while(r>=l){
	        int mid = l + (r-l)/2;
	        
	        if(arr[mid] == x)
	            return mid;
	        else if(x > arr[mid])
	            l = mid+1;
	        else 
	            r = mid-1;
	    }
	    return -1;
	}
}


