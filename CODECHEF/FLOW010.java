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
		
		int T=0;
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt())
		    T = sc.nextInt();
		
		for(int i =1 ;i<=T;i++){
		
		    char ch = sc.next().charAt(0);
		if(ch=='B' || ch=='b')
		    System.out.println("BattleShip");
		else if(ch=='C' || ch=='c')
		    System.out.println("Cruiser");
		if(ch=='D' || ch=='d')
		    System.out.println("Destroyer");
		if(ch=='F' || ch=='f')
		    System.out.println("Frigate");
		}
		
	}
}
