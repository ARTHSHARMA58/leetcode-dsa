class pair{
    int row;
    int col;
    int step;
    pair(int row , int col ,int step ){
        this.row=row;
        this.col=col;
        this.step=step;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int [][] vis=new int[m][n];
        Queue<pair> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    q.add(new pair(i,j,0));
                    vis[i][j]=1;
                }
            }
        }
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int s=q.peek().step;
            q.remove();
            mat[r][c]=s;
            for(int k=0;k<4;k++){
                int nrow= r+ drow[k];
                int ncol= c+ dcol[k];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && vis[nrow][ncol]==0){
                    q.add(new pair(nrow,ncol,s+1));
                    vis[nrow][ncol]=1;

                }
            }
        }
        return mat;
    }
}