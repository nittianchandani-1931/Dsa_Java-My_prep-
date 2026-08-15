package Pattern;

public class Numpyramid {
    public static void main(String[] args) {
        int n = 4;

        for (int row = 1; row <= n; row++) {

            // part 1
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            // part 2
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            int rowValue = row;
            int decRowValue = row - 1;
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(decRowValue + " ");
                decRowValue--;
            }
            // for move to next row
            System.out.println();
        }
    }
}