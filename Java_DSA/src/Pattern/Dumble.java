package Pattern;

public class Dumble {
    public static void main(String[] args) {
        int n = 4;

        // Upper half
        for (int row = 1; row <= n; row++) {

            // Left spaces
            for (int col = 1; col < row; col++) {
                System.out.print("  ");
            }

            // Stars
            for (int col = 1; col <= 2 * (n - row) + 1; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower half
        for (int row = n - 1; row >= 1; row--) {

            // Left spaces
            for (int col = 1; col < row; col++) {
                System.out.print("  ");
            }

            // Stars
            for (int col = 1; col <= 2 * (n - row) + 1; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
   