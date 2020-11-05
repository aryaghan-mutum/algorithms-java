package com.multithreading;

import java.util.stream.IntStream;

public class MultiThreadEx3 {

    public static void main(String[] args) {

        // job 1
        System.out.println("App started");

        // job 2
        Runnable runnable = new MyTask3();
        Thread thread = new Thread(runnable);
        thread.start();

        // job 3
        IntStream.range(0, 5).forEach(e -> System.out.println("print elem from main(): " + e));

        // job 4
        System.out.println("App ended");
    }
}

// MyTask IS-A Thread
class MyTask3 extends Thread {

    @Override
    public void run() {
        IntStream.range(0, 5).forEach(e -> System.out.println("print elem from MyTask: " + e));
    }
}
