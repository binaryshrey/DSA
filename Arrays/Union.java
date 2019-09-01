/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void Union(int arr1[],int arr2[],int n1, int n2){
        Set<Integer> s = new HashSet<Integer>();
        for(int i=0;i<n1;i++)
            s.add(arr1[i]);
        for(int i=0;i<n2;i++)
            s.add(arr2[i]);
        Iterator<Integer> it = s.iterator();
        while(it.hasNext())
            System.out.println(it.next());
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
		Union(arr1,arr2,n1,n2);
		 
		    
	}
}
