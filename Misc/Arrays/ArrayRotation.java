/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void leftrot(int arr[],int d, int n){
        for(int i=0;i<d;i++){
            rot(arr,n);
        }   
    }
    
    public static void rot(int arr[], int n){
        int temp = arr[0];
        int i=0;
        for(i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[i]=temp;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int arr[] = new int[]{1,2,3,4,5,6,7};
		leftrot(arr,2,7);
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
