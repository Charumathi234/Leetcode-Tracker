// Last updated: 7/9/2026, 3:05:12 PM
class Solution {
    public String[] createGrid(int m, int n) {
       String[] g = new String[m];
       for(int i=0;i<m;i++){
           String s = "";
           for(int j=0;j<n;j++){
               if(i==0 || j==n-1){
                   s+=".";
               }else{
                   s+="#";
               }
           }
           g[i]=s;
       }
        return g;
    }
}