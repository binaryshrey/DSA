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
		String str = sc.next();
		int count = 0;
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++){
		    if(ch[i]=='1'){
		        for(int j=i+1;j<ch.length;j++)
		            if(ch[j]=='1')
		                count+=1;
		    }
		}
		System.out.println(count);
	}
}
