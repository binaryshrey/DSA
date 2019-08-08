/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int InterpolationSearch(int arr[],int x){
        int lo = 0,hi = arr.length-1;
        while(hi>=lo && x>=arr[lo] && x<=arr[hi]){
            if(hi==lo)
            {
                if(arr[lo]==x)
                    return lo;
            }
            int pos = lo +(((hi-lo)/(arr[hi]-arr[lo]))*(x-arr[lo]));
            if(arr[pos]==x)
                return pos;
            if(arr[pos]>x)
                hi = pos-1;
            else
                lo = pos+1;
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
		
		int result = InterpolationSearch(arr,key);
		
		if(result==-1)
		    System.out.println("Not found");
		else
		    System.out.println("Found at index :"+result);
	}
}
