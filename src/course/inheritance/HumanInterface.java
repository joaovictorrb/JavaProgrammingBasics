package course.inheritance;

public interface HumanInterface {
    // all variables must be final
    String BLOOD_COLOR = "red";


    public void walk();
    default public void speak() {
        System.out.println("I am from human interface");
    };
}
