class Solution {
    public int maxProduct(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int pre=1;
        int suff=1;
        int n=nums.length-1;
        for(int i=0;i<nums.length;i++){
            pre=nums[i]*pre;
            suff=nums[n-i]*suff;
            ans=Math.max(ans,Math.max(suff,pre));
            if(pre==0) pre=1;
            if(suff==0) suff=1;

        }
        return ans;
    }
}