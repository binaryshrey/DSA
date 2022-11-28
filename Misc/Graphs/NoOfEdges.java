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
        Graph(int V){
            this.V = V;
            adjListArray = new LinkedList[V];
            for(int i=0;i<V;i++)
                adjListArray[i] = new LinkedList<>();
        }
    }
    
    public static void addEdge(Graph graph,int src, int des){
        graph.adjListArray[src].add(des);
        graph.adjListArray[des].add(src);
    }
    
    public static void countEdges(Graph graph){
        int size=0;
        for(int i=0;i<graph.V;i++)
            size+=graph.adjListArray[i].size();
        System.out.println(size/2);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int V = 9;
		Graph graph = new Graph(V);
		addEdge(graph,0, 1 ); 
        addEdge(graph,0, 7 ); 
        addEdge(graph,1, 2 ); 
        addEdge(graph,1, 7 ); 
        addEdge(graph,2, 3 ); 
        addEdge(graph,2, 8 ); 
        addEdge(graph,2, 5 ); 
        addEdge(graph,3, 4 ); 
        addEdge(graph,3, 5 ); 
        addEdge(graph,4, 5 ); 
        addEdge(graph,5, 6 ); 
        addEdge(graph,6, 7 ); 
        addEdge(graph,6, 8 ); 
        addEdge(graph,7, 8 ); 
        
        countEdges(graph);
	}
}
