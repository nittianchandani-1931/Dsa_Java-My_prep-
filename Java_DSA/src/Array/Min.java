package Array;

public class Min {

    public static void main(String[] args) {
        int arr[] = { 4, 2, -5, 21, 32 };
        int n = arr.length;
        int minValue = arr[0];
        // compare maxValue ko array ke har elements ke sath
        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] < minValue) {
                // update maxValue
                minValue = arr[i];
            }
        }
        System.out.println(minValue);
    }
}
