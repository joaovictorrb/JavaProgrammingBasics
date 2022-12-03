package course.string;

public class Main {
    public static void main(String[] args) {
        // String immutable / final
        // Can be created
        // -> Using a new Operator
        // -> Using String Literal

        String s1 = new String("String Operator");
        String s2 = new String("String Operator");
        // s1 != s2 => Because they are different objects
        // s1.equals(s2) => It is comparing the values of the objects, so they are equal
        if(s1 != s2) {
            System.out.println("Different Objects");
            if (s1.equals(s2)) System.out.println("Different Objects, same values!");
        }


        String sl1 = "String Literals";
        String sl2 = "String Literals";
        // s1 == s2 => They are exactly the same
        if (sl1 == sl2) {
            System.out.println("We are EQUALS!");
        }


        String sl3 = "Lets concat:" ;
        sl3 = sl3.concat(sl2);
        System.out.println(sl3);

        String sl4 = "Welcome to Java\n";
        System.out.println(sl4.charAt(0));
        System.out.println(sl4.concat(sl3));
        System.out.println("CONCAT " + sl4);
        System.out.println(sl4.length());
        System.out.println(sl4.replace(" ", "-"));
        System.out.println(sl3.substring(0,5));
        System.out.println(sl3.toLowerCase());
        System.out.println(sl3.toUpperCase());
        System.out.println(sl3.trim());


        // StringBuffer -> Thread-Safe | StringBuilder -> Not Thread-Safe
        System.out.println("======================\n======================");
        StringBuffer sl5 = new StringBuffer("Welcome ");
        sl5.append("It is mutable");
//        sl5.charAt()
//        sl5.delete()
//        sl5.toString()\
        System.out.println(sl5);
        sl5.insert(8, "hahaha ");
        System.out.println(sl5);
        StringBuilder sl6 = new StringBuilder("Welcome 2 ");
        sl6.append("It is mutable 2");
        System.out.println(sl6);
    }
}
