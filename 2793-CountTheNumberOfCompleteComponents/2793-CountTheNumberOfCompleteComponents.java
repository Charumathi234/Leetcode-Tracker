// Last updated: 7/9/2026, 3:05:34 PM
class Solution {
    int ans=0;
    public int countCompleteComponents(int n, int[][] edges) {
         List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < edges.length; i++) {
            adj[edges[i][0]].add(edges[i][1]);
            adj[edges[i][1]].add(edges[i][0]);
        } 
        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (vis[i] == false) {
                BFS(adj, vis, n, i);
            }
        }
        return ans;                                    
    }
    public void BFS(List<Integer>[] adj, boolean[] vis, int n, int sc){
         Queue<Integer> q = new LinkedList<>();
        q.add(sc);
        vis[sc] = true;
        int nodecount = 0;
        int edgecount = 0;
        while (!q.isEmpty()) {
            int node = q.poll();
            nodecount++;
            
            for (int x : adj[node]) {
                if (vis[x] == false) {
                    q.add(x);
                    vis[x] = true;
                }
                edgecount++;
            }
        }
        if ((long) nodecount * (nodecount - 1) == edgecount) {
            ans++;
        }
    }
}