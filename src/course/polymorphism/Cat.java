package course.polymorphism;

public class Cat extends DomesticAnimal{
    @Override
    public void eat() {
        super.eat();
        System.out.println("Cat is drinking milk");
    }

    public void run(boolean hasDanger) {
        if (hasDanger) {
            System.out.println("Cat is running at: 6m/s");
        } else {
            System.out.println("Cat is running at: " + getMinSpeed());
        }
    }
}
