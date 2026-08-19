package BasicMaths;

public class Palindromnum {

    static int reverseNum(int num) {
        int reverseNum = 0;

        while (num != 0) {
            int digit = num % 10;

            reverseNum = reverseNum * 10 + digit;

            num = num / 10;
        }

        return reverseNum;
    }

    static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = reverseNum(num);

        if (originalNum == reversedNum) {
            System.out.println("It is Palindrome");
            return true;
        } else {
            System.out.println("It is not a Palindrome");
            return false;
        }
    }

    public static void main(String[] args) {
        boolean ans = isPalindrome(141);
        System.out.println(ans);
    }
}