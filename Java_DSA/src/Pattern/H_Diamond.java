package Pattern;

public class H_Diamond {
    public static void main(String[] args) {
        int n = 4;
        for (int row = 1; row <= n; row++) {
            // for each row variables column
            // spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            // part1
            if (row == 1) {
                for (int col = 1; col <= 2 * row - 1; col++) {
                    System.out.print("* ");
                }

            } else {
                // middle rows
                // 1*
                System.out.print("* ");
                // 2r-3
                for (int col = 1; col <= 2 * row - 3; col++) {

                    System.out.print("  ");
                }
                System.out.print("* ");

            }
            //move to next row
            System.out.println();

        }
        // Part2
        for (int row = 1; row <= n - 1; row++) {
            // for each row -> variable columnns

            // part1

            for (int col = 1; col <= row; col++) {
                System.out.print("  ");
            }
            // Part2
            if (row == (n - 1)) {
                System.out.print("* ");
            } else {
                // remaing rows
                // 1*
                // (2*(n-r)-3
                // 1*
                System.out.print("* ");

                for (int col = 1; col <= 2 * (n - row) - 3; col++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
