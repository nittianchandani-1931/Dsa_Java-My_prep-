package Pattern;

public class IncrABCpyramid {

    public static void main(String[] args) {
        int n = 4;

        //
        // 1
        // 1 2 1
        // 1 2 3 2 1
        // 1 2 3 4 3 2 1
        for (int row = 1; row <= n; row++) {

            // part 1
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            // part 2
            for (int col = 1; col <= row; col++) {

                int a = col;
                int b = 'A' - 1;
                int ans = (a + b);
                char finalAns = (char) ans;
                System.out.print(finalAns + " ");

            }

            // part3
            char toPrint = (char) (row + 'A' -2);
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(toPrint + " ");
                toPrint--;
            }
            // for move to next row
            System.out.println();
        }
    }
}