package com.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedList {

    public static void main(String args[]) {
        List<String> listOfSymbols = new ArrayList<String>();
        listOfSymbols.add("RELIANCE");
        listOfSymbols.add("TATA");
        listOfSymbols.add("TECHMAH");
        listOfSymbols.add("HDFC");
        listOfSymbols.add("ICICI");

        synchronizedList(listOfSymbols);
    }

    public static void synchronizedList(List<String> list) {
        Collections.synchronizedList(list);

        synchronized (list) {
            Iterator<String> myIterator = list.iterator();
            while (myIterator.hasNext()) {
                System.out.println(myIterator.next());
            }
        }
    }
}
