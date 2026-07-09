// Last updated: 7/9/2026, 9:14:01 AM
// Algo 2 : Binary Search : O(nlogn) , O(1)
class Solution {
    public boolean checkIfExist(int[] nums) {
        Arrays.sort(nums);
        int noOfZeros = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] != 0) {
              if(Arrays.binarySearch(nums , 2*nums[i])  >= 0) {
                    return true;
                } else if(nums[i] % 2  == 0 && Arrays.binarySearch(nums , nums[i] / 2)  >= 0) {
                    return true;
                }  
            } else {
                noOfZeros++;
            }
        } 
        return noOfZeros >= 2 ? true : false;
    }
}