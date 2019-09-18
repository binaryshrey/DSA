// O(n^3)

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int countTriangle(int a[][],boolean isDir){
        int count = 0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                    if(a[i][j]==1 && a[j][k]==1 && a[k][i]==1)
                        count+=1;
                }
            }
        }
        
        if(isDir == false)
            return count/6;
        else    
            return count/3;
        
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int un_graph[][] = {{0, 1, 1, 0}, 
                        {1, 0, 1, 1}, 
                        {1, 1, 0, 1}, 
                        {0, 1, 1, 0} 
                       }; 
      
       int di_graph[][] = { {0, 0, 1, 0}, 
                           {1, 0, 0, 1}, 
                           {0, 1, 0, 0}, 
                           {0, 0, 1, 0} 
                         }; 
                         
        System.out.println("No of traingles in the undirected graph = "+countTriangle(un_graph,false));
        System.out.println("No of traingles in the directed graph = "+countTriangle(di_graph,true));
	}
}
