package com.algorithms.functionalprogramming.functional_interfaces.ex2;

public class RunnableEx implements Runnable {
    
    @Override
    public void run() {
    }
    
    public static void main(String[] args) {
        
        approach1();
        approach2();
        
        
        //use anoymous class
        Runnable r1 = new RunnableEx() {
            public void run() {
                System.out.println("Hellow r1");
            }
        };
        
        process(r1);
        
        Runnable r2 = () -> System.out.println("Hellow r2");
        
        process(r2);
        
    }
    
    private static void process(Runnable runnable) {
        runnable.run();
    }
    
    private static void approach2() {
        Thread thread = new Thread(() -> System.out.println("Hello a2"));
        thread.run();
        
    }
    
    private static void approach1() {
        Thread thread = new Thread(new RunnableEx()) {
            public void run() {
                System.out.println("Hello a1");
            }
        };
        
        thread.run();
    }
    
    
    
    
}
