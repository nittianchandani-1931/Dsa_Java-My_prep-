package BasicMaths;

public class sumdigit {

    static int sumDigits(int num) {
        // agar mere num ki value zero hoga to ami rukk jaunga
        // reverse in not equal to condition
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            // System.out.println(digit);
            num = num / 10;
        }
        return sum;
    }

    public static void main() {
        int num = 531234;
        int ans = sumDigits(num);
        System.out.println(ans);
        // contDigits(num);
    }
}
