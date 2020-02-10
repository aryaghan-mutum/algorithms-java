package com.algorithms.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class ListFilesInDirectory {
    
    public static void main(String[] args) throws IOException {
        findFilesInDir();
    }
    
    public static void findFilesInDir() throws IOException {
        Files.list(Paths.get("/Users/anuragmuthyam/Documents/dev/JavaProject"))
                .filter(Files::isDirectory)
                .forEach(System.out::println);
    }
    
    public static void stop(ExecutorService executor) {
        try {
            executor.shutdown();
            executor.awaitTermination(60, TimeUnit.SECONDS);
        }
        catch (InterruptedException e) {
            System.err.println("termination interrupted");
        }
        finally {
            if (!executor.isTerminated()) {
                System.err.println("killing non-finished tasks");
            }
            executor.shutdownNow();
        }
    }
    
}
