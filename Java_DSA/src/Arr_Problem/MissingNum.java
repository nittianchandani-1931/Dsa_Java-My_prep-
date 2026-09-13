package Arr_Problem;

public class MissingNum {
    public int MissingNumber(int[] nums) {
        int xorSum = 0;
        // xor with all the array elements
        for (int n : nums) {
            xorSum = xorSum ^ n;
        }
        // xor with all elements in the range
        int n = nums.length;
        for (int i = 0; i <= n; i++) {
            xorSum = xorSum ^ i;
        }
        // ans aajaega
        return xorSum;
    }

    public static void main(String[] args) {
            int nums[] = {3, 0, 1};

        MissingNum obj = new MissingNum();

        int ans = obj.MissingNumber(nums);

        System.out.print("Missing Number : " + ans);
    }
}
