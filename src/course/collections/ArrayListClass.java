package course.collections;

import course.encapsulation.Person;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {
    public static void main(String[] args) {
        // Ordered / unsorted
//        ArrayList<> a1 = new ArrayList();
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Potato");
        a1.add("Lettuce");
        a1.add(1, "Cabbage");
        //  a1.add(new Person("Alex", 22, "Male"));

        //   System.out.println(((Person)a1.get(1)).getName());
        System.out.println(a1);
        for (String veggie : a1) {
            System.out.println(veggie);
        }
        //  a1.remove("Lettuce");
        // System.out.println(a1);
        //  a1.clear();
        //  System.out.println(a1);
        Collections.sort(a1);
        /*
         * collection: Data Structure
         * Collection: Root interface for collection framework from java.util package
         * CollectionS: Class from java.util package
         * */
        System.out.println();
        for(String ordVeggie: a1) {
            System.out.println(ordVeggie);
        }
        System.out.println();

        ArrayList<Person> a2 = new ArrayList<>();
        a2.add(new Person("Ana", 24, "Female"));
        a2.add(new Person("Rogerio", 75, "Male"));
        a2.add(new Person("Alexandre", 10, "Male"));
        Collections.sort(a2);
        for(Person p: a2){
            System.out.println(p.getName());
        }
    }
}
