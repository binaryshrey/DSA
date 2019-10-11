/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void count(int val,int deno[],int n){
        ArrayList<Integer> ans = new ArrayList<>(); 
        
        for(int i=n-1;i>=0;i--){
            while(val>=deno[i]){
                val-=deno[i];
                ans.add(deno[i]);
            }
        }
        for (int i=0;i<ans.size();i++) 
        { 
            System.out.print(" " + ans.get(i)); 
        } 
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int rupee = 121;
		int deno[] = new int[]{1,2,5,10,50,100,500,1000};
		
		count(rupee,deno,deno.length);
		
		
	}
}
