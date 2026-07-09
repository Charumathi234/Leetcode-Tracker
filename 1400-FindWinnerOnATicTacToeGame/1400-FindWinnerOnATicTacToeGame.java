// Last updated: 7/9/2026, 3:06:39 PM
class Solution {
    public String tictactoe(int[][] moves) {
        char[][] b = new char[3][3];
        for (int i = 0; i < moves.length; i++) {
            int r = moves[i][0];
            int c = moves[i][1];
            b[r][c] = (i % 2 == 0) ? 'X' : 'O';
        }
        for (int i = 0; i < 3; i++) {
            if (b[i][0] != 0 && b[i][0] == b[i][1] && b[i][1] == b[i][2])
                return b[i][0] == 'X' ? "A" : "B";
            if (b[0][i] != 0 && b[0][i] == b[1][i] && b[1][i] == b[2][i])
                return b[0][i] == 'X' ? "A" : "B";
        }
        if (b[0][0] != 0 && b[0][0] == b[1][1] && b[1][1] == b[2][2])
            return b[0][0] == 'X' ? "A" : "B";
        if (b[0][2] != 0 && b[0][2] == b[1][1] && b[1][1] == b[2][0])
            return b[0][2] == 'X' ? "A" : "B";
        return moves.length == 9 ? "Draw" : "Pending";
    }
}
  
