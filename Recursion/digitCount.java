/*You are given a number n. You need to find the count of digits in n.*/

class Digitcount
{
    // complete the below function
    public static int countDigits(int n)
    {
        // add your code here
        if(n<10)
            return 1;
        return 1 + countDigits(n/10);
    }
}
