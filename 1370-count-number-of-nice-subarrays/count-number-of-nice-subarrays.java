class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
       
    }
    private int atmost(int[]nums,int k){
         int left=0;
        int count=0;
        int odd=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1){
                odd++;
            }
            while(odd>k){
                if(nums[left]%2==1){
                    odd--;
                }
                left++;
            }
            count+=i-left+1;
        }
        return count;
    }
}