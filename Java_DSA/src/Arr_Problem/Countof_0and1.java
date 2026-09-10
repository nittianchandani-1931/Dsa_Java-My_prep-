package Arr_Problem;

public class Countof_0and1 {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 1, 1, 0, 0, 1, 1, 0 };

        int countzero = 0;
        int countone = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countzero ++;
            }
            if (arr[i] == 1) {
                countone ++;
            }
        }
        System.out.println("The count of zero is: " + countzero);
        System.out.println("The count of one is: " + countone);

    }
}
