/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int ExpSearch(int arr[], int x){
        int n = arr.length;
        if(arr[0]==x)
            return 0;
        int i=1;
        while(i<n && arr[i]<=x)
            i=i*2;
        
        return Arrays.binarySearch(arr,i/2,Math.min(i,n),x);
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
		//Arrays.sort(arr);
		
		int result = ExpSearch(arr,key);
		
		if(result==-1)
		    System.out.println("Not found");
		else
		    System.out.println("Found at index :"+result);
	}
}
