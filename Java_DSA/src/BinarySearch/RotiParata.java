class RotiParata {
    static boolean isValidAns(int totalParata, int cooks[], int totalCooks, int timeLimit) {
        int countParata = 0;
        // ek ek krke hrr cook ke pass jaenge

        for (int i = 0; i < cooks.length; i++) {
            int currentCookRank = cooks[i];
            int timeTaken = 0;
            int j = 1;
            // currentcook rank-> R
            // 1*R, 2*R,3*R..........

            // cook krna start kro
            while (timeTaken <= timeLimit) {
                if (timeTaken + j * currentCookRank <= timeLimit) {
                    // iska mtlb mai ye parata bna skta hu
                    timeTaken = timeTaken + j * currentCookRank;
                    countParata++;
                    j++;
                } else {
                    // iska mtlb currentParat time limit ke andr nhi bn skta
                    break;
                }
            }
            // jb ye loop khtm hota h , toh ye ith cook jitne parata bna skta tha
            // unko ParataCount me add kr chuka hota h
            if (countParata >= totalParata) {
                return true;
            }
        }
        if (countParata >= totalParata) {
            return true;
        }

        else {
            return false;
        }
    }

    public int minTimeToCookPratas(int p, int[] cook, int n) {
        // p-> number of parata to cook
        // n-> number of cooks
        int maxRank = -1;
        for (int i = 0; i < cook.length; i++) {
            if (cook[i] > maxRank) {
                maxRank = cook[i];
            }
        }
        int s = 0;
        // R*[n*(n+1)/2] , here R= highest rank , and n = number of parata

        int e = maxRank * (p * (p + 1) / 2);
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValidAns(p, cook, n, mid)) {
                // ans store and move left
                ans = mid;
                e = mid - 1;
            } else {
                // move to right
                s = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        RotiParata solution = new RotiParata();

        int p =5; // total paratas
        int[] cooks = { 1 }; // cook ranks
        int n = cooks.length; // total cooks

        int minTime = solution.minTimeToCookPratas(p, cooks, n);

        System.out.println("Minimum time: " + minTime);
    }
}