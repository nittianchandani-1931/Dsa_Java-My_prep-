package Arr_Problem;

public class Sort_0and1 {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (nums[i] == 1 && nums[j] == 0) {
                // swap
                nums[i] = 0;
                nums[j] = 1;
            }
            if (nums[i] == 0) {
                i++;
            }
            if (nums[j] == 1) {
                j--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 1, 1, 0, 1, 0, 1, 0, 0 };

        Sort_0and1 obj = new Sort_0and1();

        obj.sortArray(nums);

        for (int x : nums) {
            System.out.print(x + " ");
        }
    }
}