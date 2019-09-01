/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void printString(String phno,int i,HashMap<Character, String> hm, StringBuilder str){
        if(i==phno.length())
        {
            System.out.println(str+" ");
            return;
        }
        String s = hm.get(phno.charAt(i));
        for(int j=0;j<s.length();j++){
            str.append(s.charAt(j));
            printString(phno,i+1,hm,str);
            str.deleteCharAt(str.length()-1);        
            
        }
    }
    
    public static void phoneNoPermute(String phno){
        HashMap<Character, String> hm = new HashMap<Character, String>();
        hm.put('2',"ABC");
        hm.put('3',"DEF");
        hm.put('4', "GHI"); 
        hm.put('5', "JKL"); 
        hm.put('6', "MNO"); 
        hm.put('7', "PQRS"); 
        hm.put('8', "TUV"); 
        hm.put('9', "WXYZ"); 
        hm.put('1', "1"); 
        hm.put('0', "0"); 
        
        StringBuilder str = new StringBuilder();
        
        printString(phno,0,hm,str);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		phoneNoPermute(a);
	}
}
