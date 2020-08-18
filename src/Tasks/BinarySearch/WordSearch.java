package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Word-Search
 */

public class WordSearch {
    public static void main(String[] args) {
        String[][] board0 = {{"F", "A", "C"},
                             {"O", "B", "Q"},
                             {"A", "X", "O"},
                             {"M", "A", "B"}};
        String word0 = "FOAM";

        String[][] board1 = {{"H", "E", "L", "L", "O"},
                             {"A", "B", "C", "D", "E"}};
        String word1 = "HELLO";

        String[][] board2 = {{"x", "z", "d", "x"},
                             {"p", "g", "u", "x"},
                             {"k", "j", "z", "d"}};
        String word2 = "xzu";

        System.out.println(solve(board0, word0)); // true
        System.out.println(solve(board1, word1)); // true
        System.out.println(solve(board2, word2)); // false
    }

    private static boolean solve(String[][] board, String word) {
        for (String[] line : board) {
            StringBuilder wordInBoard = new StringBuilder();
            for (String letter : line) {
                wordInBoard.append(letter);
            }
            if (wordInBoard.toString().contains(word)) {
                return true;
            }
        }

        for (int i = 0; i < board[0].length; i++) {
            StringBuilder wordInBoard = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                wordInBoard.append(board[j][i]);
            }
            if (wordInBoard.toString().contains(word)) {
                return true;
            }
        }

        return false;
    }
}
