/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void leftRotate(int arr[],int k,int n){
        int mod = k%n;
        for(int i=0;i<n;i++)
            System.out.print(arr[(i+mod)%n]+" ");
            
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int arr[] = new int[]{2,4,6,8,10};
		int k = 2;
		int n = arr.length;
		
		leftRotate(arr,k,n);
	}
}
