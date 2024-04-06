class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thread: " + getName() + ", Priority: " + getPriority());
    }
}

public class PThread {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 3");

        // Set priorities for threads
        thread1.setPriority(Thread.MIN_PRIORITY); // Minimum priority
        thread2.setPriority(Thread.NORM_PRIORITY); // Normal priority
        thread3.setPriority(Thread.MAX_PRIORITY); // Maximum priority

        // Start threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
