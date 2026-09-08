package CollectionFramework;
import java.util.Comparator;
import java.util.*;
import java.util.Arrays;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Collections;
// import java.util.Comparator;

public class comparableInterface {
    public static void main(String[] args) {

        Integer[] arr = { 2, 5, 98, 19, 31, 89, 90 };
        Arrays.sort(arr, new reversecomparator());
        for (int a : arr) {
            System.out.print(a + " ");
        }
        // List<BtechStudent> students = new ArrayList<>();
        // students.add(new BtechStudent(19, "Vikas", 45));
        // students.add(new BtechStudent(24, "Vikrant", 65));
        // students.add(new BtechStudent(29, "Viplav", 55));
        // students.add(new BtechStudent(24, "Vansh", 49));
        // students.add(new BtechStudent(18, "Vedik", 48));

        // students.add(new BtechStudent(22, "Ved", 60));

        // System.out.println(students);
        // Collections.sort(students, new WeightComparator());

        // System.out.println(students); // List<Integer> list = new ArrayList<>();

        // // list.add(45);
        // // list.add(19);
        // // list.add(31);
        // // list.add(8);
        // // list.add(5);
        // // System.out.println(list);

        // // Collections.sort(list);
        // // System.out.println(list);
    }
}