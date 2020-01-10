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
		int j=0,c=0;
		int T = sc.nextInt();
		for(int i=1;i<=T;i++){
		    double n = sc.nextDouble();
		    int deno[] = new int[]{100,50,10,5,2,1};
		    while(n>0){
		        if(n>=deno[j]){
		            n = n-deno[j];
		            c+=1;
		        }
		        else
		            j++;
		    }
		    System.out.println(c);
		    c=0;
		    j=0;
		}
		
	}
}
