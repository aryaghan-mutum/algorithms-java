package com.algorithms.functionalprogramming.lambda_examples;

/**
 * @author Anurag Muthyam
 */

public class LambdaExpressions {
    
    interface Game {
        
        void play();
    }
    
    interface Series {
        
        void play(String type);
    }
    
    public static void main(String[] args) {
        
        withoutUsingLambdaExpressions();
        withUsingLambdaExpressions();
    }
    
    private static void withoutUsingLambdaExpressions() {
        Game footBall = new Game() {
            public void play() {
                System.out.println("I am playing football");
            }
        };
        
        footBall.play();
        
        Game cricket = new Game() {
            public void play() {
                System.out.println("I am playing Cricket");
            }
        };
        
        cricket.play();
    }
    
    private static void withUsingLambdaExpressions() {
        Game footballLambda = () -> System.out.println("I am playing football");
        footballLambda.play();
        
        Series odiSeries = (type) -> System.out.println("This is an odi series");
        odiSeries.play("ODI");
    }
    
    
}
