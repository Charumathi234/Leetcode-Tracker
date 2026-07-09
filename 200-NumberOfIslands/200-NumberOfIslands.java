// Last updated: 7/9/2026, 3:08:41 PM
class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n  =grid[0].length;
        int ans =0;
        boolean[][] visit = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && visit[i][j]==false){
                ans++;
                bfs(m,n,i, j,visit,grid);
                }
            }
        }
        return ans;
    }
    public void bfs(int m, int n, int i,int j,boolean[][] visit,char[][] grid){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i,j});
        visit[i][j]=true;
        int[][] dir ={{-1,0},{1,0},{0,-1},{0,1}};
        while(q.size()>0){
            int curr[]=q.poll();
            int x =curr[0];
            int y =curr[1];
            for(int k=0;k<4;k++){
                int nextrow =x+dir[k][0];
                int nextcol=y+dir[k][1];
                if(nextrow<m && nextrow>=0 && nextcol<n && nextcol>=0 && visit[nextrow][nextcol]==false && grid[nextrow][nextcol]=='1'){
                q.add(new int[]{nextrow,nextcol});
                visit[nextrow][nextcol]=true;
                }
            }
        }
    }
}