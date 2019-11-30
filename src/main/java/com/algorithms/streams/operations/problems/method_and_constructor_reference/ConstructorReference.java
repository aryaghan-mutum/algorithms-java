package com.algorithms.streams.operations.problems.method_and_constructor_reference;


/**
 * Functional Interface:
 */
interface FuncInterface {
    
    Ships ship(String name, Integer weight);
    
    
    final class Ships {
        
        private String name;
        private Integer passengerSize;
        
        Ships(String name, Integer passengerSize) {
            this.name = name;
            this.passengerSize = passengerSize;
        }
        
        @Override
        public String toString() {
            return "Country{" +
                    ", name='" + name + '\'' +
                    ", weight=" + passengerSize +
                    '}';
        }
    }
    
    class ConstructorReference {
        
        static void createInstance() {
        }
        
        public static void main(String[] args) {
            
            System.out.println("APPROACH 1:");
            
            // print AL info
            Ships alShip = new Ships("Allure of the Seas", 5000);
            System.out.println(alShip.toString());
            
            // print AD info
            Ships adShip = new Ships("Adventure of the seas", 3000);
            System.out.println(adShip.toString());
    
    
            ////////////////////////////////////////////////////////////////////////////
            
            System.out.println("APPROACH 2:");
            
            FuncInterface ship = Ships::new;
            
            Ships al = ship.ship("Allure of the Seas", 10000);
            System.out.println(al.toString());
            
            Ships ad = ship.ship("Adventure of the seas", 10000);
            System.out.println(ad.toString());
            
        }
    }
    
    
}
