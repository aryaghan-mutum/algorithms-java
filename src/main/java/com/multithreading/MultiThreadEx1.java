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
public class MultiThreadEx1 implements Runnable {

    public static void main(String[] args) {

        // job 1
        System.out.println("App started");

        // job 2
        MyTask myTask = new MyTask();
        myTask.executeTask();

        /**
         * Note: Till job2 is not finished, below written jobs are waiting and are not executed
         * In case Job2 is a long running operation, i.e: several stuff are supposed to be printed
         */

        // job 3
        IntStream.range(0, 5).forEach(e -> System.out.println("print elem from main(): " + e));

        // job 4
        System.out.println("App ended");
    }

    @Override
    public void run() {
        System.out.println("");
    }
}

// MyTask IS-A Thread
class MyTask {
    public void executeTask() {
        IntStream.range(0, 5)
                .forEach(e -> System.out.println("print elem from MyTask: " + e));
    }
}
