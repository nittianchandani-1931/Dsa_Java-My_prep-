package Pattern;

public class InvertedPyramid {
    public static void main(String[] args) {
        int n = 4;

        for (int row = 1; row <= n; row++) {

            // for each rrow-> stars and spaces

            // for spaces
            for (int col = 1; col <= row-1; col++) {
                System.out.print("  ");
            }
            // for stars
            for (int col = 1; col <= 2*(n-row)+1; col++) {
                System.out.print("* ");
            }
            // for move to next row
            System.out.println();
        }

    }

}
