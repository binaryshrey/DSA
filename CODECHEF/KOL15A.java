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
		int T = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=T;i++){
		    String str = sc.next();
		    str = str.toLowerCase();
		    for(int j=0;j<str.length();j++){
		        char ch = str.charAt(j);
		        if((int)ch>=48 && (int)ch<=57)
		            sum+=(int)ch - 48;
		        
		    }
		    System.out.println(sum);
		    sum = 0;
		}
	}
}
