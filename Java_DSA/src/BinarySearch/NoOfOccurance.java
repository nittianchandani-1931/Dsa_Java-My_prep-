package BinarySearch;

public class NoOfOccurance {

    // Lower Bound = first element >= target
    static int getLowerBound(int arr[], int target) {

        int s = 0;
        int e = arr.length - 1;
        int ans = arr.length;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                e = mid - 1;
            } 
            else {
                s = mid + 1;
            }
        }

        return ans;
    }


    // Upper Bound = first element > target
    static int getUpperBound(int arr[], int target) {

        int s = 0;
        int e = arr.length - 1;
        int ans = arr.length;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (arr[mid] > target) {
                ans = mid;
                e = mid - 1;
            } 
            else {
                s = mid + 1;
            }
        }

        return ans;
    }


    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 30, 30, 30, 30, 30, 40, 50};

        int target = 50;

        int lower = getLowerBound(arr, target);
        int upper = getUpperBound(arr, target);

        int occurrence = upper - lower;

        System.out.println("Lower Bound: " + lower);
        System.out.println("Upper Bound: " + upper);
        System.out.println("Number of Occurrences: " + occurrence);
    }
}