package BasicMaths;

public class Armstrongnum {

    static void printDigits(int num) {
        // agar mere num ki value zero hoga to ami rukk jaunga
        // reverse in not equal to condition
        while (num != 0) {
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;

        }
    }

    static boolean isArmstrongNumber(int num) {

        int sum = 0;
        int originalNum = num;
        while (num != 0) {
            int digit = num % 10;
            int cubeOfDigit = digit * digit * digit;
            sum = sum + cubeOfDigit;
            num = num / 10;
        }
        if (sum == originalNum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main() {

        System.out.println(isArmstrongNumber(152));
    }
}
