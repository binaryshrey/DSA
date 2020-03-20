/** Given a non-negative integer num, return the number of steps to reduce it to zero. If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it. */


class Solution {
    public int numberOfSteps (int num) {
        int count = 0;
        while(num!=0){
            num = reduce(num);
            count+=1;
            
        }
        return count;
    }
    public int reduce(int num){
        if(num%2==0)
            return num/2;
        else
            return num-1;
    }
}
