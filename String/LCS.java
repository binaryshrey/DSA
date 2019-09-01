/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int lcs(char X[],char Y[], int m,int n){
        if(m==0||n==0)
            return 0;
        if(X[m-1]==Y[n-1])
            return 1+lcs(X,Y,m-1,n-1);
        else
            return max(lcs(X,Y,m-1,n),lcs(X,Y,m,n-1));
        
    }
    public static int max(int a, int b){
        return (a>b)?a:b;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		int m = ch1.length;
		int n = ch2.length;
		System.out.println(lcs(ch1,ch2,m,n));
	}
}
