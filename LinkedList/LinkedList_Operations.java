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
    
    public void push_Nth(int pos, int new_data){
        Node prev_node = head;
        for(int i=0;i<pos-1;i++){
            prev_node = prev_node.next;
        }
        
        if(prev_node==null)
            return;
        
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
        
    }
    
    public void push_end(int new_data){
        if(head==null){
            head = new Node(new_data);
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = null;
        
        Node temp = head;
        while(temp.next!=null)
            temp = temp.next;
        
        temp.next = new_node;
        
    }
    
    public void pop(int pos){
        if(head==null)
            return;
        
        Node temp = head;
            
        if(pos == 0){
            head = temp.next;
            return;
        }
        
        for(int i=0;i<pos-1 && temp!=null;i++)
            temp = temp.next;
        if(temp==null|| temp.next==null)
            return;
        Node next = temp.next.next;
        temp.next = next;
        
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
		llist.push_Nth(3,999);
		llist.display();
		
		llist.push_end(777);
		llist.display();
		
		llist.pop(3);
		llist.display();
		
	}
}
