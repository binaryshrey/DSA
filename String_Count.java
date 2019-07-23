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
		String str ="",str2="",search="";
		char ch;
		int c = 0;
		if(sc.hasNextLine()){
		    str = sc.nextLine();
		    search = sc.nextLine();
		}
		str = str+" ";
		for(int i=0;i<str.length();i++){
		    ch = str.charAt(i);
		    if(ch==' '){
		        if(search.equalsIgnoreCase(str2))
		            c+=1;
		        str2="";
		    }
		    else{
		        str2+= ch; 
		    }
		}
		System.out.println(c);
	}
}
