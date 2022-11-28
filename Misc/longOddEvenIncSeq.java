/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int longOddEvenIncSeq(int arr[],int n){
        int lios[] = new int[n];
        int max = 0;
        for(int i=0;i<n;i++)
            lios[i] = 1;
        
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j] && (arr[i]+arr[j])%2!=0 && lios[i]<lios[j]+1){
                    lios[i] = lios[j]+1;
                
                }
            }
        }
        for(int i=0;i<n;i++)
            if(max<lios[i])
                max = lios[i];
        
        return max;
    }    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] arr = new int[]{ 1, 12, 2, 22,5, 30, 31, 14, 17, 11 }; 
		System.out.println(longOddEvenIncSeq(arr,arr.length));
	}
}
