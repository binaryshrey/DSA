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
		int N =0;
		if(sc.hasNextInt())
		    N=sc.nextInt();
		if(N>=0 && N<=100000)
		    System.out.print(N);
	}
}
