package course.java_variables;

import course.classes_and_objects.Objects.Person;

public class Array {
    public static void main(String[] args) {
        int[] myArray = new int[3];

        myArray[0] = 5;
        myArray[1] = 56;
        myArray[2] = 544;
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.println(myArray[i]);
//        }
//        System.out.println("Improved for\n");
        for (int elementsInArray : myArray) {
            System.out.println(elementsInArray);
        }


        Person[] users = new Person[3];
        Person john = new Person("John", 23, "Male");
        users[0] = john;

        Person mia = new Person("Mia", 9, "Female");
        users[1] = mia;

        Person maicon = new Person("Maicon", 67, "Male");
        users[2] = maicon;

        System.out.println(users[2].age);
    }
}
