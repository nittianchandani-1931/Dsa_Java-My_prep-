package Pattern;

public class NumTriangle {
    public static void main(String[] args) {
        int n = 5;
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= row; col++) {
        // System.out.print(col + " ");
        // }

        // System.out.println();

        // }
        // For printing same alphabet in each colums
        // A
        // A B
        // A B C
        // A B C D
        // A B C D E

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= row; col++) {
        // int a = col;
        // int b = ('A' - 1);
        // int ans = a + b;
        // char finalAns = (char) ans;
        // System.out.print(finalAns + " ");
        // }

        // System.out.println();

        // }

        // Printing Decreasing alphabet in column
        // E
        // E D
        // E D C
        // E D C B
        // E D C B A

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                int a = n - col;
                int b = 'A';
                ;
                int ans = a + b;
                char finalAns = (char) ans;
                System.out.print(finalAns + " ");
            }

            System.out.println();

        }

    }
}