package com.functiionalprogramming.refactornestedloops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * lst = 1,2,3,4,5
 * def map(lst, fn) {
 * (*2)-> lst
 * return lst
 * }
 * <p>
 * map(lst, *2)
 * <p>
 * return: 2 4 6 8 10
 * <p>
 * <p>
 * lst = [1,2,3] [4,5], [6,7 [8, 9]]]
 * <p>
 * def flatMap(lst, fn) {
 * return lst
 * }
 * <p>
 * result 1,2,3,4,5,6,7,8,9
 */
public class ShipTest {
    
    public static final List<Menus> menusList = Arrays.asList(
            new Menus("specialty_arugula_dessert_menu", 30.33),
            new Menus("basil_dessert_menu", 28.2),
            new Menus("specialty_breakfast", 44.55),
            new Menus("chinese_new_yearmenu", 52.02));
    
    public static void main(String[] args) {
        List<RoyalShip> shipsWithMenusList = Arrays.asList(new RoyalShip("AL", menusList));
        
        getExpensiveMenusImperativeApproach(shipsWithMenusList);
        
        getExpensiveMenusDeclarativeApproach1(shipsWithMenusList);
        getExpensiveMenusDeclarativeApproach2(shipsWithMenusList);
        getExpensiveMenusDeclarativeApproach3(shipsWithMenusList);
        System.out.println("Declarative Approach 4: " + getExpensiveMenusDeclarativeApproach4(shipsWithMenusList));
        
        printMenuStatistics(new RoyalShip("AL", menusList));
    }
    
    /**
     * Imperative Approach:
     * <p>
     * This method is doing 3 things:
     * <p>
     * 1. gets menus by price
     * 2. gets menus Names
     * 3. collects menu names in a list
     * <p>
     * O(n^2)
     */
    public static List<String> getExpensiveMenusImperativeApproach(List<RoyalShip> shipsWithMenusList) {
        
        List<String> menuNamesList = new ArrayList<>();
        
        for (RoyalShip ship : shipsWithMenusList) {  //Big O(n)
            for (Menus menu : ship.getMenusList()) {  //Big O(n)
                if (menu.getMenuPrice() > 40.0) {
                    String menuName = menu.getMenuName();
                    menuNamesList.add(menuName);
                }
            }
        }
        
        System.out.println("Imperative Approach: " + menuNamesList);
        
        return menuNamesList;
    }
    
    /**
     * Declarative Approach 1
     * <p>
     * O(n^2)
     */
    public static List<String> getExpensiveMenusDeclarativeApproach1(List<RoyalShip> shipsWithMenusList) {
        
        List<String> menuNamesList = new ArrayList<>();
        
        shipsWithMenusList.stream()
                .forEach(ship -> ship.getMenus()
                        .forEach(menu -> {
                            
                            if (menu.getMenuPrice() > 40.0) {  //replace with filer();
                                String menuName = menu.getMenuName(); //replace with map();
                                menuNamesList.add(menuName);  //replace with Collections.toList();
                            }
                            
                        }));
        
        System.out.println("Declarative Approach 1: " + menuNamesList);
        
        return menuNamesList;
    }
    
    /**
     * Declarative Approach 2
     * <p>
     * O(n^2)
     */
    public static List<String> getExpensiveMenusDeclarativeApproach2(List<RoyalShip> shipsWithMenusList) {
        
        List<String> menuNamesList = new ArrayList<>();
        
        shipsWithMenusList.stream().forEach(ship -> ship.getMenus() //flatMap();
                .filter(menu -> menu.getMenuPrice() > 40.0)
                .map(menu -> menu.getMenuName())
                .forEach(menu -> menuNamesList.add(menu)));
        
        System.out.println("Declarative Approach 2: " + menuNamesList);
        
        return menuNamesList;
    }
    
    /**
     * Declarative Approach 3:
     */
    public static List<String> getExpensiveMenusDeclarativeApproach3(List<RoyalShip> shipsWithMenusList) {
        List<String> menuNamesList = new ArrayList<>(); //replace toList();
        
        shipsWithMenusList.stream()
                .flatMap(ship -> ship.getMenus())
                .filter(menu -> menu.getMenuPrice() > 40.0)
                .map(menu -> menu.getMenuName())
                .forEach(menu -> menuNamesList.add(menu));
        
        System.out.println("Declarative Approach 3: " + menuNamesList);
        return menuNamesList;
    }
    
    /**
     * Declarative Approach 4:
     * <p>
     * readable?
     * maintainable ?
     * scalable ?
     */
    public static List<String> getExpensiveMenusDeclarativeApproach4(List<RoyalShip> shipsWithMenusList) {
        return shipsWithMenusList.stream()
                .flatMap(ship -> ship.getMenus())
                .filter(menu -> menu.getMenuPrice() > 40.0)
                .map(menu -> menu.getMenuName())
                // .peek(result -> System.out.println("Declarative Approach 4: " + result))
                .collect(Collectors.toList());
    }
    
    public static void printMenuStatistics(RoyalShip royalShipList) {
        IntSummaryStatistics intSummaryStatistics = royalShipList.getMenus().mapToInt(menu -> (int) menu.getMenuPrice()).summaryStatistics();

        System.out.println("Max:" + intSummaryStatistics.getMax());
        System.out.println("Min:" + intSummaryStatistics.getMin());
        System.out.println("Avg:" + intSummaryStatistics.getAverage());
        System.out.println("Sum:" + intSummaryStatistics.getSum());
        
    }
}
