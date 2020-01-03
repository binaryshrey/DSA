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
		int t=0,n=0,m=0;
		t = sc.nextInt();
		if(t>=1 && t<=64){
		    for(int i=1;i<=t;i++){
		        n = sc.nextInt();
		        m = sc.nextInt();
		        if(n>=1 && m>=1 && n<=8 && m<=8){
		            System.out.println((n*m)-(n+m)+1);
		        }
		    }
		}
	}
}
