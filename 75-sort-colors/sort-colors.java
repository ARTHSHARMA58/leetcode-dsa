class Solution {
    public void swap(int[]arr,int a ,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public void sortColors(int[] nums) {
      int low=0;
      int mid=0;
      int high=nums.length-1;
      for(int i=0;i<nums.length;i++){
        if(nums[mid]==0){
            swap(nums,low,mid);
            low++;
            mid++;
        }
        else if(nums[mid]==1){
            mid++;
        }
        else{
            swap(nums,mid,high);
            high--;
        }
      }  
    }
}