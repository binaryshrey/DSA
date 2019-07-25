/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
//Time Complexity : O(n)
class Codechef
{
    public static int LinearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
                return i;
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
		int result = LinearSearch(arr,key);
		if(result==-1)
		    System.out.println("Not found");
		else
		    System.out.println("Found at index :"+result);
	}
}
