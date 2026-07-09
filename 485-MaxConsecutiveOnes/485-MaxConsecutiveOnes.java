// Last updated: 7/9/2026, 9:14:42 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount=0,count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) count++;
            else{
                maxCount=Math.max(maxCount,count);
                count=0;
            }
        }
        maxCount=Math.max(maxCount,count);
        return maxCount;
    }
}