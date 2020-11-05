package com.multithreading;

public class MultiThreadEx5 implements Runnable {

    /**
     * - main method represents main thread
     * - whatever we write inside main() will be executed by main thread
     * - threads always execute the jobs in a sequence
     */
    public static void main(String[] args) {
        Thread thread = new Thread(new MultiThreadEx5());
        thread.start();
    }

    public void run() {
        System.out.println("My Thread");
    }
}
