package course.polymorphism;

public class Main {
    public static void main(String[] args) {
        // single interface multiple behavior
        // Method Overriding > the ability of define the behavior that is specific to your class type
        /* Rules to Override
        *   -> The argument list must match the overridden method
        *   -> The return type must be the same as, or a subtype of, the return type declared in the original
        *       overridden method in the superclass
        *   -> The access level can't be more restrictive than the overridden method's
        *   -> Instance methods can be overridden only if they are inherited by the subclass
        *   -> The overriding method CAN throw any unchecked exception
        * */
        Cat cat1 = new Cat();
        cat1.eat();
        cat1.setMinSpeed("3m/s");
        cat1.run();
        cat1.run(true);
        cat1.run(false);

        Leopard leo1 = new Leopard();
        leo1.eat();
        leo1.setMinSpeed("75m/s");
        leo1.run();


        /* Rules for Overloading Methods
        *  -> Overloaded methods MUST change the argument list
        *  -> Overloaded methods CAN change the return type
        *  -> Overloaded methods CAN change the access modifier
        * */
    }
}
