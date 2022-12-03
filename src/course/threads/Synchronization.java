package course.threads;

public class Synchronization implements Runnable {
    @Override
    public void run() { // public synchronized void run()
//        synchronized (this) {
//            for (int i=0; i < 3; i++) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + ": " + i);
//            }
//        }

        try {
            System.out.println("Thread going to sleep ( 10s ) :: "+ Thread.currentThread().getName());
            Thread.sleep(10000);
            synchronized (this) {
                this.notifyAll();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void waiting() {
        System.out.println("Thread :: " + Thread.currentThread().getName() + " :: Entered");
        synchronized (this) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread :: " + Thread.currentThread().getName() + " :: Leaving ");

    }

    public static void main(String[] args) {
//        System.out.println("Thread :: " + Thread.currentThread().getName());
        Synchronization tI = new Synchronization();
        Thread a = new Thread(tI);
        a.setName("A");
//        a.setPriority(3);
//        Thread b = new Thread(tI);
//        b.setName("B");
//        b.setPriority(9);
//        Thread c = new Thread(tI);
//        c.setName("C");
//        c.setPriority(1);

        a.start();
        tI.waiting();
        Thread.yield();
//        b.start();
//        c.start();
    }
}
