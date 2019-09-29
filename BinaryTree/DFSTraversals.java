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
    
    public static void preOrder(Node root){
        Node temp = root;
        
        if(temp == null)
            return;
        System.out.print(temp.key+" ");
        preOrder(temp.left);
        preOrder(temp.right);
        
    }
    
	public static void inOrder(Node root){
        Node temp = root;
        
        if(temp == null)
            return;
        inOrder(temp.left);
        System.out.print(temp.key+" ");
        inOrder(temp.right);
        
    }
    
    public static void postOrder(Node root){
        Node temp = root;
        
        if(temp == null)
            return;
        
        postOrder(temp.left);
        postOrder(temp.right);
        System.out.print(temp.key+" ");
        
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
        
        preOrder(tree.root);
        System.out.println();
        
        inOrder(tree.root);
        System.out.println();
        
        postOrder(tree.root);
        System.out.println();
        
        
        
		
	}
}
