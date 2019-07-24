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
		String str ="",str2="",str3="";
		char ch;
		if(sc.hasNextLine())
		    str = sc.nextLine();
		str = str+" ";
		for(int i=0;i<str.length();i++){
		    ch = str.charAt(i);
		    if(ch==' '){
		        for(int j=0;j<str2.length();j++){
		            if(str2.charAt(j)=='A'||str2.charAt(j)=='E'||str2.charAt(j)=='I'||str2.charAt(j)=='O'||str2.charAt(j)=='U'){
		                str3 = str3+" "+str2.substring(j)+str2.substring(0,j)+"AY";
		                
		                str2="";
		                break;
		            }
		        }
		    }
		    else{
		        str2+=ch;
		    }
		}
		System.out.println(str3);
		    
		
	}
}
