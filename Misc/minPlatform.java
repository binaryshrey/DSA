/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void minPlatform(int arr[],int dep[],int n){
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int plat_needed = 1,result = 1,i=1,j=0;
        
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                plat_needed++;
                i++;
                if(plat_needed>result)
                    result = plat_needed;
            }
            else{
                plat_needed--;
                j++;
            }
        }
        System.out.println(result);
        
        
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int arr[] = {900, 940, 950, 1100, 1500, 1800}; 
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000}; 
        minPlatform(arr,dep,arr.length);
	}
}
