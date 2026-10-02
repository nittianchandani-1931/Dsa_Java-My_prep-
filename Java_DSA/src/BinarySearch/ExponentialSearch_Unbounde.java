class InfiniteArray {
    private int[] arr;

    InfiniteArray(int[] arr) {
        this.arr = arr;
    }

    public int get(int index) {
        return arr[index];
    }
}

class ExponentialSearch_Unbounded {

    public int unboundedsearch(InfiniteArray arr, int target) {
        if (arr.get(0) == target) {
            return 0;
        }

        int i = 1;
        while (arr.get(i) <= target) {
            i = i * 2;
        }

        if (arr.get(i) > target) {
            int s = i / 2;
            int e = i;

            while (s <= e) {
                int mid = s + (e - s) / 2;

                if (arr.get(mid) == target) {
                    return mid;
                }

                if (arr.get(mid) > target) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        } else {
            return -1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] values = {2, 5, 8, 12, 16, 23, 38, 56};
        int target = 23;

        ExponentialSearch_Unbounded searcher =
                new ExponentialSearch_Unbounded();

        int index = searcher.unboundedsearch(
                new InfiniteArray(values), target
        );

        if (index == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at index: " + index);
        }
    }
}