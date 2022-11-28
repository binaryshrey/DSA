/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static boolean pangram(String str){
        char ch='a'; 
        for(int i=0;i<str.length();i++){
            ch = str.charAt(i);
            if(ch==' ')
                continue;
            if(!(ch>='a'&&ch<='z'))
                return false;
        }
        return true;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase();
		if(pangram(str))
		    System.out.println("pangram");
        else
            System.out.println("not pangram");
	}
}
