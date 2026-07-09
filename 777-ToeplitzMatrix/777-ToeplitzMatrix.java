// Last updated: 7/9/2026, 3:07:03 PM
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
       int sum =0;
        for(int i=0;i<matrix.length-1;i++){
            for(int j=0;j<matrix[i].length-1;j++){
               if(matrix[i][j]!=matrix[i+1][j+1])
               return false;
            }
        }
        return true;
    }
}