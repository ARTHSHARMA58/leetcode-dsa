class Solution {
    public static void bfs(int[][]mat,int[]vis,Queue<Integer>q,int node){
          q.add(node);
          vis[node]=1;
          while(!q.isEmpty()){
            int m=q.poll();
            for(int i=0;i< mat.length;i++){
                if(mat[m][i]==1 && vis[i]==0){
                    vis[i]=1;
                    q.add(i);
                }
            }
          }

    }
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        Queue<Integer> q=new LinkedList<>();
        int[] vis=new int[isConnected.length];
        for(int i=0;i<isConnected.length;i++){
            if(vis[i]==0){
                count++;
                bfs(isConnected,vis,q,i);
            }
            
        }
        return count ;
    }
}