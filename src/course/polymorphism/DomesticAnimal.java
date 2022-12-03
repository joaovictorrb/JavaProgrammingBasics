package course.polymorphism;

public class DomesticAnimal extends Animal{
    @Override
    public void eat() {
        System.out.println("Animal is eating inside the house");
    }

    @Override
    public void run() {
        System.out.println("Animal is running around the house at: " + getMinSpeed());
    }
}
