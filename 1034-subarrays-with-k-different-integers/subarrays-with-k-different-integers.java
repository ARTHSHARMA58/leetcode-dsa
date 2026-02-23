class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
       int ans= helper(nums,k)-helper(nums,k-1);
       return ans;
    }
    public static int helper(int[] nums,int k){
         int count=0;
        int left=0;
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            mpp.put(num,mpp.getOrDefault(num,0)+1);
            
            
            while(mpp.size()>k){
                int rem=nums[left];
                mpp.put(rem,mpp.get(rem)-1);
                if(mpp.get(rem)==0){
                    mpp.remove(rem);
                    // break;
                }
                left++;
            }
            
                count =count+(i-left+1);
            

            
        }
       return count; 
    }
}