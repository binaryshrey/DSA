/*For a given number N check if it is prime or not. A prime number is a number which is only divisible by 1 and itself*/
class Primality 
{
    
    public boolean isPrime(int N)
    {
      //Your code here
      int count = 0;
      for(int i=1;i<=((int)(Math.sqrt(N)));i++){
          if(N%i == 0)
              count+=1;
      }
      if(count==1)
        return true;
      return false;    
    }

}
