class Solution {
    public void reverse(char[]arr, int start ,int end){
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start ++;
            end--;
        }
    }
    public String reverseWords(String s) {
        char[] arr=s.toCharArray();
        reverse(arr,0,arr.length-1);
        int i=0;
        for(int j=0;j<s.length();j++){
            if(arr[j]==' '){
                reverse(arr,i,j-1);
                i=j+1;
            }
        }
        reverse(arr,i,arr.length-1);
        
          String[] words = s.trim().split("\\s+");

        StringBuilder ans = new StringBuilder();

        for (int k = words.length - 1; k >= 0; k--) {

            ans.append(words[k]);

            if (k != 0) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}
