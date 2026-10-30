class Solution {
    public int trap(int[] height) {
        int lmax=0;
        int rmax=0;
        int total=0;
        int left=0;
        int right=height.length-1;
        while(left<=right){
           if(lmax<=rmax){
            lmax=Math.max(height[left],lmax);
            total+=lmax-height[left];
            left++;
           }else{
            rmax=Math.max(height[right],rmax);
            total+=rmax-height[right];
            right--;
           }
        }
        return total;
    }
}