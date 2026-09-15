package Arr_Problem;

import java.util.ArrayList;
import java.util.List;

public class MissingEle_withduplicate_Arr {

    public List<Integer> FindMissingEle_withduplicate_Arr(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        // Marking
        int n = nums.length;
        for (int index = 0; index < n; index++) {
            int value = Math.abs(nums[index]);
            int position = value - 1;
            // mark krdo ye position
            if (nums[position] > 0) {
                nums[position] = -nums[position];

            }
        }

        // array travel and whenever u encounter positive value print the number at the
        // same time
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                int valueAtThisIndex = i + 1;
                ans.add(valueAtThisIndex);
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        MissingEle_withduplicate_Arr obj = new MissingEle_withduplicate_Arr();

        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };

        List<Integer> result = obj.FindMissingEle_withduplicate_Arr(nums);

        System.out.println("Missing Elements: " + result);
    }
}