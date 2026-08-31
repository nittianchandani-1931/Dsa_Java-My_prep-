
package BasicMaths;

public class Prime_1to_N {

    // Print all prime numbers from 1 to N
    static void printAllPrimes(int n) {

        for (int num = 2; num <= n; num++) {

            boolean isPrime = isPrimeOrNot(num);

            if (isPrime) {
                System.out.println(num);
            }
        }
    }

    // Check whether a number is prime or not
    static boolean isPrimeOrNot(int num) {

        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        printAllPrimes(100);
    }
}