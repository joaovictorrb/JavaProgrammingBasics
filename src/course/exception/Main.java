package course.exception;

public class Main {
    public static void doSomething() throws ArrayIndexOutOfBoundsException, NumberFormatException {
        int userInput = 0;
        userInput = Integer.parseInt("10"); // throws Exception
        String[] fruits = {"Banana", "Watermelon", "Apple", "Orange"};
        if (userInput == 0) throw new NumberFormatException(userInput + " is not a valid number");
        System.out.println("User picked "+fruits[userInput-1]);
    }
    public static void main(String[] args) {
        // Compile-Time -> Checked exceptions
        // Run-Time -> unchecked exceptions
        // int userInput = Integer.parseInt("0"); // throws Exception
//        int userInput = 0;
        try {
//            userInput = Integer.parseInt("10"); // throws Exception
//            String[] fruits = {"Banana", "Watermelon", "Apple", "Orange"};
//            if (userInput == 0) throw new NumberFormatException(userInput + " is not a valid number");
//            System.out.println("User picked "+fruits[userInput-1]);
            doSomething();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Invalid Number. Give a number between 1 and 4");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Test");


        // Rules to Create Custom Exception
        // User-Defined exception class must extend Exception class
        // The exception is thrown using throw keyword. If we throw an exception, we must handle the exception in code.
     }
}
