/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SelectionSort
{
    public void SSort(int arr[]){
        int n = arr.length, min=0,temp=0;
        for(int i=0;i<n-1;i++){
            min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min])
                    min = j;
            }
            
            temp = arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		SelectionSort ob = new SelectionSort(); 
        int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
        ob.SSort(arr); 
	}
}
