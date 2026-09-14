package Arr_Problem;

import java.util.HashMap;

public class FirstRepeatElement {

    public int FindFirstRepeatElement(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        // freq store
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);

        }
        for(int i:nums){
            if(freq.get(i)>1){
                return i;
            }
        }
        //agar kisi v elemet ki frequency one nhi h
        return -1;
    }
     public static void main(String[] args) {

        FirstRepeatElement obj = new FirstRepeatElement();

        int[] nums = {10, 5, 3, 4, 3, 5, 6};

        int result = obj.FindFirstRepeatElement(nums);

        System.out.println("First repeating element: " + result);
    }
}