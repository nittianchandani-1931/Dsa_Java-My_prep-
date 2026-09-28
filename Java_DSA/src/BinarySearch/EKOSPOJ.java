class EKOSPOJ {
    static boolean isValidAns(int[] trees, int m, int maxHeight) {
        long totalwoodCollected = 0;

        for (int i = 0; i < trees.length; i++) {
            if (trees[i] > maxHeight) {
                // means saw blade overall tree height se chotta h
                // thererfore , pkka kuch amount of wood dega katne pr
                long currentTreeWoodCollected = trees[i] - maxHeight;
                totalwoodCollected += currentTreeWoodCollected;

            }
        }
        if (totalwoodCollected >= m) {
            return true;
        } else {
            return false;
        }
    }

    public int maxSawHeight(int[] trees, int m) {
        int n = trees.length;
        int s = 0;
        int maxi = -1;
        for (int i = 0; i < n; i++) {
            if (trees[i] > maxi) {
                maxi = trees[i];

            }
        }
        int ans = -1;
        int e = maxi;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (isValidAns(trees, m, mid)) {
                // ans store and move right
                ans = mid;
                s = mid + 1;
            } else {
                // move to left
                e = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        EKOSPOJ solution = new EKOSPOJ();

        int[] trees = { 20, 15, 10, 17 };
        int requiredWood = 7;

        int sawHeight = solution.maxSawHeight(trees, requiredWood);
        System.out.println(sawHeight); // Output: 15
    }
}