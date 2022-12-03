package course.polymorphism;

public class Leopard extends WildAnimal{
    @Override
    public void eat() {
        super.eat();
        System.out.println("Leopard is eating meat");
    }

    @Override
    public void run(){
        super.run();
    }
}
