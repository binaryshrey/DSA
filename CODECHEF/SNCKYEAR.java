/* package codechef; // don't place package name! */

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
		int arr[] = new int[]{2010,2015,2016,2017,2019};
		int t=0,n=0,flag=0;
		t = sc.nextInt();
		for(int j=1;j<=t;j++){
		    n = sc.nextInt();
		    if(n>=2010 && n<=2019){
		        flag=0;
		        for(int i=0;i<arr.length;i++){
		        if(n==arr[i]){
		            System.out.println("HOSTED");
		            flag=1;
		            break;
		        }
		    }
		    if(flag==0)
		        System.out.println("NOT HOSTED");
		    }
		    
		}
	}
}
