// Last updated: 7/9/2026, 9:15:47 AM
class Solution {
    public int singleNumber(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int a=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    a++;
                }
            }
            if(a==1){
                c=nums[i];
            }
        }
        return c;
    }
}