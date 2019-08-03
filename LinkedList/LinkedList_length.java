/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LinkedList
{
    
    Node head;
    
    static class Node{
        Node next;
        int data;
        
        public Node(int d){
            data = d;
            next = null;
        }
    }
    
    public void display(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public void push_beg(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
        
    }
    public void length(){
        Node n = head;
        int count = 0;
        if(n==null){
            System.out.println(count);
            return;
        }
        while(n!=null){
            count+=1;
            n=n.next;
        }
        System.out.println(count);
        
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		LinkedList llist = new LinkedList();
		llist.push_beg(10);
		llist.push_beg(20);
		llist.push_beg(30);
		llist.push_beg(40);
	
		llist.display();
	
	    llist.length();
	
	}
}
