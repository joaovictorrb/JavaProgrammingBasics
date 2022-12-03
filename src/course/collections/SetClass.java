package course.collections;

import course.encapsulation.Person;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetClass {
    public static void main(String[] args) {
        HashSet<String> hst = new HashSet<>();
        hst.add("Apple");
        hst.add("Mango");
        hst.add("Orange");
        hst.add("Grape");
        hst.add("Orange");

        // dupes are eliminated
//        for (String hash: hst) {
//            System.out.println(hash);
//        }

        HashSet<String> newSet = new HashSet<>(hst);
        newSet.add("Watermelon");
        for (String fruit: newSet) {
            System.out.println(fruit);
        }

        System.out.println("");
        HashSet<Person> hst2 = new HashSet<>();
        hst2.add(new Person("Zia", 90, "Female"));
        hst2.add(new Person("Zia", 90, "Female"));
        hst2.add(new Person("Alex", 24, "Male"));
        hst2.add(new Person("Zia", 22, "Female"));
        for (Person p : hst2) {
            System.out.println(p.getName());
        }
        System.out.println("");

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Apple");
        lhs.add("Grape");
        lhs.add("Orange");

        for (String ft: lhs) {
            System.out.println(ft);
        }
        System.out.println("");

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Grape");

        for (String ft: ts) {
            System.out.println(ft);
        }
    }
}
