package course.collections;

import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        Vector<String> v1 = new Vector<>();;
        v1.add("a");
        v1.add("b");
        v1.add("c");
        for (String v: v1) {
            System.out.println(v);
        }
    }
}
