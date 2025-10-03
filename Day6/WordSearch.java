package Day6;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;

      
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (search(board, word, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean search(char[][] board, String word, int index, int row, int col) {
        
        if (index == word.length()) return true;

        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) return false;

        if (board[row][col] != word.charAt(index)) return false;

        char temp = board[row][col];
        board[row][col] = '#';  
        boolean found =
            search(board, word, index + 1, row + 1, col) ||
            search(board, word, index + 1, row - 1, col) || 
            search(board, word, index + 1, row, col + 1) || 
            search(board, word, index + 1, row, col - 1);   

      
        board[row][col] = temp;

        return found;
    }
}
