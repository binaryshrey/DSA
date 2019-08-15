class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum = nums[i];
            for(int j=i+1;j<nums.length;j++){
                sum+=nums[j];
                if(sum == target){
                    res[0]=i;
                    res[1]=j;
                    break;
                }
                else
                    sum = nums[i];   
            }
            sum = 0;
        }
        return res;
    }
}
