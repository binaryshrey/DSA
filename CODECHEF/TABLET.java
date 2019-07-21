/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int T=0,N=0,B=0,W=0,P=0,H=0,max=0;
		
		if(sc.hasNextInt())
		    T = sc.nextInt();
		    
		if(T>=1 && T<=100)
		{
		    for(int i=1;i<=T;i++)
		    {
		        if(sc.hasNextInt())
		        {
		            N = sc.nextInt();
		            B = sc.nextInt();
		        }
		        if((N>=1 && N<=100) && (B>=1 && B<=1000000))
		        {
		            for(int j=1;j<=N;j++)
		            {
		                if(sc.hasNextInt())
		                {
		                    
		                    W = sc.nextInt();
		                    H = sc.nextInt();
		                    P = sc.nextInt();
		                }
		                
		                if(B>=P)
		                {
		                    if(max<=(W*H))
		                        max=W*H;
		                }
		                
		                
		                
		                
		            }
		            if(max>=1){
		                System.out.println(max);
		                max=0;
		                
		            }
		            else
		                System.out.println("no tablet");
		            
		        }
		        
		    }
		}
	}
}
