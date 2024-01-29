/*import java.util.Random;

public class RandomArrayRemoval {
    public static void
removeRandomEntries(int[] array) {
        Random random = new Random ();
        int length = array.length;

        while (length > 0) {
            int index=
random.nextInt(length);
            int removedValue = array[index];
            array[index] = array[length - 1];
            array[length - 1] = removedValue;
            length--;
        }
    }
}
*/

/*public class CaesarCipher {
    public static final String GREEK_ALPHABET = "αβγδεζηθικλμνξοπρστυφχψω";

    public static String encrypt(String message) {
        StringBuilder encrypted = new StringBuilder();
        int shift = 3;

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            int index = GREEK_ALPHABET.indexOf(ch);
            if (index != -1) {
               /
                char shiftedChar = GREEK_ALPHABET.charAt((index + shift) % GREEK_ALPHABET.length());
 */

/*public class TicTacToe {
    private char[][] board;
    private char currentPlayerMark;
    private boolean gameWon;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayerMark = 'X';
        gameWon = false;
        initializeBoard();
    }


    public void putMark(int row, int col) {
        if (gameWon) {
            throw new IllegalStateException("The game has already been won.");
        }


        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            throw new IllegalArgumentException("Invalid row or column.");
        }

        if (board[row][col] != ' ') {
            throw new IllegalArgumentException("Cell already occupied.");
        }

        board[row][col] = currentPlayerMark;

        // Check for a win after placing the mark
        if (checkForWin(row, col)) {
            gameWon = true;
        }


        // Switch player
        currentPlayerMark = (currentPlayerMark == 'X') ? 'O' : 'X';
    }


}
/*

int[] backup = Arrays.copyOf(original, original.length);
 */

/*int[] backup = new int[original.length];
        System.arraycopy(original, 0, backup, 0, original.length);
/*


int[] backup = new int[original.length];
        for (int i = 0; i < original.length; i++) {
        backup[i] = original[i];
        }
import java.util.Random;

public class ArrayShuffler {
    public static void shuffle(int[] A) {
        Random random = new Random();

        for (int i = A.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        shuffle(array);
        System.out.println(Arrays.toString(array));
    }

}
public class ArrayAdder {
    public static int[][][] addArrays(int[][][] A, int[][][] B) {
        int[][][] result = new int[A.length][A[0].length][A[0][0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                for (int k = 0; k < A[i][j].length; k++) {
                    result[i][j][k] = A[i][j][k] + B[i][j][k];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][][] A = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};

        int[][][] B = {{{9, 10}, {11, 12}}, {{13, 14}, {15, 16}}};
        int[][][] result = addArrays(A, B);

        // Print the result
        for (int[][] matrix : result) {
            for (int[] row : matrix) {
                System.out.println(Arrays.toString(row));
            }
            System.out.println();
        }
    }
}
public class ArrayAdder {
    public static int[][][] addArrays(int[][][] A, int[][][] B) {
        int[][][] result = new int[A.length][A[0].length][A[0][0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                for (int k = 0; k < A[i][j].length; k++) {
                    result[i][j][k] = A[i][j][k] + B[i][j][k];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][][] A = {

            {{1, 2, 3}, {4, 5, 6}},
            {{7, 8, 9}, {10, 11, 12}}
        };
        int[][][] B = {
            {{13, 14, 15}, {16, 17, 18}},
            {{19, 20, 21}, {22, 23, 24}}
        };

        int[][][] result = addArrays(A, B);

        // Print the result
        for (int[][] matrix : result) {
            for (int[] row : matrix) {
                System.out.println(Arrays.toString(row));
            }
            System.out.println();
        }
    }
}
