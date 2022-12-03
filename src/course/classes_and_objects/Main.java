package course.classes_and_objects;

import course.classes_and_objects.Objects.Person;

/**
 * Types of methods
 * -> PUBLIC: Any code and anywhere the properties can be accessed
 * -> PROTECTED: Code in the same package can accessed and also subclasses from other package can access
 * -> DEFAULT: Code in the same package can access
 * -> PRIVATE: code within the same class can access
 * */

public class Main {
    // Rule No1:
    // -> If you have a public class in your file,
    // -> the name of the fle must match with the name of the public class
    public static void main(String[] args) {
        // Rule No2:
        // -> Public class of your source file must have the main method

        Person john = new Person("John", 23, "Male");
        john.sleep();

        Person mia = new Person("Mia", 9, "Female");
        mia.sleep();

        Person maicon = new Person();
        maicon.setName("Maicon");
        maicon.setAge(67);
        maicon.setGender("Male");

        maicon.sleep();

    }
}
