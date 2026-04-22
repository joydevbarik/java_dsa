import java.util.*;

public class twoD {
    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;

        char[][] matrix = new char[numRows][s.length()];
        for (char[] row : matrix) Arrays.fill(row, ' ');

        int row = 0, col = 0;
        boolean down = true;

        for (char c : s.toCharArray()) {
            matrix[row][col] = c;

            if (down) {
                if (row == numRows - 1) {
                    down = false;
                    row--;
                    col++;
                } else {
                    row++;
                }
            } else {
                if (row == 0) {
                    down = true;
                    row++;
                } else {
                    row--;
                    col++;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (char[] r : matrix) {
            for (char c : r) {
                if (c != ' ') result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();

        System.out.println(convert(s, n));
    }
}