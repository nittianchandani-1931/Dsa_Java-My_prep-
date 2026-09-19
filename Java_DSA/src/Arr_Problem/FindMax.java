// package Arr_Problem;

// public class maxelement_arr {

//     static int getMaximum(int arr[]) {
//         // int maxi = arr[0];

//         // for (int i = 0; i < arr.length; i++) {
//         // if (arr[i] > maxi) {
//         // maxi = arr[i];
//         // }
//         // }

//         // return maxi;
//         // }

//         // static void main() {
//         // int arr[] = { 3, 6, 8, 1, 23, 19, 31 };
//         // System.out.println(getMaximum(arr));

//     }

//     }

// }




//Method 2
package Arr_Problem;

public class FindMax {

    public static void main(String[] args) {

        int arr[] = {2, 5, 3, 9, 1};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            max = Math.max(max, arr[i]);
        }

        System.out.println("Maximum element = " + max);
    }
}