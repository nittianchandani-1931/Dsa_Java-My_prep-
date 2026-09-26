package BinarySearch;

public class MinimumPage {
    static boolean isValidAnswer(int arr[], int k, int maxPages) {
        // check whether mid or maxpages is valid solution or not
        int studentCount = 1;
        int pages = 0;
        for (int i = 0; i < arr.length; i++) {
            if (pages + arr[i] <= maxPages) {
                // iska mtlb current book can be assigned
                // as it is not out of limit
                // then assign
                pages = pages + arr[i];
            } else {
                // current student ko current bok
                // cannot assigned bla case
                studentCount++;
                if (studentCount > k || arr[i] > maxPages) {
                    return false;
                } else {
                    // can assign new student
                    pages = 0;
                    pages = pages + arr[i];
                }
            }
        }
        return true;
    }

    public int findPages(int[] arr, int k) {
        int n = arr.length;
        int s = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int e = sum;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValidAnswer(arr, k, mid)) {
                // true wala case
                ans = mid;
                e = mid - 1;
            } else {
                // false wala case
                s = mid + 1;

            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int arr[] = { 12,34,67,90 };
        int k = 2;

        MinimumPage obj = new MinimumPage();

        int answer = obj.findPages(arr, k);

        System.out.println("Minimum maximum pages = " + answer);
    }
}