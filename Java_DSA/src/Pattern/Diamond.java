package Pattern;

public class Diamond {
    public static void main(String[] args) {
        int n = 4;

        for (int row = 1; row <= n; row++) {

            // for each rrow-> stars and spaces

            // for spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            // for stars
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("* ");
            }
            // for move to next row
            System.out.println();
        }

        for (int row = 1; row <= n; row++) {

            // for each rrow-> stars and spaces
            if (row == 1) {
                continue;
            }
            // for spaces
            for (int col = 1; col <= row - 1; col++) {
                System.out.print("  ");
            }
            // for stars
            for (int col = 1; col <= 2 * (n - row) + 1; col++) {
                System.out.print("* ");
            }
            // for move to next row
            System.out.println();
        }
    }

}
