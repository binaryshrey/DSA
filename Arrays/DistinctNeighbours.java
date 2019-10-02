/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void distinct(int a[], int n){
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(m.containsKey(a[i])){
                int x = m.get(a[i])+1;
                m.put(a[i],x);
            }
            else
                m.put(a[i],1);
        }
        int max = 0;
        for(int i=0;i<n;i++){
            if(max<m.get(a[i]))
                max = m.get(a[i]);
        }
        if(max>(n+1)/2)
            System.out.println("NO");
        else
            System.out.println("YES");
        
        
        
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		    arr[i] = sc.nextInt();
		distinct(arr,n);
	}
}
