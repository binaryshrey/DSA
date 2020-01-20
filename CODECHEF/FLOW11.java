/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.DecimalFormat;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		DecimalFormat ft = new DecimalFormat("#.00");
		int T = sc.nextInt();
		for(int i =1;i<=T;i++){
		    double HRA = 0.0,DA = 0.0;
		    double sal = sc.nextDouble();
		    if((int)sal<1500){
		        HRA = 0.1*sal;
		        DA = 0.9*sal;
		    }
		    else{
		        HRA = 500;
		        DA = .98*sal;
		    }
		    double gross = sal+HRA+DA;
		    System.out.println(ft.format(gross));
		    
		    
		}
	}
}
