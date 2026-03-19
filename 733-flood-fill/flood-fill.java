class pair{
    int row;
    int col;
    pair(int row,int col){
        this.row=row;
        this.col=col;
    }

}
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m=image.length;
        int n=image[0].length;
        int original=image[sr][sc];
        if(original==color) return image;
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(sr,sc));
        image[sr][sc]=color;
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            q.remove();
            for(int k=0;k<4;k++){
                int nrow=r+drow[k];
                int ncol=c+dcol[k];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && image[nrow][ncol]== original){
                    q.add(new pair(nrow,ncol));
                    image[nrow][ncol]=color;
                }

            }
        }
        return image;
    }
}