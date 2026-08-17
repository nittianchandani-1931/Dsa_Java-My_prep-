package Array;

public class zaggArr {

    public static void main(String[] args) {

        // Declaration + Initialization
        int arr[][];
        arr = new int[3][4];
        int[][] brr = {
                { 1, 2 },
                { 1, 9, 7, 4 },
                { 5, 4, 3 },
                { 7, 0, 7, 9, 2, 2 },
                { 4, 8 }
        };
        int rowLength = brr.length;
        // int colLength = brr[0].length;

        for (int rowIndex = 0; rowIndex <= rowLength - 1; rowIndex++) {
            // jaise hi mai koi nw row pe aaya
            // same point pe maine uss row ke collength find out krluia
            // brr[rowIndex]-> current row
            // isme kitnne colums -> brr[rowIndex].length
            int colLength = brr[rowIndex].length;

            for (int colIndex = 0; colIndex <= colLength - 1; colIndex++) {
                System.out.print(brr[rowIndex][colIndex] + "  ");

            }

            System.out.println();
        }
    }
}
