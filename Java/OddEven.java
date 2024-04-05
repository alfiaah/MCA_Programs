import java.io.*;

class OddThread extends Thread {
public void run() {
for (int i = 1; i <= 100; i += 2) {
System.out.println("Odd: " + i);
try {
Thread.sleep(100); // Just to slow down the output for better visibility
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}
}

class EvenThread extends Thread {
public void run() {
for (int i = 2; i <= 100; i += 2) {
System.out.println("Even: " + i);
try {
Thread.sleep(100); // Just to slow down the output for better visibility
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}
}

public class OddEven {
public static void main(String[] args) {
OddThread oddThread = new OddThread();
EvenThread evenThread = new EvenThread();

// Start both threads
oddThread.start();
evenThread.start();

try {
// Wait for both threads to finish
oddThread.join();
evenThread.join();
} catch (InterruptedException e) {
e.printStackTrace();
}

System.out.println("Main thread exiting.");
}
}
