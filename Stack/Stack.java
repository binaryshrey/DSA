/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void stack_push(Stack<Integer> stack){
        System.out.println("Pushed Elements: ");
        for(int i=0;i<5;i++){
            stack.push(i);
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
	public static void stack_pop(Stack<Integer> stack){
        System.out.println("Poped Element: ");
        for(int i=0;i<5;i++){
            Integer z = (Integer)stack.pop();
            System.out.print(z+" ");
        }
        System.out.println();
    }
	public static void stack_peek(Stack<Integer> stack){
       
        Integer x = (Integer)stack.peek();
        System.out.println("Top Element :"+x);
    }   
    public static void stack_search(Stack<Integer> stack, int n){
        Integer y = (Integer)stack.search(n);
        if(y==-1)
            System.out.println("Not found");
        else
            System.out.println("Found at :"+y);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Stack<Integer> stack = new Stack<Integer>();
		stack_push(stack);
		stack_pop(stack);
		stack_push(stack);
		stack_peek(stack);
		stack_search(stack,2);
		stack_search(stack,10);
	}
}
