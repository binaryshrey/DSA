/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int TernarySearch(int arr[],int l,int r,int k){
        
        if(r>=l){
            int mid1 = l+(r-l)/3;
            int mid2 = r-(r-l)/3;
            
            if(arr[mid1]==k)
                return mid1;
            if(arr[mid2]==k)
                return mid2;
            
            if(arr[mid1]>k)
                return TernarySearch(arr,l,mid1-1,k);
            else if(arr[mid2]<l)
                return TernarySearch(arr,mid2+1,r,k);
                
            return TernarySearch(arr,mid1+1,mid2-1,k);
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
		
		int result = TernarySearch(arr,0,n-1,key);
		
		if(result==-1)
		    System.out.println("Not found");
		else
		    System.out.println("Found at index :"+result);
	}
}
