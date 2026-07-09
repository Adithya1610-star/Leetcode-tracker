// Last updated: 7/9/2026, 9:14:14 AM
class Solution {
    public int repeatedNTimes(int[] nums) {
        int max=0;
        int res=0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c++;
                    if(c>max){
                        max=nums[i];
                       
                    }
                }
            }
        }
        return max;
    }
}