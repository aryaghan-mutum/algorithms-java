package com.functiionalprogramming.lambdaexamples.ex1;

import java.io.File;
import java.io.FileFilter;
import static java.lang.System.out;

public class LambdasAsFirstClassCitizens {
    
    public static void main(String[] args) {
       
        //a1
        File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return false;
            }
        });
        
        //a2
        File[] hiddenFiles2 = new File(".").listFiles(x -> x.isHidden());
        out.println();
    }
}
