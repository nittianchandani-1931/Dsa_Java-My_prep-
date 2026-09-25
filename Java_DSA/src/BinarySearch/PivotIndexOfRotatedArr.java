class PivotindexofRotatedArr {

    public int pivotIndex(int[] nums) {

        int n = nums.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;

        if (nums[s] < nums[e]) {
            // Pivot right side mein hai
            return -1;
        }
        while (s <= e) {

            int mid = s + (e - s) / 2;
            if (nums[mid] <= nums[n - 1]) {
                e = mid - 1;
            } else {
                ans = mid;
                // Pivot mid ya left side mein hai
                s = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };

        PivotindexofRotatedArr obj = new PivotindexofRotatedArr();

        int pivot = obj.pivotIndex(nums);

        System.out.println("Pivot Index = " + pivot);

        if (pivot != -1) {
            System.out.println("Pivot Element = " + nums[pivot]);
        }
    }
}