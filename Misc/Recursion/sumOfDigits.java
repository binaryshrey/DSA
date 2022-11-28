/* You are given a number n. You need to find the sum of digits of n. */
int sumOfDigits(int n)
{
    //Your code 
    if(n<10)
        return n;
    return (sumOfDigits(n/10) + (n%10));
       
}
