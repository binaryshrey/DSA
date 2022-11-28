/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void k_largest_sum_subarray(int arr[],int n,int k){
        int sum=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(k=i;k<=j;k++){
                    sum+=arr[k];
                }
                list.add(sum);
                sum=0;
            }
        }
        
        Collections.sort(list);
        System.out.println(list.get(k));
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
		k_largest_sum_subarray(arr,n,k);
	}
}
