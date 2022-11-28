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
    
    public void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        
    }
    public Node reverseK(Node head,int k){
        int count = 0;
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr!=null && count<k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if(next!=null)
            head.next = reverseK(next,k);
        
        return prev;
        
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int k=3;
		LinkedList llist  = new LinkedList();
		llist.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		Node five = new Node(50);
		Node six = new Node(60);
		Node seven = new Node(70);
		
		llist.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = five;
		five.next = six;
		six.next = seven;
	
	
		llist.printList(llist.head);
	    System.out.println();
	    
		llist.printList(llist.reverseK(llist.head,k));
	}
}
