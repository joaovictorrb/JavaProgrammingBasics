package course.collections;

import java.util.*;

public class MapClass {
    public static void main(String[] args) {
        // Unsorted un ordered -> HashMap

        // Hashing is the process of converting a key into another value called hash code. In hashing, hash functions
        // are used to link the key and value in HashMap
        HashMap<String, String> hm = new HashMap<>();
        hm.put("US", "United States");
        hm.put("BRA", "Brazil");
        hm.put("AR", "Argentina");
        hm.put("UK", "United Kingdom");
        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.get("UK"));
        for (Map.Entry<String,String> hash: hm.entrySet()) {
            System.out.println(hash.getKey() + ":" + hash.getValue());
        }
        hm.remove("AR");
        System.out.println(hm);

        System.out.println();

        Hashtable<String, String> ht = new Hashtable<>();
        ht.put("US", "United States");
        ht.put("BRA", "Brazil");
        ht.put("AR", "Argentina");
        ht.put("UK", "United Kingdom");
        for (Map.Entry<String,String> hash: ht.entrySet()) {
            System.out.println(hash.getKey() + ":" + hash.getValue());
        }

        System.out.println();

        LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
        lhm.put("US", "United States");
        lhm.put("BRA", "Brazil");
        lhm.put("AR", "Argentina");
        lhm.put("UK", "United Kingdom");
        for (Map.Entry<String,String> hash: lhm.entrySet()) {
            System.out.println(hash.getKey() + ":" + hash.getValue());
        }

        System.out.println();

        TreeMap<String, String> tm = new TreeMap<>();
        tm.put("US", "United States");
        tm.put("BRA", "Brazil");
        tm.put("AR", "Argentina");
        tm.put("UK", "United Kingdom");
        for (Map.Entry<String,String> hash: tm.entrySet()) {
            System.out.println(hash.getKey() + ":" + hash.getValue());
        }
    }
}
