/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
//Time Complexity : O(n)
class Codechef
{
    public static int BinarySearch(int arr[],int l, int r, int x){
        
        if(r>=l){
	    int mid = l + (r-l)/2;
            if(arr[mid]==x)
                return mid;
            if(arr[mid]>x)
                return BinarySearch(arr,l,mid-1,x);
            
	    return BinarySearch(arr,mid+1,r,x);
        }
        return -1;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n=0,key=0;
		if(sc.hasNextInt())
		    n = sc.nextInt();
		    
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		if(sc.hasNextInt())
		    key = sc.nextInt();
		Arrays.sort(arr);
		//int res = Arrays.binarySearch(arr, key); 
		
		int result = BinarySearch(arr,0,n-1,key);
		
		if(result==-1)
		    System.out.println("Not found");
		else
		    System.out.println("Found at index :"+result);
	}
}
