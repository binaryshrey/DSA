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
    
    void print(){
        Node n=head;
        while(n!=null){
            System.out.println(n.data+" ");
            n = n.next;
        }
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
	}
}
