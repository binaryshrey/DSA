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
    
    void push(int new_data){
        Node new_node = new Node(new_data);
        
        new_node.next = head;
        head = new_node;
    }
    
    void print(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.println();
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		LinkedList llist = new LinkedList();
		llist.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		
		llist.head.next = second;
		second.next = third;
		
		llist.print();
		
		llist.push(100);
		
		llist.print();
		
	}
}
