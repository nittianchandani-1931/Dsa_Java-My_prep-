package Arr_Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Threesum {
    public List<List<Integer>> threeSum(int[] nums) {
        // Set<List<Integer>> output= new HashSet<>();
        // int target=0;
        // int n = nums.length;
        // for(int i=0;i<n-2; i++){
        // for(int j =i+1; j<n-1;j++){
        // for(int k=j+1;k<n; k++){
        // if(nums[i]+ nums[j]+nums[k]== target){
        // List<Integer> temp =new ArrayList<>();
        // temp.add(nums[i]);
        // temp.add(nums[j]);
        // temp.add(nums[k]);
        // Collections.sort(temp);
        // output.add(temp);
        // }
        // }
        // }
        // }
        // return new ArrayList<>(output);
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {

                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {

                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    while (j < k && nums[j] == nums[j + 1])
                        j++;

                    while (j < k && nums[k] == nums[k - 1])
                        k--;

                    j++;
                    k--;

                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Threesum s = new Threesum();

        int[] nums = { -1, 0, 1, 2, -1, -4 };

        List<List<Integer>> result = s.threeSum(nums);

        System.out.println(result);

    }
}
