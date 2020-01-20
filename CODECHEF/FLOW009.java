/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.DecimalFormat;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		DecimalFormat ft = new DecimalFormat("#.000000");
		int T = sc.nextInt();
		for(int i=1;i<=T;i++){
		    double q = sc.nextInt();
		    double p = sc.nextInt();
		    double total = q*p;
		    if((int)q>1000)
		        total-=0.1*total;
		    System.out.println(ft.format(total));
		    total = 0;
		}
	}
}
