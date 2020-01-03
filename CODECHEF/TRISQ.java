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
		for(int i=1;i<=T;i++){
		    int b = sc.nextInt();
		    b = b-2;
		    b = b/2;
		    System.out.println(b*(b+1)/2);
		}
	}
}
