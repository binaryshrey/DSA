/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void min(String s1,String s2){
        int min_pos = 0;
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i] && ch1[i]!='?' && ch2[i]!='?')
                min_pos+=1;
                
        }
        System.out.print(min_pos+" ");
        
    }
    
    public static void max(String s1,String s2){
        int max_pos = 0;
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]!='?' && ch1[i]==ch2[i])
                max_pos+=1;
                
        }
        System.out.print(ch1.length-max_pos);
        
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=1;i<=T;i++){
		    String s1 = sc.next();
		    String s2 = sc.next();
		    s1 = s1.toLowerCase();
		    s2 = s2.toLowerCase();
		    min(s1,s2);
		    max(s1,s2);
		    System.out.println();
		}
	}
}
