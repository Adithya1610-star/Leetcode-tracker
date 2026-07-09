// Last updated: 7/9/2026, 9:16:20 AM
class Solution {
    public int search(int[] nums, int target) {
        int j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                j=i;
            }
            
        }
        return j;
    }
}