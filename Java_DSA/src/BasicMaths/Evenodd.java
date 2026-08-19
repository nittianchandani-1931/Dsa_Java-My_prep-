package BasicMaths;

import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("The given number is even");
        } else {
            System.out.println("The number is odd");
        }
        sc.close();

    }
}
