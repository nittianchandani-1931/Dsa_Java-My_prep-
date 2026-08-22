package BasicMaths;

public class printDigit {
    static void printDigits(int num) {
        // agar mere num ki value zero hoga to ami rukk jaunga
        // reverse in not equal to condition
        while (num != 0) {
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }
    }

    public static void main() {
        int num = 531234;
        printDigits(num);
    }
}
