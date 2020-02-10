package com.algorithms.functionalprogramming.stream_examples.optional;

import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import java.util.Optional;

public class OptionalEx4 {
    
    //outer
    class A {
        private B b;
        
        public B getB() {
            return b;
        }
    }
    
    //inner
    class B {
        private C c;
        
        public C getC() {
            return c;
        }
    }
    
    class C {
        private String d;
        
        public String getD() {
            return d;
        }
    }
    
    @Test
    public void test1() {
        A outer = new A();
        
        if(outer != null && outer.getB() != null && outer.getB().getC() != null) {
            out.println(outer.getB().getC().getD());
        }
    }
    
    @Test
    public void test2() {
        Optional.of(new A())
                .map(a -> a.getB())
                .map(B::getC)
                .map(C::getD)
                .ifPresent(out::println);
    }
    

}
