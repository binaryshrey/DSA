/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */


class BinaryTree
{
    public static int search(int x,int arr[]){
        int found = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                found=i;
                break;
            }
        }
        return found;
    }
    
    public static void postOrder(int in[],int pre[]){
        int root = search(pre[0],in);
        for(int i=0;i<root;i++)
            System.out.print(in[i]);
        for(int i=in.length-1;i>root;i--)
            System.out.print(in[i]);
        System.out.print(in[root]);
        
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int in[] = { 4, 2, 5, 1, 3, 6 }; 
        int pre[] = { 1, 2, 4, 5, 3, 6 }; 
        
        postOrder(in,pre);
		
		
		
		
	}
}
