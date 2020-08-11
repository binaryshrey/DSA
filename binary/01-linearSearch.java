/*
    linearSearch
    O(n)
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int arr[] = new int[]{3,5,2,4,64,23,56,34};
		int res = linearSearch(arr, x);
		if(res == -1)
		    System.out.println("Not found");
		else
		    System.out.println("Index :"+ res);
	}
	
	public static int linearSearch(int arr[], int x){
	    for(int i=0;i<arr.length;i++){
	        if(arr[i] == x)
	            return i;
	    }
	    return -1;
	}
}
