// package Arr_Problem;

// public class Arr_mulby10 {

//     public static void main(String[] args) {

//         int arr[] = {2, 4, 3, 3};

//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = arr[i] * 10;
//         }

//         System.out.println("New array:");

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


//  Approach ---2
/*
isme  phle array lie phir uss array ke element ko 10 se multiply kiye ab 
naya elements ko new array bna kr store kre 
phir new array ko return kr diye 
and  i got the ans arrray
*/



package Arr_Problem;

public class Arr_mulby10 {

    static int[] multiplyBy10(int[] arr) {

        int size = arr.length;

        int newArray[] = new int[size];

        for (int i = 0; i < size; i++) {

            int element = arr[i];

            int newElement = element * 10;

            newArray[i] = newElement;
        }

        // return updated array
        return newArray;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        int ans[] = multiplyBy10(arr);

        System.out.println("Printing ans array:");

        for (int i : ans) {
            System.out.println( i );
        }
    }
}