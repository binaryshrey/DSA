/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LinkedList
{
    Node head;
    static class Node{
        int data;
        Node next;
        
        Node(int d){
            data = d;
            next = null;
        }
    }
    
    void push_mid(Node prev_node, int new_data){
        Node new_node = new Node(new_data);
        
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }
    
    void print(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		LinkedList llist = new LinkedList();
		llist.head = new Node(12);
		Node second = new Node(24);
		Node third = new Node(36);
		Node fourth = new Node(48);
		
		llist.head.next = second;
		second.next = third;
		third.next = fourth;
		
		llist.print();
		llist.push_mid(second,30);
		llist.print();
		
		
	}
}
