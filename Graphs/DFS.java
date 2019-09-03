/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static class Graph{
        int V;
        LinkedList<Integer> adjListArray[];
    
        Graph(int V){
            this.V=V;
            adjListArray = new LinkedList[V];
            for(int i=0;i<V;i++)
                adjListArray[i] = new LinkedList<>();
        }
    }
    
    public static void addEdge(Graph graph,int src, int des){
        graph.adjListArray[src].add(des);
        graph.adjListArray[des].add(src);
    }
    
    public static void DFS(Graph graph,int s){
        boolean visited[] = new boolean[graph.V];
        DFS_util(graph,s,visited);
    }
    public static void DFS_util(Graph graph,int s, boolean visited[]){
        visited[s] = true;
        System.out.print(s+" ");
        Iterator<Integer> i = graph.adjListArray[s].listIterator();
        while(i.hasNext()){
            int n = i.next();
            if(!visited[n]){
                DFS_util(graph,n,visited); 
            }
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int V = 5;
		Graph graph = new Graph(V);
		addEdge(graph, 0, 1); 
        addEdge(graph, 0, 4); 
        addEdge(graph, 1, 2); 
        addEdge(graph, 1, 3); 
        addEdge(graph, 1, 4); 
        addEdge(graph, 2, 3); 
        addEdge(graph, 3, 4); 
        
        DFS(graph,2);
	}
}
