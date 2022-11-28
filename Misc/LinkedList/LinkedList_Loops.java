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
    
    public void push_beg(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
        
    }
    
    public void detectLoop(){
        Node fast = head;
        Node slow = head;
        if(head!=null){
            while(fast!=null && fast.next!=null){
                fast = fast.next.next;
                slow = slow.next;
                if(slow==fast){
                    System.out.println("Loop found");
                    return;
                }
            }
        }
        System.out.println("Not found");
    }
   

    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		LinkedList llist = new LinkedList();
		llist.push_beg(10);
		llist.push_beg(20);
		llist.push_beg(30);
		llist.push_beg(40);
		llist.push_beg(50);
		
		llist.head.next.next.next.next.next = llist.head; 
		
		llist.detectLoop();
	
		
	}
}
