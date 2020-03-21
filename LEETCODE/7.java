/** Given a 32-bit signed integer, reverse digits of an integer.
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−2^31,  2^31 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows. */


class Solution {
    public int reverse(int x) {
        boolean pos = true;
        if(x<0){
            pos = false;
            x = -x;
        }
        
        long res = 0;
        while(x!=0){
            res = res*10 + x%10;
            x/=10;
        }
        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) return 0;
        return pos ? (int)res : -(int)(res);
    }
}
