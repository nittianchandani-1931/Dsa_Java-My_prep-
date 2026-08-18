package Pattern;

public class incrpyramid {

    public static void main(String[] args) {
        int n = 4;

        //
        // 1
        // 2 2 2
        // 3 3 3 3 3
        // 4 4 4 4 4 4 4
        for (int row = 1; row <= n; row++) {

            // part 1
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            // part 2
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print(row + " ");
            }

            // for move to next row
            System.out.println();
        }
    }

}
