// Last updated: 7/9/2026, 9:14:32 AM
public class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        // Iterate through the array to find the pivot index
        for (int i = 0; i < nums.length; i++) {
            // rightSum = totalSum - leftSum - nums[i]
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }

            // Update leftSum for the next index
            leftSum += nums[i];
        }

        // No pivot index found
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        System.out.println(solution.pivotIndex(nums1));  // Output: 3

        // Example 2
        int[] nums2 = {1, 2, 3};
        System.out.println(solution.pivotIndex(nums2));  // Output: -1

        // Example 3
        int[] nums3 = {2, 1, -1};
        System.out.println(solution.pivotIndex(nums3));  // Output: 0
    }
}
