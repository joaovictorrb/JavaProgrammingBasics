package course.collections;

import java.util.LinkedList;
public class LinkedListClass {
    public static void main(String[] args) {
        // LinkedList -> faster than arrayList. ArrayList better to search.
        // DoublyLinkedList [prevNode, data, nextNode]
        LinkedList<String> l1 = new LinkedList<>();
        // l1.addFirst();
        // l1.addLast();
        l1.add("a");
        l1.add("d");
        l1.add("f");
        l1.addFirst("z");
        l1.add("m");
        l1.remove();
        System.out.println(l1);
        for (String c: l1) {
            System.out.println(c);
        }



    }
}
