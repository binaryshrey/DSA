/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int sinkNodes(int n,int m,int edgeFrom[],int edgeTo[]){
        int mark[] = new int[n+1];
        for(int i=0;i<m;i++)
            mark[edgeFrom[i]] = 1;
        int count=0;
        for(int i=0;i<mark.length;i++){
            if(mark[i]!=0)
                count+=1;
        }
        return count;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n = 4, m = 2; 
        int edgeFrom[] = { 2, 4 }; 
        int edgeTo[] = { 3, 3 }; 
        
        System.out.println("No of sink nodes = "+sinkNodes(n,m,edgeFrom,edgeTo));
	}
}
