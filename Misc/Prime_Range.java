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
		int start = 0,end = 0,c = 0,no = 0;
		if(sc.hasNextInt()){
		    start = sc.nextInt();
		    end = sc.nextInt();
		}
		for(int i=start;i<=end;i++){
		    for(int j=2;j<=i;j++)
		        if(i%j==0)
		            c+=1;
		    if(c==1)
		        System.out.println(i);
		    c=0;
		}
	}
}
