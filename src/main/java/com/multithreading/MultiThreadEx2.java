package com.multithreading;

import java.util.stream.IntStream;

/**
 * Output:
 * App started
 * print elem from MyTask: 0
 * print elem from MyTask: 1
 * print elem from MyTask: 2
 * print elem from MyTask: 3
 * print elem from MyTask: 4
 * print elem from main(): 0
 * print elem from main(): 1
 * print elem from main(): 2
 * print elem from main(): 3
 * print elem from main(): 4
 * App ended
 */
public class MultiThreadEx2 {

    public static void main(String[] args) {

        // job 1
        System.out.println("App started");

        // job 2
        MyTask2 myTask = new MyTask2();
        myTask.start();

        // job 3
        IntStream.range(0, 5).forEach(e -> System.out.println("print elem from main(): " + e));

        // job 4
        System.out.println("App ended");
    }

}

// MyTask IS-A Thread
class MyTask2 extends Thread {

    @Override
    public void run() {
        IntStream.range(0, 5).forEach(e -> System.out.println("print elem from MyTask: " + e));
    }
}
