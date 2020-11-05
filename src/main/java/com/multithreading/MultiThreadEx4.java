package com.multithreading;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.SneakyThrows;

import java.util.stream.IntStream;

/**
 * Output:
 *
 * Starts
 * Ends
 * Printing fileX.pdf 1
 * Printing fileY.pdf 1
 * Printing fileY.pdf 2
 * Printing fileY.pdf 3
 * Printing fileY.pdf 4
 * Printing fileY.pdf 5
 * Printing fileY.pdf 6
 * Printing fileY.pdf 7
 * Printing fileY.pdf 8
 * Printing fileY.pdf 9
 * Printing fileX.pdf 2
 * Printing fileX.pdf 3
 * Printing fileX.pdf 4
 * Printing fileX.pdf 5
 * Printing fileX.pdf 6
 * Printing fileX.pdf 7
 */
public class MultiThreadEx4 {

    public static void main(String[] args) {
        System.out.println("Starts");

        Printer printer = new Printer();
      //  printer.printDoc(10, "anurag");

        MyThread myThread = new MyThread(printer);
        MyThread2 myThread2 = new MyThread2(printer);
        myThread.start();
        myThread2.start();

    //    myThread.join();

        System.out.println("Ends");
    }

}

class Printer {

    public void printDoc(int num, String docName) {
        IntStream.range(1, 10).forEach(i -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Printing " + docName + " " + i);
        });
    }
}

@Getter
@AllArgsConstructor
class MyThread extends Thread {

    private Printer printer;

    @Override
    public void run() {
        synchronized (printer) {
            printer.printDoc(10, "fileX.pdf");
        }
    }
}

@Getter
@AllArgsConstructor
class MyThread2 extends Thread {

    Printer printer;

    @Override
    public void run() {
        printer.printDoc(10, "fileY.pdf");
    }
}


