import java.util.Random;

class RandomNumberGenerator extends Thread {
    public void run() {
        Random random = new Random();
        while (true) {
            int randomNumber = random.nextInt(100); // Generating random integer between 0 and 99
            System.out.println("Generated Random Number: " + randomNumber);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (randomNumber % 2 == 0) {
                // If the random number is even, notify the square thread
                synchronized (SquareThread.lock) {
                    SquareThread.number = randomNumber;
                    SquareThread.lock.notify();
                }
            } else {
                // If the random number is odd, notify the cube thread
                synchronized (CubeThread.lock) {
                    CubeThread.number = randomNumber;
                    CubeThread.lock.notify();
                }
            }
        }
    }
}

class SquareThread extends Thread {
    public static final Object lock = new Object();
    public static int number;

    public void run() {
        while (true) {
            synchronized (lock) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int square = number * number;
                System.out.println("Square of " + number + " is: " + square);
            }
        }
    }
}

class CubeThread extends Thread {
    public static final Object lock = new Object();
    public static int number;

    public void run() {
        while (true) {
            synchronized (lock) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int cube = number * number * number;
                System.out.println("Cube of " + number + " is: " + cube);
            }
        }
    }
}

public class MulThreeThread {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        SquareThread squareThread = new SquareThread();
        CubeThread cubeThread = new CubeThread();

        // Start all threads
        randomNumberGenerator.start();
        squareThread.start();
        cubeThread.start();
    }
}
