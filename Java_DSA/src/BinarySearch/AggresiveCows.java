
import java.util.Arrays;

class AggresiveCows {
    static boolean isValidAns(int[] stalls, int k, int minDistance) {
        // brute force
        int cowCount = 1;
        // first cow is placed at 0 index
        int lastPosition = 0;
        for (int i = 1; i < stalls.length; i++) {
            // current cow ko current position pr tabhi place kreunga
            // jb current and prev cow ke bich ka distance
            // >=minDistance ho
            if (stalls[i] - stalls[lastPosition] >= minDistance) {
                // can place safely
                cowCount++;
                // bcz new cow place ho chuki h
                // means last position ko update krna pdega
                lastPosition = i;
                if (cowCount == k) {
                    // means all cows ka placed
                    return true;
                }
            }

        }
        return false;
    }

    public int aggresivecows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int n = stalls.length;

        int start = 0;
        int end = stalls[n - 1] - stalls[0];
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isValidAns(stalls, k, mid)) {
                // hme ek possible solution mil gya
                // ans ko store and move to right
                ans = mid;
                start = mid + 1;
            } else {
                // mid k sath there is no possible arrangements to place cows
                // move to left
                end = mid - 1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        AggresiveCows solution = new AggresiveCows();

        int[] stalls = { 1, 2, 4, 8, 9 };
        int k = 3; // cows ki sankhya

        int answer = solution.aggresivecows(stalls, k);
        System.out.println("Maximum minimum distance: " + answer);
    }
}