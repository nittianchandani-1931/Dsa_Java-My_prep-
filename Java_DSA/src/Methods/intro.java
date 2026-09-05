package Methods;

// Methods declarations/definitions
public class intro {

    static void print2katable() {
        for (int i = 1; i <= 10; i++) {
            int ans = 2 * i;
            System.out.println("-> " + ans);
        }
    }

    static void printSum(int x, int y) {
        System.out.println("SUM: " + (x + y));
    }

    static void printMultiplication(int a, int b) {
        int ans = a * b;
        System.out.println("Result: " + ans);
    }

    static int add(int p, int q) {
        int sum = p + q;
        return sum;
    }

    static void main(String[] args) {
        int result = add(19, 31);
        System.out.println("Result:" + result);
        // printMultiplication(19, 31);

        // printSum(19, 31);
        // print2katable();
        // System.out.println("Hello");
        // System.out.println("THE END");
    }
}