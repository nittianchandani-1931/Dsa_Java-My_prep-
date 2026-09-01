package BasicMaths;

import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();
        System.out.print("Enter height: ");
        int height = sc.nextInt();
        int volume = length * breadth * height;
        System.out.println("Volume of Cuboid = " + volume);
        sc.close();
    }
}
