/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class InsertionSort
{
    public void ISort(int arr[]){
        int key = 0,j=0,n = arr.length;
        for(int i=0;i<n;i++){
            key = arr[i];
            j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1] = key;
        }
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		InsertionSort ob = new InsertionSort(); 
        int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
        ob.ISort(arr); 
	}
}
