package BasicMaths;

public class Gcd {

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

    static void main() {
        System.out.println(getGCD(12, 18));
    }

}
