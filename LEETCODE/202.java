/** Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers. */

class Solution {
    public boolean isHappy(int n) {
        if(n==1 || n==7)
            return true;
        else if(n<10)
            return false;
        int sum = 0;
        while(n!=0){
            sum+=(n%10)*(n%10);
            n/=10;
        }
        return isHappy(sum);
        
    }  
}
