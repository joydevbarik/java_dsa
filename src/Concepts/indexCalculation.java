import java.util.*;

public class indexCalculation {

    public static String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) return s;

        StringBuilder result = new StringBuilder();
        int cycle = 2 * numRows - 2;

        for (int row = 0; row < numRows; row++) {
            for (int j = 0; j + row < s.length(); j += cycle) {
                result.append(s.charAt(j + row));
                if (row > 0 && row < numRows - 1 && j + cycle - row < s.length()) {
                    result.append(s.charAt(j + cycle - row));
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print("Enter number of rows: ");
        int numRows = sc.nextInt();

        String result = convert(s, numRows);
        System.out.println("Zigzag Conversion: " + result);

        sc.close();
    }
}