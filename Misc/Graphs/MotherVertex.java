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
    
    public static void addEdge(Graph graph, int src, int des){
        graph.adjListArray[src].add(des);
    }
    
    public static void DFS(Graph graph){
        boolean visited[] = new boolean[graph.V];
        for(int i=0;i<graph.V;i++)
            visited[i] = false;
        int v=-1;
        for(int i=0;i<graph.V;i++)
            if(visited[i] == false){
                DFS_Util(graph,i,visited);
                v=i;
            }
        
        for(int i=0;i<graph.V;i++)
            visited[i] = false;
        
        System.out.println("Mother Vertex detected at :"+v);
        
        DFS_Util(graph,v,visited);
        
        for(int i=0;i<graph.V;i++)
            if(visited[i]==false){
                System.out.println("No mother Vertex");
                return;
            }
        System.out.println("Mother vertex at :"+v);
        
    }
    
    public static void DFS_Util(Graph graph,int s,boolean visited[]){
        visited[s] = true;
        Iterator<Integer> i = graph.adjListArray[s].listIterator();
        while(i.hasNext()){
            int n = i.next();
            if(!visited[n])
                DFS_Util(graph,n,visited);
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int V = 7;
		Graph graph = new Graph(V);
		addEdge(graph,0, 1);
        addEdge(graph,0, 2);
        addEdge(graph,1, 3);
        addEdge(graph,4, 1);
        addEdge(graph,6, 4);
        addEdge(graph,6, 0);
        addEdge(graph,5, 2);
        addEdge(graph,5, 6);
        
        DFS(graph);
	}
}
