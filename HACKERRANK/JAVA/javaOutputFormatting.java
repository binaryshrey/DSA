import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                int len = 15-s1.length();
                for(int j=0;j<len;j++){
                    s1=s1+" ";
                }
                
                if(x<10){
                    System.out.println(s1+"00"+x);
                }
                else if(x>=10 && x<=99)
                    System.out.println(s1+"0"+x);
                else{
                    System.out.println(s1+x);
                }
            }
            System.out.println("================================");

    }
}




