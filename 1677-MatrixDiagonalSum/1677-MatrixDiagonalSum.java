// Last updated: 7/9/2026, 3:06:24 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int i=0;int j=0;
        int sum =0;
        int n =mat.length;
        for(int k=1;k<=n;k++){
            sum +=mat[i][j];
            i++;j++;
        }
        i=0;j=n-1;
        for(int k=1;k<=n;k++){
            if(i!=j) sum+=mat[i][j];
            i++;j--;
        }
        return sum;
    }
}