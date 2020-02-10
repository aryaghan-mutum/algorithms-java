package com.algorithms.functionalprogramming.lambda_examples.reusing_lambda;

import java.util.List;
import java.util.function.Predicate;
import static java.lang.System.out;

import static java.util.Arrays.asList;

public class ReuseLambdaExpressionsWithLexicalScopingEx2 {
    
    public static final List<String> flowersList1 = asList(new String[]{"angelonia", "snapdragon", "laceleaf", "primrose", "hollyhock", "cyclamen"});
    public static final List<String> flowersList2 = asList(new String[]{"sun flower", "larkspur", "pansy", "anemone", "snowdrop", "peony"});
    public static final List<String> flowersList3 = asList(new String[]{"lily", "amaranth", "crown imperial", "lavender", "amaryllis", "honeysuckle"});
    
    public static void main(String[] args) {
        new ReuseLambdaExpressionsWithLexicalScopingEx2().reusingLambdaExpressionsWithLexicalScopingForStrings();
    }
    
    /**
     * The method takes any alphabet and checks if the flower starts with a certain alphabet
     */
    private static Predicate<String> verifyIfTheFlowerNameStartsWith(String alphabet) {
        return flower -> flower.startsWith(alphabet);
    }
    
    /**
     * Reusing the code:
     * The method prints the count of flowers that starts with any letter based on users input for the three different lists
     */
    private ReuseLambdaExpressionsWithLexicalScopingEx2 reusingLambdaExpressionsWithLexicalScopingForStrings() {
        
        out.println("Approach 3: Flower list 1 Count alphabet 'a': " + flowersList1
                .stream()
                .filter(verifyIfTheFlowerNameStartsWith("a"))
                .count());
        
        out.println("Approach 3: Flower list 2 Count for alphabet 'p': " + flowersList2
                .stream()
                .filter(verifyIfTheFlowerNameStartsWith("p"))
                .count());
        
        out.println("Approach 3: Flower list 3 Count for alphabet 'l': " + flowersList3
                .stream()
                .filter(verifyIfTheFlowerNameStartsWith("l"))
                .count());
        return this;
    }
    
}
