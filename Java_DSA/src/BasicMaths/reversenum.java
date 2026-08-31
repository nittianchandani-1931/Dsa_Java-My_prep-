package BasicMaths;

public class reversenum {

    static int reverseNum(int num) {
        int revNum = 0;
        // ans = ans * 10 + currentDigit
        while (num != 0) {
            int digit = num % 10;
            // reverse number calculate kr leta hu as per formula
            revNum = revNum * 10 + digit;
            // last digit remove krna pdega number se
            num = num / 10;
        }
        return revNum;
    }

    static void main() {
        int num = 1234;
        int revNum = reverseNum(num);
        System.out.println(revNum);
    }

}