/*Given two integers ‘a’ and ‘m’. The task is to find modular multiplicative inverse of ‘a’ under modulo ‘m’.
Note: Print the smallest modular multiplicative inverse.*/

class Modular 
{
    
  public int modInverse(int a, int m)
    {
      //Your code here
      int i=1;
       for(i=1;i<m;i++){
        if((a*i)%m==1)
            return i;
        }
    return -1;
    }

}
