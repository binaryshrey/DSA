/** Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n). */

class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
            hs.add(nums[i]);
        
        ArrayList<Integer> al = new ArrayList<Integer>(hs);
        Collections.sort(al);
        if(al.size()<3)
            return al.get(al.size()-1);
        else
            return al.get(al.size()-3);
        
    }
}
