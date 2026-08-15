package Pattern;

public class Butterfly {
    public static void main(String[] args) {
        int n = 4;
        // prt 1
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            // prt2//
            for (int col = 1; col <= 2 * (n - row); col++) {
                System.out.print("  ");
            }
            // part3

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        // part 4
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            // part 5
            for (int col = 1; col <= 2 * row - 2; col++) {
                System.out.print("  ");
            }
            // part 6
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}