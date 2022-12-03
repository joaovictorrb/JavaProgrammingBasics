package course.encapsulation;

public class Main {
    public static void main(String[] args) {
        // show the necessary details and hiding the rest
        // using getter and setter
        Person alex = new Person("Alex", 10, "Male");
        alex.sleep();

        Person mia = new Person();
//        mia.name = "Mia";
//        mia.age = 40;
//        mia.gender = "Female";
        // Encapsulation applied
        mia.setName("Mia");
        mia.setAge(40);
        mia.setGender("Female");
        mia.sleep();
    }
}
