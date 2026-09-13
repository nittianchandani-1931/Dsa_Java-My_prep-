package Arr_Problem;

import java.util.HashMap;

public class HighLowFreq {

    static int[] getHLFreq(int arr[]) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        // 1. Frequency count
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // 2. Highest frequency
        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;

        for (int key : freq.keySet()) {

            int currentFreq = freq.get(key);

            if (currentFreq > highestFreq) {
                highestFreq = currentFreq;
                highestNum = key;
            }
        }

        // 3. Lowest frequency
        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;

        for (int key : freq.keySet()) {

            int currentFreq = freq.get(key);

            if (currentFreq < lowestFreq) {
                lowestFreq = currentFreq;
                lowestNum = key;
            }
        }

        // 4. Return both numbers
        int ans[] = {highestNum, lowestNum};

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = {
            1, 3, 3, 4, 4, 4, 4, 6, 7, 8,
            1, 1, 1, 9, 5, 10, 4, 3, 2, 6
        };

        int ans[] = getHLFreq(arr);

        System.out.println("Highest frequency number: " + ans[0]);
        System.out.println("Lowest frequency number: " + ans[1]);
    }
}