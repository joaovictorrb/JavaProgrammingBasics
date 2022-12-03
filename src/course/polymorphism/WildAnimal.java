package course.polymorphism;

public class WildAnimal extends Animal{
    @Override
    public void eat() {
        System.out.println("Animal is eating in the wilderness");
    }

    @Override
    public void run() {
        System.out.println("Animal is running in the wilderness at: " + getMinSpeed());
    }
}
