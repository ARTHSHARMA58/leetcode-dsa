class Solution {
    public void dfs(int r ,int c, char[][] grid){
        if(r<0 || r>= grid.length || c<0 || c>= grid[0].length || grid[r][c]=='0'){
            return;
        }
        grid[r][c]='0';
        dfs(r-1,c,grid);
        dfs(r+1,c,grid);
        dfs(r,c+1,grid);
        dfs(r,c-1,grid);
    }
    public int numIslands(char[][] grid) {
      int count=0;
      int m=grid.length;
      int n= grid[0].length;
      for(int i=0;i< m;i++){
        for(int j=0;j<n ;j++){
            if(grid[i][j]=='1'){
                count ++;
                dfs(i,j,grid);
            }

        }
      } 
      return count; 
    }
}