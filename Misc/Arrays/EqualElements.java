/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int count(int arr[] , int k){
        int res = 0;
        int n = arr.length;
        Arrays.sort(arr);
        int max = arr[n-1];
        for(int i=0;i<n;i++){
            if((max-arr[i])%k!=0){
                return -1;
            }
            else{
                res+=(max-arr[i])/k;
            }
        }
        return res;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		    arr[i] = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(count(arr,k));
	}
}
