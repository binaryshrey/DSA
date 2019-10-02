/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void printLargest(Vector<String> arr){
        Collections.sort(arr,new Comparator<String>(){
            @Override
            public int compare(String X, String Y){
                String XY = X+Y;
                String YX = Y+X;
                
                return XY.compareTo(YX) > 0 ? -1:1;
                
            }
        });
        
        Iterator it = arr.iterator();
        while(it.hasNext())
            System.out.print(it.next());
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Vector<String> arr = new Vector<>();
		arr.add("54"); 
        arr.add("546"); 
        arr.add("548"); 
        arr.add("60"); 
        printLargest(arr); 
	}
}
