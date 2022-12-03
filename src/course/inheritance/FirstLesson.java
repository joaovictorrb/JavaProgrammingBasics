package course.inheritance;

import java.sql.SQLOutput;

public class FirstLesson {
    public static void main(String[] args) {
        // Child > Parents > Grandparents
        // Human < Artists
        //       < Musician

        // Inheritance
        // - To promote Reusability
        // - To promote Polymorphism

        Artist a1 = new Artist();
        // props from Human
        a1.name = "John";
        a1.gender = "Male";
        a1.age = 22;
        a1.walk();
        a1.speak();
        // props from artist
        a1.preparePainting();

        Musician m1 = new Musician();
        // props from human
        m1.name = "Olivia";
        m1.age = 30;
        m1.gender = "female";
        m1.walk();
        // speak is being Overridden by Musician class
        m1.speak();
        // props from musician
        m1.isComposingMusic();
        System.out.println(m1.BLOOD_COLOR);

        a1.speak();
    }
}
