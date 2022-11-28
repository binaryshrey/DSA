/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class Node{
    Node left,right;
    int key;
    
    public Node(int data){
        key = data;
        left = right =null;
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
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BinaryTree tree = new BinaryTree();
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		
	}
}
