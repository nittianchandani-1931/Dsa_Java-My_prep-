package String;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        // String fname = "Vikas";
        // String lname = new String("Chaurasiya");
        // System.out.println(fname + " " + lname);
        // System.out.println(fname.length());
        // System.out.println(fname.charAt(4));

        /// STRING COMPARISion

        // String name1 = "vikas";
        // String name2 = "VIKAS";
        // if (name1.equals(name2)) {
        // System.out.println("Both strings are equals");
        // } else {
        // System.out.println("Both strings are not equal");
        // }

        // STRING INPUT
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the string content:");
        String str = sc.nextLine();
        System.out.println("Value of nextLine:" + str);

        String str1 = sc.next();
        System.out.println("Value of next:" + str1);
    }
}