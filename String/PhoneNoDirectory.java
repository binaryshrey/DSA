/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void getNumber(String input,int n,String directory[]){
        String output = "";
        for(int i=0;i<n;i++){
            if(input.charAt(i)==' ')
                output+='0';
            else{
                int pos = input.charAt(i)-'A';
                output+= directory[pos];
            }
        }
        System.out.println(output);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String directory[] = {"2","22","222", 
                        "3","33","333", 
                        "4","44","444", 
                        "5","55","555", 
                        "6","66","666", 
                        "7","77","777","7777", 
                        "8","88","888", 
                        "9","99","999","9999"
                    }; 
        input = input.toUpperCase();
        getNumber(input,input.length(),directory);
	}
}
