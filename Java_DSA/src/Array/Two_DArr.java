package Array;

public class Two_DArr {
    public static void main(String[] args) {

        // Declaration + Initialization
        int arr[][];
        arr = new int[3][4];
        int[][] brr = {
                { 1, 2 },
                { 1, 9 },
                { 5, 4 },
                { 7, 0 },
                { 4, 8 }
        };
        int rowLength = brr.length;
        int colLength = brr[0].length;

        for (int rowIndex = 0; rowIndex <= rowLength - 1; rowIndex++) {
            for (int colIndex = 0; colIndex <= colLength - 1; colIndex++) {
                System.out.print(brr[rowIndex][colIndex] + "  ");
            }
        

        System.out.println();
    }
}
}