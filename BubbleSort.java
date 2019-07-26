/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
//TC : O(n),O(n^2),O(n^2)
//Stable
class Codechef
{
    void BubbleSort(int arr[]){
        int n = arr.length;
        int temp=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
	void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 

    public static void main (String[] args) throws java.lang.Exception
    { 
        Codechef ob = new Codechef(); 
        int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
        ob.BubbleSort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 
    } 
}
