/*You are given two numbers a and b. You need to find the sum of a and b under modulo M.
Note: Take M as 109+7*/
class Modulo {
    public static long sumUnderModulo(long a, long b)
    {
        int M=1000000007;
        
        return(((a%M)+(b%M))%M);
    }   
}

