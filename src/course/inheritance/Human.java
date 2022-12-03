package course.inheritance;

public abstract class Human implements HumanInterface {
    String name;
    String gender;
    int age;

    public abstract void walk();

    public void speak() {
        HumanInterface.super.speak();
    }

}
