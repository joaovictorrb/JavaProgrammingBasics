package course.java_variables;


/**
 * Types of Variables
 * ==> Primitives               ==> Reference
 *  --> boolean                  --> anything ( object )
 *  --> char                       -> Object ReferenceVariable = new Object();
 *  --> byte
 *  --> int
 *  --> short
 *  --> long
 *  --> double
 *  --> float
 *  => Instance Variable      => Local
 *   --> Inside a class        --> Inside a method
 *  -----------
 *  => Variable Modifiers
 *   --> final      -> constant variable, cannot be empty                   (INSTANCE and LOCAL variables)
 *   --> public     -> accessible by everyone                               (INSTANCE ONLY)
 *   --> private    -> cannot be accessed outside the class                 (INSTANCE ONLY)
 *   --> default    -> cannot be accessed outside package                   (INSTANCE ONLY)
 *   --> protected  -> package level and subclasses from another package    (INSTANCE ONLY)
 *   --> static     -> common for all the objects created from the class    (INSTANCE ONLY)
 *   --> transient  ->                                                      (INSTANCE ONLY)
 *   --> volatile   ->                                                      (INSTANCE ONLY)
 */
public class Main {
    int instanceVar;
    public static void main(String[] args) {
        int localVar;
        localVar = 5;
        System.out.println(localVar);

        Main mainInstance = new Main();
        System.out.println(mainInstance.instanceVar);
    }
}
