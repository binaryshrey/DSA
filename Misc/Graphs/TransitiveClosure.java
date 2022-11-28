/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static class Graph{
        int V;
        LinkedList<Integer> adjListArray[];
        int tc[][];
        Graph(int V){
            this.V = V;
            this.tc = new int[this.V][this.V];
            adjListArray = new LinkedList[V];
            for(int i=0;i<V;i++)
                adjListArray[i] = new LinkedList<>();
            
            
        }
    }
    
    public static void addEdge(Graph graph,int src,int des){
        graph.adjListArray[src].add(des);
    }
    public static void transitiveClousure(Graph graph){
        for(int i=0;i<graph.V;i++)
            DFS_Util(graph,i,i);
        for(int i=0;i<graph.V;i++)
            System.out.println(Arrays.toString(graph.tc[i]));
    }
    public static void DFS_Util(Graph graph,int s,int v){
        graph.tc[s][v] = 1;
        
        for(int adj : graph.adjListArray[v]){
            if(graph.tc[s][adj]==0)
                DFS_Util(graph,s,adj);
        }
        
        
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int V = 4;
		Graph graph = new Graph(V);
		addEdge(graph,0, 1); 
        addEdge(graph,0, 2); 
        addEdge(graph,1, 2); 
        addEdge(graph,2, 0); 
        addEdge(graph,2, 3); 
        addEdge(graph,3, 3); 
        
        transitiveClousure(graph);
        
	}
}
