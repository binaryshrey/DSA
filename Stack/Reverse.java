/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static Stack<Integer> st = new Stack<>();
    
    public static void insert_at_bottom(int x){
        if(st.isEmpty())
            st.push(x);
        else{
            int a = st.peek();
            st.pop();
            insert_at_bottom(x);
            
            st.push(a);
        }
    }
    
    public static void reverse(){
        if(st.size()>0){
            int x = st.peek();
            st.pop();
            reverse();
            
            insert_at_bottom(x);
        }
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		st.push(1);
	    st.push(2);
	    st.push(3);
	    st.push(4);
	    
	    System.out.println(st);
	    reverse();
	    System.out.println(st);
	}
}
