/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
//Time Complexity : O(logn)
class Codechef
{
    
    public static int ExponentialSearch(int arr[],int n,int x){
        if(arr[0]==x)
            return 0;
        int i=1;
        if(i<n && arr[i]<=x)
            i = i*2;
        return Arrays.binarySearch(arr,i/2,Math.min(i,n),x);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
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
		int result = ExponentialSearch(arr,arr.length,key);
		if(result==-1)
		    System.out.println("Not found");
		else
		    System.out.println("Found at index :"+result);
		
	}
}
