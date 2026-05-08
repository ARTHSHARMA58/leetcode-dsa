class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int iel1=(nums1.length+nums2.length)/2;
        int iel2= iel1-1;
        int el1=-1;
        int el2=-1;
        int i=0;
        int j=0;
        int index=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]>nums2[j]){
                if(index==iel1) el1=nums2[j];
                if(index==iel2) el2=nums2[j];
                j++;
                index++;
            }
            else{
                if(index==iel1) el1=nums1[i];
                if(index==iel2) el2=nums1[i];
                i++;
                index++;
            }
        }
        while(i< nums1.length){
            if(index==iel1) el1=nums1[i];
            if(index==iel2) el2=nums1[i];
            i++;
            index++;

        }
        while(j<nums2.length){
            if(index==iel1) el1=nums2[j];
            if(index==iel2) el2=nums2[j];
            j++;
            index++;
        }
        int n=nums1.length+nums2.length;
        if(n%2==1) return el1;
        return ((double)el1+(double)el2)/2D;
    }
}