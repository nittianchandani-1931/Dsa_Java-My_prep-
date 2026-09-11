package Arr_Problem;

import java.util.HashMap;

public class Mode_arr {

    static int getMode(int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);

        }
        // for (int i : freq.keySet()) {
        // // i-> will represent key
        // System.out.println(i + " -> " + freq.get(i));
        // }

        int maxFreq = -1;
        int maxFreqWaliKey = -1;
        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentKeyKiFrequency = freq.get(key);
            if (currentKeyKiFrequency > maxFreq) {
                // mujhe naya max mil gya
                maxFreq = currentKeyKiFrequency;
                maxFreqWaliKey = currentKey;
            }
        }
        // }jb loop se bahr aayoge to max freq wali key ready hogi
        return maxFreqWaliKey;
    }

    static void main() {
        int arr[] = { 1, 4, 2, 2, 2, 2, 2, 2, 5, 6, 5, 6, 8, 8, 9 };
        int ans = getMode(arr);
        System.out.println(ans);
    }
}
