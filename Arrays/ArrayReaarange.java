/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c=0;
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++){
		    for(int j=0;j<arr.length;j++){
		        if(i==arr[j]){
		            list.add(i);
		            c=1;
		            break;
		        }
		        
		    }
		    if(c==0){
		        list.add(-1);
		    }
		    c=0;
		}
		
		for(int i=0;i<list.size();i++){
		    System.out.print(list.get(i)+" ");
		}
		
	}
}
