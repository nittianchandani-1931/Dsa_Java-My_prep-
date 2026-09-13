package Arr_Problem;

public class UniqueElement {

    public int FindUniqueElement(int[] nums) {
        int xorSum = 0;
        // xor with all the array elements
        for (int n : nums) {
            xorSum = xorSum ^ n;
        }

        return xorSum;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 3, 1, 2, 2 };

        UniqueElement obj = new UniqueElement();

        int ans = obj.FindUniqueElement(nums);

        System.out.print("Unique Number : " + ans);
    }
}
