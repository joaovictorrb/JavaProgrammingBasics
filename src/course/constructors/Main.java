package course.constructors;

import course.classes_and_objects.Objects.Person;

public class Main {
    public static void main(String[] args) {
        Person personTest = new Person();
        // Person -> Obj        // Person -> Constructor

        // Java compiler has a default constructor.

        /**
         * 1-> If you don't have a constructor for a class compiler will create a default constructor
         * 2-> If you create a default constructor, compiler only includes a no-arg call to super class constructor
         * 3-> If you create your own constructor, compiler won't create a default constructor
         * 4-> The default constructor includes a no-arg call to the super constructor
         * 5-> Super() or this() will be the first line of the constructor
         * 6-> If the parent class don't have a default constructor, then super call should manually pass the arguments
         *      based on super class constructor
         * ------------------------------------------------------------------
         * "Rules" for Constructors:
         *  1 -> Constructors can use any access modifier
         *  2 -> Must be matched with the class name
         *  3 -> Must not have a return type
         *  4 -> The only way to call a constructor is from another constructor using super() or this()
         *  5 -> All the classes will have constructors ( Interfaces will not have any constructor )
         *  6 -> You cannot make a call to an instance method, or access an instance variable, until after the
         *        super constructor runs
         *  7 -> If you do not have a constructor in your class, the compiler will automatically generate
         *        a default constructor
         *  8 -> If you create your own constructor, the compiler will not create a default constructor
         *  9 -> If parent class do not have a default constructor, you should call parent class constructor by super()
         *        with a proper argument
         * ------------------------------------------------------------------
         */
    }
}
