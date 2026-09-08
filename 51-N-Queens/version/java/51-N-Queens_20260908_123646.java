// Last updated: 9/8/2026, 12:36:46 PM
1class Solution {
2    public List<List<String>> solveNQueens(int n) {
3        List<List<String>> result = new ArrayList<>();
4        char[][] board = new char[n][n];
5        for (int i = 0; i < n; i++) {
6            Arrays.fill(board[i], '.');
7        }
8        backtrack(0, board, result, n);
9        return result;
10    }
11    private void backtrack(
12        int row,
13        char[][] board,
14        List<List<String>> result,
15        int n
16    ) {
17        if (row == n) {
18            List<String> solution = new ArrayList<>();
19
20            for (char[] r : board) {
21                solution.add(new String(r));
22            }
23
24            result.add(solution);
25            return;
26        }
27        for (int col = 0; col < n; col++) {
28            if (isSafe(board, row, col, n)) {
29                board[row][col] = 'Q';
30                backtrack(row + 1, board, result, n);
31                board[row][col] = '.';
32            }
33        }
34    }
35    private boolean isSafe(char[][] board, int row, int col, int n) {
36        for (int i = 0; i < row; i++) {
37            if (board[i][col] == 'Q') {
38                return false;
39            }
40        }
41        for (int i = row - 1, j = col - 1;
42             i >= 0 && j >= 0;
43             i--, j--) {
44
45            if (board[i][j] == 'Q') {
46                return false;
47            }
48        }
49        for (int i = row - 1, j = col + 1;
50             i >= 0 && j < n;
51             i--, j++) {
52
53            if (board[i][j] == 'Q') {
54                return false;
55            }
56        }
57
58        return true;
59    }
60}