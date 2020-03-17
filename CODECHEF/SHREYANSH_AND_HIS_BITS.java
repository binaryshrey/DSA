/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int[] _01(String str){
        int arr[] = {0,0};
        for(int i=0;i<str.length();i++){
		    char ch = str.charAt(i);
		    if(ch=='0')
		        arr[0]+=1;
		    else
		        arr[1]+=1;
		}
		return arr;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int count = 0;
		double n = sc.nextDouble();
		String binary = Integer.toBinaryString((int)n);
		int len = binary.length();
		
		int count_01[] = _01(binary);
		
		for(int i=1;i<n;i++){
		    String str = String.format("%" + len + "s", Integer.toBinaryString(i)).replaceAll(" ", "0");
		    int count__01[] = _01(str);
		    if(count_01[0]==count__01[0] && count_01[1]==count__01[1])
		        count+=1;
		}
		
		System.out.println(count);
	}
}
