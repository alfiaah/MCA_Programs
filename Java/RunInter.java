class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    public void run() {
        try {
            System.out.println("Thread " + name + " started.");
            Thread.sleep(500); // Suspend thread for 500 milliseconds
            System.out.println("Thread " + name + " finished.");
        } catch (InterruptedException e) {
            System.out.println("Thread " + name + " interrupted.");
        }
    }
}

public class RunInter {
    public static void main(String[] args) {
        int numThreads = 5; // Number of threads to create
        Thread[] threads = new Thread[numThreads];

        // Create and start threads
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(new MyRunnable("Thread-" + (i + 1)));
            threads[i].start();
        }

        // Main thread waits until all other threads have terminated
        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("All threads have finished executing.");
    }
}
