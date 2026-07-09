// Last updated: 7/9/2026, 9:15:05 AM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int k=0;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    set.add(nums1[i]);
                }
            }
        }
        int arr[]=new int[set.size()];
        for(int num:set){
             arr[k++]=num;
        }
        return arr;
    }
}