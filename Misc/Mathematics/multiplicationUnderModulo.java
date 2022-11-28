/*You are given two numbers a and b. You need to find the multiplication of a and b under modulo M.
Note: Take M as 109+7*/
class Modulo
{
    static long multiplicationUnderModulo(long a, long b)
    {
        // add your code here
        long M = 1000000007;
        return ((a%M)*(b%M))%M;
    }
}

