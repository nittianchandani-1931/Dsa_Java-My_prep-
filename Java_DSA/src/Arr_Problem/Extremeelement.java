package Arr_Problem;

public class Extremeelement {
    static void printAlternate(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            if (i == j) {
                System.out.println(arr[i]);
                return;
            } else {
                // i<j
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }
 
    }

    static void main() {
        int arr[] = { 5, 3, 2, 8, 7, 9, 1 };
        printAlternate(arr);

    }
}
