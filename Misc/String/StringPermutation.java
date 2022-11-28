/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void permute(String str ,int l ,int r){
        if(l==r)
            System.out.println(str);
        else{
            for(int i=l;i<=r;i++){
                str = swap(str,l,i);
                permute(str,l+1,r);
                str = swap(str,l,i);
            }
        }
    }
    
    public static String swap(String str, int i, int j){
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return(String.valueOf(ch));
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String str = "ABCD";
		int n = str.length();
		permute(str,0,n-1);
		
	}
}
