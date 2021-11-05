package surrounded_regions;

/**
 * Leedcode: 130. Surrounded Regions
 */
public class Solution {
    public void solve(char[][] board) {
        int x = board[0].length - 1;
        int y = board.length - 1;

        for (int i = 0; i < board[0].length; i++) {
            if (board[0][i] == 'O') {
                dfs(board, 0, i);
            }
            if (board[y][i] == 'O') {
                dfs(board, y, i);
            }
        }


        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == 'O') {
                dfs(board, i, 0);
            }
            if (board[i][x] == 'O') {
                dfs(board, i, x);
            }
        }


        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length ; j++){
                if(board[i][j] == '#'){
                    board[i][j] = 'O';
                }else if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }

        print(board);

    }

    private void dfs(char[][] board, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'O') {
            return;
        }
        board[i][j] = '#';
        dfs(board, i - 1, j);
        dfs(board, i + 1, j);
        dfs(board, i, j + 1);
        dfs(board, i, j - 1);

    }

    private void print(char[][] board){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length ; j++){
                System.out.println(board[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        char[][] board = {{'O'}};
        Solution solution = new Solution();
        solution.solve(board);
    }

}
