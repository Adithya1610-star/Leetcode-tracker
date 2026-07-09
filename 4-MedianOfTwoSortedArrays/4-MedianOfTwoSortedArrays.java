// Last updated: 7/9/2026, 9:16:43 AM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int m=nums1.length;
     int n=nums2.length;
     int res[]=new int[m+n];
     int p=0;
for(int i=0;i<m;i++){
res[p++]=nums1[i];
}
for(int j=0;j<n;j++){
    res[p++]=nums2[j];
}
Arrays.sort(res);
int mid=res.length/2;
if(res.length%2==0){
    return (res[mid]+res[mid-1])/2.0;
}
else{
return res[mid];
}
    }
}