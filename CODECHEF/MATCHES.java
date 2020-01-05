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
		int sum=0,d=0;
		int arr[] = new int[]{6,2,5,5,4,5,6,3,7,6};
		int T = sc.nextInt();
		for(int i=1;i<=T;i++){
		    double n1 = sc.nextInt();
		    double n2 = sc.nextInt();
		    int n = (int)(n1+n2);
		    while(n>0){
		        d = n%10;
		        sum+=arr[d];
		        n=n/10;
		        
		    }
		    System.out.println(sum);
		    sum=0;
		    
		}
	}
}
