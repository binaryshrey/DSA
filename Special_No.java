/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int fibo(int no){
        int fib = 1;
        for(int i=1;i<=no;i++){
            fib*=i;
        }
        return fib;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = 0,d=0,sum=0;
		if(sc.hasNextInt())
		    n = sc.nextInt();
		int num=n;
		while(n>0){
		   d = n%10;
		   sum+= fibo(d);
		   n = n/10;
		}
		if(num == sum && num!=0)
		    System.out.println("Special Number");
		else
		    System.out.println("Not Special");
	}
}
