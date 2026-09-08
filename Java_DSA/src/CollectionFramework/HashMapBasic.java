// package CollectionFramework;

// import java.util.Map;
// // import java.util.Collections;
// import java.util.HashMap;
// import java.util.Set;
// import java.util.Collection;

// public class HashMapBasic {
//     public static void main(String[] args) {
//         Map<String, String> mapping = new HashMap<>();

//         // Insertion

//         mapping.put("in", "India");
//         mapping.put("en", "England");
//         mapping.put("us", "UnitedState");
//         System.out.println(mapping);

//         Map<String, String> table = new HashMap<>();
//         table.put("br", "Brazil");
//         table.put("uk", "United Kingdom");
//         System.out.println("Before: " + table);
//         table.putAll(mapping);
//         System.out.println("After: " + table);

//         // Deletion
//         table.remove("en");
//         System.out.println(table);

//         System.out.println(table.get("uk"));
//         System.out.println(table.getOrDefault("usa", "NONE"));

//         System.out.println(table.containsKey("in"));
//         System.out.println(table.containsValue("London"));

//         System.out.println(table);
//         table.replace("in", "Indonesia");
//         System.out.println(table);

//         Set<String> keySet = table.keySet();
//         System.out.println(keySet);

//         Collection<String> valueSet = table.values();
//         System.out.println(valueSet);

//         // get all entries from map
//         Set<Map.Entry<String, String>> entrySet = table.entrySet();
//         System.out.println("Printing Entries: "+ entrySet);

//         // table.putIfAbsent("is", "india3");
//         // System.out.println(table);

//         Map<Integer, String> map = new HashMap<>();
//         map.put(1, "One");
//         map.put(2, "Two");
//         for (Map.Entry<Integer, String> entry : map.entrySet()) {
//             System.out.println("Key: " + entry.getKey() + ", value:" + entry.getValue());
//         }

//     }
// }

// Map as LinkedList

package CollectionFramework;

import java.util.Map;
// import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.Collection;

public class HashMapBasic {
    public static void main(String[] args) {
        // Map<String, String> mapping = new LinkedHashMap<>();
                Map<String, String> mapping = new TreeMap<>();


        // Insertion

        mapping.put("in", "India");
        mapping.put("en", "England");
        mapping.put("us", "UnitedState");
        System.out.println(mapping);

        Map<String, String> table = new HashMap<>();
        table.put("br", "Brazil");
        table.put("uk", "United Kingdom");
        System.out.println("Before: " + table);
        table.putAll(mapping);
        System.out.println("After: " + table);

        // Deletion
        table.remove("en");
        System.out.println(table);

        System.out.println(table.get("uk"));
        System.out.println(table.getOrDefault("usa", "NONE"));

        System.out.println(table.containsKey("in"));
        System.out.println(table.containsValue("London"));

        System.out.println(table);
        table.replace("in", "Indonesia");
        System.out.println(table);

        Set<String> keySet = table.keySet();
        System.out.println(keySet);

        Collection<String> valueSet = table.values();
        System.out.println(valueSet);

        // get all entries from map
        Set<Map.Entry<String, String>> entrySet = table.entrySet();
        System.out.println("Printing Entries: "+ entrySet);

        // table.putIfAbsent("is", "india3");
        // System.out.println(table);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", value:" + entry.getValue());
        }

    }
}
