public class sort{

    public int[] sortArray(int[] nums) {

        int n = nums.length;

        // Outer loop
        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            // Inner loop -> find minimum element
            for (int j = i + 1; j < n; j++) {

                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap nums[i] and nums[minIndex]
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }

        return nums;
    }

    public static void main(String[] args) {

        int[] arr = { 6, 5, 1, 3 };

        sort obj = new sort();

        obj.sortArray(arr);

        System.out.println("Printing the array:");

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
