// Last updated: 7/9/2026, 9:15:12 AM
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
                  if(nums[i]!=i){
                     return i;
                  }
            }
        return nums.length;
        }
    }
