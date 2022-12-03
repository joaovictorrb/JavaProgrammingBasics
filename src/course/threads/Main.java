package course.threads;

public class Main {
    public static void main(String[] args) {
        // threads -> multiple executions at the same time
        // MultiThreading is a process of executing multiple threads simultaneously
        /*
         * Extending the java.lang.Thread class
         * Implements the Runnable interface
         *
         * You have to override run()
         *
         * To run a job in Thread
         *  -> Extend Thread class or Implementing Runnable Interface
         *  -> Override run method and implement the job
         *
         *
         *
         *                     v<- Waiting Block <-^
         * NEW THREAD -----> Runnable ------> Running ----> Dead
         * */

//        MyThreadExtension tE = new MyThreadExtension();
//        tE.start();

        MyThreadImplements tI = new MyThreadImplements();
        Thread t1 = new Thread(tI);
        t1.setName("T1");
        Thread t2 = new Thread(tI);
        t2.setName("T2");
        Thread t3 = new Thread(tI);
        t3.setName("T3");
        Thread t4 = new Thread(tI);
        t4.setName("T4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
