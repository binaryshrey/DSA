/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void sum(int n){
        int d=0,s=0;
        while(n>0){
            d = n%10;
            s+=d;
            n=n/10;
        }
        if(s>9)
            sum(s);
        else if(s==1)
            System.out.println("Magic Number");
        else
            System.out.println("Not Magic Number");
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int no=0;
		if(sc.hasNextInt())
		    no = sc.nextInt();
		sum(no);
	}
}
