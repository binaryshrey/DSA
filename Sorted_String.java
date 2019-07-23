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
		String str ="",str2="";
		char ch;
		if(sc.hasNextLine())
		    str = sc.nextLine();
		str = str.toUpperCase();
		
		for(int i=65;i<=90;i++){
		    for(int j=0;j<str.length();j++){
		        ch = str.charAt(j);
		        if(ch==(char)i)
		            str2+= ch;
		    }
		}
		System.out.println(str2);
	}
}
