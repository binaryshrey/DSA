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
		int T=1,N=3;
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt())
		    T = sc.nextInt();
		    
		if(T>=1 && T<=100){
		    for(int j=1;j<=T;j++){
		        int def = -1;
		        if(sc.hasNextInt())
		            N = sc.nextInt();
		            
		        if(N>=3 && N<=100){
		            int a[] = new int[N];
		            int d[] = new int[N];
		            
		            for(int i=0;i<N;i++)
    		            if(sc.hasNextInt())
	    	                a[i] = sc.nextInt();
	    	                
		            for(int i=0;i<N;i++)
		                if(sc.hasNextInt())
	                        d[i] = sc.nextInt();
		
		            for(int i=0;i<N;i++){
		                
		                
		            if(i>=1 && i<(N-1) && d[i]>(a[i-1]+a[i+1]) && d[i]>=def)
		                def = d[i];
		            
		            else if(i==0 && d[0]>(a[N-1]+a[1]) && d[0]>=def)
				        def=d[i];
			        else if(i==(N-1) && d[N-1]>(a[0]+a[N-2]) && d[N-1]>=def)
				        def=d[i];
		            }
		            System.out.println(def);
		            
		    
	    	        
		        }
		    }
        }
	}
}
