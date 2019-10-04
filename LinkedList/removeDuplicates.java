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
    
    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        
    }
    public void duplicate(Node head){
        HashSet<Integer> hs = new HashSet<Integer>();
        
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            int curval = curr.data;
            if(hs.contains(curval)){
                prev.next = curr.next;
            }
            else{
                hs.add(curval);
                prev = curr;
            }
            curr = curr.next;
        }
        
        
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		LinkedList llist  = new LinkedList();
		llist.head = new Node(10);
		Node second = new Node(11);
		Node third = new Node(11);
		Node fourth = new Node(12);
		Node fifth = new Node(12);
		Node sixth = new Node(10);
		Node seventh = new Node(11);
		
		
		llist.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		
		llist.printList();
		System.out.println();
		
		llist.duplicate(llist.head);
		llist.printList();
		
		
	}
}
