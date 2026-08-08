
package Pattern;

public class HollowSquare {

    public static void main(String[] args) {
        int n = 10;

        for (int row = 1; row <= n; row++) {

            // For each row -> 6 columns
            for (int col = 1; col <= 6; col++) {

                // Print star on first/last row
                // or first/last column
                if (row == 1 || row == n || col == 1 || col == 6) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }

            // Move to next row
            System.out.println();
        }
    }
}