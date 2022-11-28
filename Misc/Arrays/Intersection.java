/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    public static void Intersection(int arr1[],int arr2[],int n1,int n2){
        int i=0,j=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j])
                i++;
            else if(arr1[i]>arr2[j])
                j++;
            else {
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
                
                
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int arr1[] = new int[n1];
		int arr2[] = new int[n2];
		for(int i=0;i<n1;i++)
		    arr1[i] = sc.nextInt();
		for(int i=0;i<n2;i++)
		    arr2[i] = sc.nextInt();
		    
		Intersection(arr1,arr2,n1,n2);
	}
}
