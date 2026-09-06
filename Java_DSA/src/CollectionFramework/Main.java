// package CollectionFramework;

// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.Collection;
// import java.util.Collections;

// public class Main {
//     public static void main(String[] args) {

//         // List or collection -> interface

//         // ArraayList -> concrete class
//         ArrayList<Integer> list = new ArrayList<>();

//         // add
//         list.add(10);
//         list.add(20);
//         list.add(30);
//         System.out.println(list);
//         list.add(40);
//         System.out.println(list);

//         // remove
//         list.remove(0);
//         System.out.println(list);

//         // addAll
//         ArrayList<Integer> list2 = new ArrayList<>();
//         list2.add(50);
//         list2.add(60);
//         list2.add(70);
//         System.out.println(list2);

//         list.addAll(list2);
//         System.out.println(list);
//         list.removeAll(list2);
//         System.out.println(list);
//         System.out.println(list.size());

//         System.out.println("Printing list2: " + list2);
//         list2.clear();
//         // System.out.println("Printing list2 after clear: " + list2);
//         System.out.println(list2.size());

//         // I want to traverse list using iterator
//         Iterator<Integer> iterator = list.iterator();
//         while (iterator.hasNext()) {
//             System.out.println("Element: " + iterator.next());
//         }
//         ArrayList<Integer> list3 = new ArrayList<>();
//         list3.add(100);
//         list3.add(200);
//         list3.add(300);
//         System.out.println(list3.get(1));
//         System.out.println("Before set:" + list3);
//         list3.set(0, 500);
//         System.out.println("After set:" + list3);

//         // toarray
//         Object[] arr = list3.toArray();
//         for (Object obj : arr) {
//             System.out.println(obj);
//         }
//         // Contains()
//         System.out.println(list3.contains(2000));

//         list.add(700);
//         list.add(5);
//         System.out.println("Printing Entire list: " + list);

//         // sort
//         Collections.sort(list);
//         System.out.println("Printing Entire list after sorting: " + list);
//         // HW- how to soert in descending order
//         Collections.sort(list, Collections.reverseOrder());
//         System.out.println("Printing Entire list after sorting in descending order: " + list);

//         //
//         ArrayList<Integer> newlist = (ArrayList<Integer>) list.clone();
//         System.out.println("Printing Entire newlist after cloning: " + newlist);
//         ArrayList<Integer> marks = new ArrayList<>();
//         marks.ensureCapacity(500);

//         System.out.println(newlist.isEmpty());
//         System.out.println(marks.isEmpty());
//         System.out.println(newlist.indexOf(5));
//     }
// }

//LinkedList
// package CollectionFramework;

// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.Collection;
// import java.util.Collections;
// import java.util.LinkedList;

// public class Main {
//     public static void main(String[] args) {

//         // List or collection -> interface

//         // LinkedList -> concrete class
//         LinkedList<Integer> list = new LinkedList<>();

//         // add
//         list.add(10);
//         list.add(20);
//         list.add(30);
//         System.out.println(list);
//         list.add(40);
//         System.out.println(list);

//         // remove
//         list.remove(0);
//         System.out.println(list);

//         // addAll
//         LinkedList<Integer> list2 = new LinkedList<>();
//         list2.add(50);
//         list2.add(60);
//         list2.add(70);
//         System.out.println(list2);

//         list.addAll(list2);
//         System.out.println(list);
//         list.removeAll(list2);
//         System.out.println(list);
//         System.out.println(list.size());

//         System.out.println("Printing list2: " + list2);
//         list2.clear();
//         // System.out.println("Printing list2 after clear: " + list2);
//         System.out.println(list2.size());

//         // I want to traverse list using iterator
//         Iterator<Integer> iterator = list.iterator();
//         while (iterator.hasNext()) {
//             System.out.println("Element: " + iterator.next());
//         }
//         LinkedList<Integer> list3 = new LinkedList<>();
//         list3.add(100);
//         list3.add(200);
//         list3.add(300);
//         System.out.println(list3.get(1));
//         System.out.println("Before set:" + list3);
//         list3.set(0, 500);
//         System.out.println("After set:" + list3);

//         // toarray
//         Object[] arr = list3.toArray();
//         for (Object obj : arr) {
//             System.out.println(obj);
//         }
//         // Contains()
//         System.out.println(list3.contains(2000));

//         list.add(700);
//         list.add(5);
//         System.out.println("Printing Entire list: " + list);

//         // sort
//         Collections.sort(list);
//         System.out.println("Printing Entire list after sorting: " + list);
//         // HW- how to soert in descending order
//         Collections.sort(list, Collections.reverseOrder());
//         System.out.println("Printing Entire list after sorting in descending order: " + list);

//         //
//         // LinkedList<Integer> newlist = (LinkedList<Integer>) list.clone();
//         // System.out.println("Printing Entire newlist after cloning: " + newlist);
//         ArrayList<Integer> marks = new ArrayList<>();
//         marks.ensureCapacity(500);

//         // System.out.println(newlist.isEmpty());
//         System.out.println(marks.isEmpty());
//         list.add(30);
//         list.add(94);
//         list.add(30);
//         System.out.println("Printing original list: " + list);
//         // System.out.println(list.indexOf(5));
//         System.out.println("Printing last index of 30: " + list.lastIndexOf(30));

//         // Add first and add last
//         list.remove(3);
//         list.remove(3);
//         list.remove(3);
//         System.out.println("Printing original list: " + list);
//         // list.addFirst(1000);

//         LinkedList<Integer> ll = new LinkedList<>();
//         ll.add(19);
//         System.out.println("Printing ll: " + ll);
//         ll.addFirst(1);
//         System.out.println("Printing ll after addFirst: " + ll);
//         ll.addLast(31);
//         System.out.println("Printing ll after addLast: " + ll);
//         System.out.println("First element: " + ll.getFirst());
//         System.out.println("Last element: " + ll.getLast());
//         System.out.println("before :" + ll);
//         // System.out.println(ll.poll());
//         // System.out.println("after :" + ll);
//         System.out.println(ll.peek());
//         System.out.println("after :" + ll);

//         // ll.removeFirst();
//         // ll.removeLast();
//         // System.out.println("Printing ll after removeFirst and last: " + ll);

//     }

// }


//VECTOR
package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        // List or collection -> interface

        // LinkedList -> concrete class
        Vector<Integer> list = new Vector<>();

        // add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);

        // remove
        list.remove(0);
        System.out.println(list);

        // addAll
        Vector<Integer> list2 = new Vector<>();
        list2.add(50);
        list2.add(60);
        list2.add(70);
        System.out.println(list2);

        list.addAll(list2);
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);
        System.out.println(list.size());

        System.out.println("Printing list2: " + list2);
        list2.clear();
        // System.out.println("Printing list2 after clear: " + list2);
        System.out.println(list2.size());

        // I want to traverse list using iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }
        Vector<Integer> list3 = new Vector<>();
        list3.add(100);
        list3.add(200);
        list3.add(300);
        System.out.println(list3.get(1));
        System.out.println("Before set:" + list3);
        list3.set(0, 500);
        System.out.println("After set:" + list3);

        // toarray
        Object[] arr = list3.toArray();
        for (Object obj : arr) {
            System.out.println(obj);
        }
        // Contains()
        System.out.println(list3.contains(2000));

        list.add(700);
        list.add(5);
        System.out.println("Printing Entire list: " + list);

        // sort
        Collections.sort(list);
        System.out.println("Printing Entire list after sorting: " + list);
        // HW- how to soert in descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Printing Entire list after sorting in descending order: " + list);

        //
        // LinkedList<Integer> newlist = (LinkedList<Integer>) list.clone();
        // System.out.println("Printing Entire newlist after cloning: " + newlist);
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(500);

        // System.out.println(newlist.isEmpty());
        System.out.println(marks.isEmpty());
        list.add(30);
        list.add(94);
        list.add(30);
        System.out.println("Printing original list: " + list);
        // System.out.println(list.indexOf(5));
        System.out.println("Printing last index of 30: " + list.lastIndexOf(30));

        // Add first and add last
        list.remove(3);
        list.remove(3);
        list.remove(3);
        System.out.println("Printing original list: " + list);
        // list.addFirst(1000);

        Vector<Integer> ll = new Vector<>();
        ll.add(19);
        System.out.println("Printing ll: " + ll);
        ll.addFirst(1);
        System.out.println("Printing ll after addFirst: " + ll);
        ll.addLast(31);
        System.out.println("Printing ll after addLast: " + ll);
        System.out.println("First element: " + ll.getFirst());
        System.out.println("Last element: " + ll.getLast());
        System.out.println("before :" + ll);
        // System.out.println(ll.poll());
        // System.out.println("after :" + ll);
        // System.out.println(ll.peek());
        System.out.println("after :" + ll);

        // ll.removeFirst();
        // ll.removeLast();
        // System.out.println("Printing ll after removeFirst and last: " + ll);

    }

}