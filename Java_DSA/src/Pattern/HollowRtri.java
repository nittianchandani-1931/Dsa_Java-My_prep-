package Pattern;

public class HollowRtri {

    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            // for each row-> variable column
            if (row == 1 || row == 2 || row == n) {

                for (int col = 1; col <= row; col++) {

                    System.out.print("* ");
                }
            }
            // Middle row 1*
            else {
                System.out.print("* ");

                for (int col = 1; col <= row - 2; col++) {
                    System.out.print("  ");
                }

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}