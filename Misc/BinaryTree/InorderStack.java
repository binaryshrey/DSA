/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Node{
    int key;
    Node left,right;
    public Node(int d){
        key = d;
        left = right = null;
    }
}

class BinaryTree
{
    Node root;
    
    BinaryTree(int d){
        root = new Node(d);
    }
    BinaryTree(){
        root = null;
    }
    
    public static void InOrder(Node root){
        Stack<Node> s  = new Stack<Node>();
        Node curr = root;
        
        while(curr!=null||s.size()>0){
            while(curr!=null){
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            System.out.print(curr.key+" ");
            curr = curr.right;
        }
        
        
        
    }
    
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        
       
        System.out.print("InOrder: ");
        InOrder(tree.root);
        
        
  
		
		
	
	    
	}
}
