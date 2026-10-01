class AlmostSortedBS {
    public int findElementInNearlySortedArray(int[] arr, int K) {
        int n = arr.length;

        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid - 1 >= 0 && arr[mid - 1] == K) // kyunki mid-1 and mid+1 boundary me honav to chahiye
                return mid - 1;
            if (arr[mid] == K)
                return mid;
            if (mid + 1 < n && arr[mid + 1] == K)
                return mid + 1;

            if (K > arr[mid]) {
                // move to right
                s = mid + 2;
            } else {
                // move to left
                e = mid - 2;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        AlmostSortedBS solution = new AlmostSortedBS();

        int[] arr = {1,3,4,2 };
        int k = 4;

        int index = solution.findElementInNearlySortedArray(arr, k);

        System.out.println("Index: " + index);
    }
}
