package Arr_Problem;

public class Avg_of_arr {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 73, 31 };
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum = sum + arr[i];
        }
        double avg = (double) sum / arr.length;

        System.out.println("The avg of arr:  " + avg);
    }
}
