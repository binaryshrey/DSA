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
		String str1 ="",str2="";
		char ch1,ch2;
		int c = 0;
		if(sc.hasNextLine()){
		    str1 = sc.nextLine();
		    str2 = sc.nextLine();
		}
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		if(str1.length()==str2.length()){
		    for(int i=0;i<str1.length();i++){
		        ch1 = str1.charAt(i);
		        
		        for(int j=0;j<str2.length();j++){
		            ch2 = str2.charAt(j);
		            if(ch1==ch2){
		                c+=1;
		                break;   
		            }
		               
		        }
		    }
		    if(c==str1.length())
		        System.out.println("Anagram");
		    else
		        System.out.println("Not Anagram");
		}
		
		
		
	}
}
