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
		for(int i=str.length()-1;i>=0;i--){
		   ch = str.charAt(i);
		   str2+= ch;
		}
		if(str.equals(str2))
		    System.out.println("Palindrome");
		else
		    System.out.println("Not Palindrome");
	}
}
