public class Bitwiseoperator {

    public static void main() {
        // int a = 5;
        // int b = 6;
        // System.out.println(a & b);
        // System.out.println(a | b);
        // System.out.println(a ^ b);
        // System.out.println(~a);

        // Bitwise left shift <<
        // int n = 5;
        // for (int i = 1; i <= 32; i++) {
        // n = n << 1;
        // System.out.println(n);
        // System.out.println();}

        // bitwise right shift >>

        // int n = 50;
        // for (int i = 1; i <= 32; i++) {
        // n = n >> 1;
        // System.out.println(n);
        // }

        // FOr checking whether number is even or odd by general method of modulas
        // int n = 11;
        // if (n % 2 == 0) {
        // System.out.println("The given number is even" + n);
        // } else {
        // System.out.println("The given number is odd number");
        // }

        // // And here is another way of checking odd even by bitwise and operator
        // int n=28;
        // if ((n & 1) == 1) {
        // System.out.println("The number is odd");
        // } else {
        // System.out.println("The number is even");
        // }

        // counting and printing set bit
        // int n = 10;
        // int count = 0;
        // while (n != 0) {
        // if ((n & 1) != 0) {
        // // mujhe ek set bit mil gy
        // count++;
        // }
        // // right shift to remove this bit
        // n = n >> 1;

        // }
        // System.out.println("Set bit count: " + count);

        // For checking power of 2
        // int n = 32;
        // if ((n &(n - 1)) == 0) {
        // System.out.println("The given number is power of 2");
        // } else {
        // System.out.println("The number is not power of 2");
        // }

        // /// Swapping two number using XOR
        // int a = 5;
        // int b = 6;
        // a = a ^ b;
        // b = a ^ b;
        // a = a ^ b;
        // System.out.println("a=" + a);

        // System.out.println("b=" + b);

        /// Finding unique element from serires of number whwn all numbers gievn twice
        /// and a single number is uniuqe

        // int[] nums = {10, 24, 17, 24, 10, 13, 17};

        // int ans = 0;

        // for (int i = 0; i < nums.length; i++) {
        // ans = ans ^ nums[i];
        // }

        // System.out.println("Unique number = " + ans);

        // Removing last set bit
        int n = 10;
        System.out.println(n & (n - 1));
        // getting last bit
        int n1 = 10;
        System.out.println(n & -(n));

    }
}
