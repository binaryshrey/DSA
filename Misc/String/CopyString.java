/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void copy(char ch1[], char ch2[]){
        for(int i=0;i<ch1.length;i++)
            ch2[i]=ch1[i];
        System.out.println(String.valueOf(ch2));
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String s1 = "Hello";
		char ch1[] = s1.toCharArray();
		char ch2[] = new char[s1.length()];
		copy(ch1,ch2);
	}
}
