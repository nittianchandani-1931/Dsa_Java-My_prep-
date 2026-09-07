package CollectionFramework;

import java.util.HashSet;
// import java.util.LinkedHashSet;
// import java.util.Set;
// import java.util.TreeSet;

public class HashSetBasic {
    public static void main(String[] args) {

        HashSet<Student> set = new HashSet<>();
        Student s1 = new Student(1, "Vikas");
        Student s2 = new Student(1, "Vikas");
        Student s3 = new Student(1, "Vikas");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);

        // Set<Integer> st1 = new HashSet<>();
        // Set<Integer> st2 = new HashSet<>();

        // st1.add(12);
        // st1.add(90);
        // st1.add(122);
        // st1.add(900);
        // st1.add(2);
        // st1.add(45);

        // st2.add(12);
        // st2.add(90);
        // st2.add(1232);
        // st2.add(900);
        // st2.add(26);
        // st2.add(45);
        // System.out.println(st1);
        // st1.retainAll(st2); // Intersection of both set

        // System.out.println(st1);
        // System.out.println(st2);

        // System.out.println(st1.containsAll(st2));
        // System.out.println(st2.containsAll(st1));

        // Set<Integer> st = new LinkedHashSet<>(); // order preserve hota h
        // st.add(31);
        // st.add(19);

        // st.add(31);
        // st.add(31);
        // st.add(21);

        // st.add(31);
        // st.add(31);
        // st.add(19);
        // System.out.println(st);
        /*
         * Hashedset ->0(1)
         * LinkedHashSet -> 0(n)
         * TreeSet -> BST -> 0(logn)
         * 
         * 
         */

        // Set<Integer> st = new TreeSet<>(); // sorted array me milega o/p
        // st.add(31);
        // st.add(19);

        // st.add(31);
        // st.add(31);
        // st.add(21);

        // st.add(31);
        // st.add(31);
        // st.add(19);
        // System.out.println(st);

        // Set<Integer> st = new HashSet<>();
        // st.add(31);
        // st.add(19);

        // st.add(31);
        // st.add(31);
        // st.add(19);

        // st.add(31);
        // st.add(31);
        // st.add(19);
        // st.add(19);
        // st.add(19);

        // st.add(8);
        // st.add(5);
        // System.out.println(st);
        // Order preserve nhi krta h mtlb random order me elmeents milega
    }

}
