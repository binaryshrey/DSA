/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int V = 4;
    
    public static boolean isBipartiteUtil(int graph[][],int src,int colorArr[]){
        colorArr[src] = 1;
        
        LinkedList<Integer> q = new LinkedList<Integer>();
        q.add(src);
        
        while(q.size()!=0){
            int u = q.poll();
            
            if(graph[u][u]==1)
                return false;
            
            for(int v=0;v<V;v++){
                if(graph[u][v]==1 && colorArr[v]==-1){
                    colorArr[v] = 1-colorArr[u];
                    q.add(v);
                }
                else if(graph[u][v]==1 && colorArr[v]==colorArr[u])
                    return false;
            }
        }
        return true;
        
        
    }
    
    public static boolean isBipartite(int graph[][]){
        int colorArr[] = new int[V];
        for(int i = 0;i<V;i++)
            colorArr[i] = -1;
        
        for(int i=0;i<V;i++){
            if(colorArr[i]==-1){
                if(isBipartiteUtil(graph,i,colorArr)==false)
                    return false;
            }
        }
        return true;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int G[][] = {{0, 1, 0, 1}, 
                     {1, 0, 1, 0}, 
                     {0, 1, 0, 1}, 
                     {1, 0, 1, 0}}; 
        if(isBipartite(G))
            System.out.println("Yes");
        else
            System.out.println("No");
	}
	
	
}
