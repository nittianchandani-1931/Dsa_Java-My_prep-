package BasicMaths;

public class Lcm {

    static int getGCD(int a, int b) {
        // get(a,b) = gcd(b,a%b)
        while (b != 0) {
            int oldValueOfb = b;
            b = a % b;
            a = oldValueOfb;
        }
        // jb mera b 0 hoga , tab a ki place pr gcd milega
        int ans = a;
        return ans;

    }

    static int getLCM(int a, int b) {
        int gcd = getGCD(a, b);
        int prod = a * b;
        int lcm = prod / gcd;
        return lcm;
    }

    static void main() {
        System.out.println(getGCD(12, 18));
        System.out.println(getLCM(18, 12));
    }

}
